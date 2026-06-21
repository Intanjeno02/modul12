public class KRSService {
    private Database database;
    public KRSService(Database database) {
        this.database = database;
    }

    public void simpanKRS(String data) {
        database.simpanData(data);
    }
}
