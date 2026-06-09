public class OvoPayment implements PaymentMethod, Refundable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran menggunakan saldo OVO sebesar " + amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Mengembalikan dana ke akun OVO sebesar " + amount);
    }
}