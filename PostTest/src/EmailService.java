public class EmailService implements UserNotifier {
    @Override
    public void sendNotification(String target, String message) {
        System.out.println("Mengirim email ke " + target + " dengan pesan " + message);
    }
}