public class OrderService {
    private PaymentMethod paymentMethod;
    private UserNotifier userNotifier;

    public OrderService(PaymentMethod paymentMethod, UserNotifier userNotifier) {
        this.paymentMethod = paymentMethod;
        this.userNotifier = userNotifier;
    }

    public void placeOrder(String itemName, double price, String customerEmail) {
        System.out.println("Memulai pemrosesan pesanan untuk barang " + itemName);
        
        paymentMethod.processPayment(price);
        
        String infoMessage = "Pesanan anda untuk " + itemName + " telah berhasil diproses.";
        userNotifier.sendNotification(customerEmail, infoMessage);
        System.out.println("Pemrosesan pesanan selesai dijalankan.");
    }
}