interface FineKalku {
    double hitungDenda(int hariTerlambat);
}

class DendaStandar implements FineKalku {
    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * 5000;
    }
}

interface FormatterStruk {
    String formatStruk(String namaAnggota, double denda);
}

class StrukTeks implements FormatterStruk {
    @Override
    public String formatStruk(String namaAnggota, double denda) {
        return "Nama Anggota: " + namaAnggota + ", Denda: Rp" + denda;
    }
}

class BookSearchService {
    public void cariBuku(String judul) {
        System.out.println("Mencari buku: " + judul);
    }
}

class BorrowService {
    public void pinjamBuku(String idAnggota, String idBuku) {
        System.out.println("Buku berhasil dipinjam");
    }
}

class LibraryManager {
    private FineKalku fineKalku;
    private FormatterStruk formatterStruk;

    public LibraryManager(FineKalku fineKalku, FormatterStruk formatterStruk) {
        this.fineKalku = fineKalku;
        this.formatterStruk = formatterStruk;
    }

    public double hitungDenda(int hariTerlambat) {
        return fineKalku.hitungDenda(hariTerlambat);
    }

    public String cetakStruk(String namaAnggota, double denda) {
        return formatterStruk.formatStruk(namaAnggota, denda);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        FineKalku kalku = new DendaStandar();
        FormatterStruk struk = new StrukTeks();

        LibraryManager manager = new LibraryManager(kalku, struk);

        double denda = manager.hitungDenda(3);

        System.out.println(manager.cetakStruk("Intan", denda));
    }
}