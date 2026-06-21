public class NoSQLDatabase implements Database {
    @Override
    public void simpanData(String data) {
        System.out.println("Data disimpan ke Cloud NoSQL : " + data);
    }
}
