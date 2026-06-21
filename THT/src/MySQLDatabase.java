public class MySQLDatabase implements Database {
    @Override
    public void simpanData(String data) {
        System.out.println("Data disimpan ke MySQL : " + data);
    }
}
