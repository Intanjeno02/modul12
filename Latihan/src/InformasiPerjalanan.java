public interface InformasiPerjalanan { //ini OCP karena jika ada jenis kendaraan baru, kita tidak perlu mengubah kode yang sudah ada, cukup menambahkan kelas baru yang mengimplementasikan interface ini
    String getNamaKendaraan();
    String getKodeKendaraan();
    String getRutePerjalanan();
    int getSisaKapasitas();
    void perbaruiKapasitas(int jumlah); // LSP
}

// kelas keturunan harus bisa menggantikan posisi induknya tanpa nimbulin eror.
// kelas KeretaApi itu bagian dari InformasiPerjalanan dan meminta kontrak fungsi lewat perbaruiKapasitas(int jumlah), jadi kita bisa menggunakan KeretaApi dimana saja kita menggunakan InformasiPerjalanan tanpa khawatir akan terjadi eror karena KeretaApi sudah memenuhi kontrak yang diminta oleh InformasiPerjalanan.