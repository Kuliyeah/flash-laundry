package Table;

import java.util.Date;

/**
 * @author gilan
 */
public class DetailStatus {
    private String idDetailStatus, idTransaksi;
    private Date tanggalStatus;
    private enum status {Jemput, Cuci, Jemur, Setrika, Dikemas, Dikirim}

    public String getIdDetailStatus() {
        return idDetailStatus;
    }

    public void setIdDetailStatus(String idDetailStatus) {
        this.idDetailStatus = idDetailStatus;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Date getTanggalStatus() {
        return tanggalStatus;
    }

    public void setTanggalStatus(Date tanggalStatus) {
        this.tanggalStatus = tanggalStatus;
    }

    public DetailStatus(String idDetailStatus, String idTransaksi, Date tanggalStatus) {
        this.idDetailStatus = idDetailStatus;
        this.idTransaksi = idTransaksi;
        this.tanggalStatus = tanggalStatus;
    }

    
    
}
