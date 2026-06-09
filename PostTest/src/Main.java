public class Main {
    public static void main(String[] args) {
        UserNotifier emailService = new EmailService();
        
        System.out.println("Simulasi Transaksi 1:");
        PaymentMethod bankOption = new BankTransfer();
        OrderService orderOne = new OrderService(bankOption, emailService);
        orderOne.placeOrder("Kulkas 2 Pintu", 35550000.0, "talita@email.com");
        
        System.out.println("Simulasi Transaksi 2:");
        PaymentMethod ovoOption = new OvoPayment();
        OrderService orderTwo = new OrderService(ovoOption, emailService);
        orderTwo.placeOrder("Iphone 17 Pro Max", 23000000.0, "talita@email.com");
        
        System.out.println("Simulasi Transaksi 3:");
        PaymentMethod voucherOption = new GiftVoucher();
        OrderService orderThree = new OrderService(voucherOption, emailService);
        orderThree.placeOrder("Tas luipitong", 56000000.0, "talita@email.com");
    }
}