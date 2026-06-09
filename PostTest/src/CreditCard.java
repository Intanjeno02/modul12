public class CreditCard implements PaymentMethod, Refundable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran kartu kredit sebesar " + amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Mengembalikan dana kartu kredit sebesar " + amount);
    }
}