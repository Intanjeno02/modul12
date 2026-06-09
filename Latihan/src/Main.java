import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        RepositoriKereta repo = new RepositoriKereta();
        ValidatorPenumpang validator = new ValidatorPenumpang();
        PenyajiTampilan penyaji = new PenyajiTampilan();
        
        LayananPemesanan layanan = new LayananPemesanan(repo, repo, validator, penyaji);
        boolean berjalan = true;

        while (berjalan) {
            try {
                System.out.println("MENU UTAMA");
                System.out.println("1 Lihat Jadwal");
                System.out.println("2 Pesan Tiket");
                System.out.println("3 Keluar Aplikasi");
                System.out.print("Pilih Menu : ");

                int pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        layanan.tampilkanJadwal();
                        break;
                    case 2:
                        System.out.print("Masukkan Kode Kereta : ");
                        String kode = input.nextLine();
                        System.out.print("Masukkan Nomor Identitas : ");
                        String nik = input.nextLine();
                        System.out.print("Masukkan Nama Lengkap : ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan Jumlah Tiket : ");
                        int jumlah = input.nextInt();
                        input.nextLine();

                        layanan.prosesPemesanan(kode, nik, nama, jumlah);
                        break;
                    case 3:
                        berjalan = false;
                        break;
                    default:
                        System.out.println("Pilihan menu tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan Input harus berupa angka.");
                input.nextLine();
            } catch (DataPenumpangTidakValidException e) {
                System.out.println("Kesalahan Data Penumpang : " + e.getMessage());
            } catch (RuteTidakDitemukanException e) {
                System.out.println("Kesalahan Rute Perjalanan : " + e.getMessage());
            } catch (TiketHabisException e) {
                System.out.println("Kesalahan Ketersediaan Tiket : " + e.getMessage());
            } finally {
                System.out.println("Proses transaksi selesai.");
            }
        }
        input.close();
    }
}