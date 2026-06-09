public class BankTransfer implements PaymentMethod, Refundable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran melalui transfer bank reguler sebesar " + amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Mengembalikan dana ke rekening bank sebesar " + amount);
    }
}