public class KeretaApi implements InformasiPerjalanan { // ini SRP karena hanya mengelola data kereta api saja
    private String namaKereta;//LSP
    private String kodeKereta;
    private String rute;
    private int kapasitas;

    public KeretaApi(String namaKereta, String kodeKereta, String rute, int kapasitas) {
        this.namaKereta = namaKereta;
        this.kodeKereta = kodeKereta;
        this.rute = rute;
        this.kapasitas = kapasitas;
    }

    @Override
    public String getNamaKendaraan() {
        return namaKereta;
    }

    @Override
    public String getKodeKendaraan() {
        return kodeKereta;
    }

    @Override
    public String getRutePerjalanan() {
        return rute;
    }

    @Override
    public int getSisaKapasitas() {
        return kapasitas;
    }

    @Override
    public void perbaruiKapasitas(int kuotaBaru) {
        this.kapasitas = kuotaBaru;
    }
}