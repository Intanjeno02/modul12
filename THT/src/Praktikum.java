public class Praktikum implements MataKuliah, LabCourse {
    @Override
    public void tampilkanInfo() {
        System.out.println("Mata Kuliah Praktikum");
    }

    @Override
    public void alokasiAsistenLab() {
        System.out.println("Mengalokasikan asisten lab");
    }

    @Override
    public void cekPeralatanPraktikum() {
        System.out.println("Mengecek alat praktikum");
    }
}
