public class LayananPemesanan { // ini OCP karena variabel yang digunakan untuk memproses transaksi tidak lagi mengunci mati pada tipe kelas konkret KeretaApi, melainkan menggunakan tipe antarmuka InformasiPerjalanan.
    private PembacaData pembaca;
    private PengubahData pengubah;
    private ValidatorPenumpang validator;
    private PenyajiTampilan penyaji; // dependency injection, kita injeksi lewat constructor, jadi kita bisa ganti implementasi penyaji tampilan tanpa harus mengubah kode di dalam layanan pemesanan

    public LayananPemesanan(PembacaData pembaca, PengubahData pengubah, ValidatorPenumpang validator, PenyajiTampilan penyaji) {
        this.pembaca = pembaca;
        this.pengubah = pengubah;
        this.validator = validator;
        this.penyaji = penyaji;
    }

    public void tampilkanJadwal() {
        for (InformasiPerjalanan kereta : pembaca.ambilSemuaData()) {
            penyaji.cetakJadwalKereta(kereta);
        }
    }

    public void prosesPemesanan(String kode, String nik, String nama, int jumlahTiket) 
        throws RuteTidakDitemukanException, TiketHabisException, DataPenumpangTidakValidException {
        validator.validasiNik(nik);
        
        InformasiPerjalanan keretaDitemukan = pembaca.cariBerdasarkanKode(kode);
        if (keretaDitemukan == null) {
        throw new RuteTidakDitemukanException("Kode kereta tidak ditemukan.");
        }
        
        if (jumlahTiket > keretaDitemukan.getSisaKapasitas()) {
        throw new TiketHabisException(keretaDitemukan.getNamaKendaraan(), keretaDitemukan.getSisaKapasitas());
        }
        
        pengubah.kurangiKursi(kode, jumlahTiket);
        penyaji.cetakStrukSukses(nama, nik, jumlahTiket);
    }
}

// DIP
// kelas layanan pemesanan ini bertanggung jawab untuk memproses pemesanan tiket, tapi dia ga perlu tau detail tentang 
// bagaimana data kereta disimpan atau bagaimana tampilan jadwal kereta ditampilkan, jadi dia hanya bergantung pada 
// abstraksi (interface) yang sudah disediakan, sehingga jika ada perubahan pada implementasi penyimpanan data atau 
// penyajian tampilan, kita ga perlu mengubah kode di dalam layanan pemesanan ini.