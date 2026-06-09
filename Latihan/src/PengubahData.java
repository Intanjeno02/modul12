public interface PengubahData { // ISP
    void kurangiKursi(String kode, int jumlah);
}

// bagian ini hanya punya fungsi buat mengurangi kursi jadi saat kita hanya butuh hak akses buat baca jadwal kereta
// komponen cuman pke pembacadata aja dan ga maksa buat makai interface pengubahdata ini