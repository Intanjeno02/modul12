import java.util.ArrayList;

public interface PembacaData { // ISP
    ArrayList<InformasiPerjalanan> ambilSemuaData();
    InformasiPerjalanan cariBerdasarkanKode(String kode);
}

// awalnya ngambil data sama ngubah data itu digabung, tp karna ISP ini ga boleh maksa class buat bergantung 
// ke fungsi lainnya di dalam interface yg sbnrnya ga di butuhin jdi dibagi 2