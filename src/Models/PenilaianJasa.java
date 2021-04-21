/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
/**
 *
 * @author COMPUTER SHOP
 */
public class PenilaianJasa {
    private String idPenilaianJasa, idTransaksi, idJasa, idPengguna, penilaianPengguna;

    public PenilaianJasa(String idPenilaianJasa, String idTransaksi, String idJasa, String idPengguna, String penilaianPengguna) {
        this.idPenilaianJasa = idPenilaianJasa;
        this.idTransaksi = idTransaksi;
        this.idJasa = idJasa;
        this.idPengguna = idPengguna;
    }

    public String getIdPenilaianJasa() {
        return idPenilaianJasa;
    }

    public void setIdPenilaianJasa(String idPenilaianJasa) {
        this.idPenilaianJasa = idPenilaianJasa;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getIdJasa() {
        return idJasa;
    }

    public void setIdJasa(String idJasa) {
        this.idJasa = idJasa;
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getPenilaianPengguna() {
        return penilaianPengguna;
    }

    public void setPenilaianPengguna(String penilaianPengguna) {
        this.penilaianPengguna = penilaianPengguna;
    }
    
    
}
