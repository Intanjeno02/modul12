public class PenyajiTampilan { // ini SRP karena hanya bertanggung jawab untuk menampilkan informasi kepada pengguna
    public void cetakJadwalKereta(InformasiPerjalanan kereta) {
        System.out.println("Nama Kereta : " + kereta.getNamaKendaraan());
        System.out.println("Kode        : " + kereta.getKodeKendaraan());
        System.out.println("Rute        : " + kereta.getRutePerjalanan());
        System.out.println("Sisa Kursi  : " + kereta.getSisaKapasitas());
    }

    public void cetakStrukSukses(String nama, String nik, int jumlahTiket) {
        System.out.println("PEMESANAN TIKET BERHASIL");
        System.out.println("Nama Penumpang : " + nama);
        System.out.println("Nomor Identitas : " + nik);
        System.out.println("Jumlah Tiket : " + jumlahTiket);
    }
}