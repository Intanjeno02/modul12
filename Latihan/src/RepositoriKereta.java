import java.util.ArrayList;

public class RepositoriKereta implements PembacaData, PengubahData {
    private ArrayList<InformasiPerjalanan> daftarKereta;

    public RepositoriKereta() { //bukan logika bisnis utama karena ini modul tingkat rendah, tdk emlanggar solid
        daftarKereta = new ArrayList<>();
        daftarKereta.add(new KeretaApi("Argo Bromo", "K01", "JKT - SBY", 50));
        daftarKereta.add(new KeretaApi("Parahyangan", "K02", "JKT - BDG", 15));
    }

    @Override
    public ArrayList<InformasiPerjalanan> ambilSemuaData() {
        return daftarKereta;
    }

    @Override
    public InformasiPerjalanan cariBerdasarkanKode(String kode) {
        for (InformasiPerjalanan kereta : daftarKereta) {
            if (kereta.getKodeKendaraan().equalsIgnoreCase(kode)) {
                return kereta;
            }
        }
        return null;
    }

    @Override
    public void kurangiKursi(String kode, int jumlah) {
        InformasiPerjalanan kereta = cariBerdasarkanKode(kode);
        if (kereta != null) {
            int sisaBaru = kereta.getSisaKapasitas() - jumlah;
            kereta.perbaruiKapasitas(sisaBaru);
        }
    }
}