package Table;
/*
 * @author LENOVO
 */
public class Transaksi {
    private String deskripsiCucian;
    private int idTransaksi, idJasa, idDetailStatus, totalBayar, beratCucian, ongkir, bayar;

    public Transaksi(int idTransaksi, int idJasa, int idDetailStatus, String deskripsiCucian, int beratCucian, int ongkir, int bayar, int totalBayar) {
        this.idTransaksi = idTransaksi;
        this.idJasa = idJasa;
        this.idDetailStatus = idDetailStatus;
        this.deskripsiCucian = deskripsiCucian;
        this.beratCucian = beratCucian;
        this.ongkir = ongkir;
        this.bayar = bayar;
        this.totalBayar = totalBayar;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public int getIdJasa() {
        return idJasa;
    }

    public int getIdDetailStatus() {
        return idDetailStatus;
    }

    public String getDeskripsiCucian() {
        return deskripsiCucian;
    }

    public int getBeratCucian() {
        return beratCucian;
    }

    public int getOngkir() {
        return ongkir;
    }

    public int getBayar() {
        return bayar;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setIdJasa(int idJasa) {
        this.idJasa = idJasa;
    }

    public void setIdDetailStatus(int idDetailStatus) {
        this.idDetailStatus = idDetailStatus;
    }

    public void setDeskripsiCucian(String deskripsiCucian) {
        this.deskripsiCucian = deskripsiCucian;
    }

    public void setBeratCucian(int beratCucian) {
        this.beratCucian = beratCucian;
    }

    public void setOngkir(int ongkir) {
        this.ongkir = ongkir;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }
}