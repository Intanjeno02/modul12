public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Russel", 22); 
        UKTStrategy ukt = new MBKMUKT();
        System.out.println("UKT : " + ukt.hitungUKT(mhs.getSks())
        );

        Database db = new NoSQLDatabase();
        KRSService service = new KRSService(db);
        service.simpanKRS("KRS Semester 4");

        MataKuliah teori = new Teori();
        teori.tampilkanInfo();
        MataKuliah praktikum = new Praktikum();
        praktikum.tampilkanInfo();
    }
}
