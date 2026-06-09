public class GiftVoucher implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran menggunakan voucher kado sebesar " + amount);
    }
}