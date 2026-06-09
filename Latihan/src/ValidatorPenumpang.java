public class ValidatorPenumpang {
    public void validasiNik(String nik) {
        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("Nomor Induk Kependudukan harus berukuran 16 digit.");
        }
        for (int i = 0; i < nik.length(); i++) {
            char karakter = nik.charAt(i);
            if (karakter < '0' || karakter > '9') {
                throw new DataPenumpangTidakValidException("Nomor Induk Kependudukan hanya boleh berisi angka.");
            }
        }
    }
}