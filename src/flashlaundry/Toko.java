package flashlaundry;

/**
 *
 * @author Lovanto
 */
public class Toko {
    private String idToko, namaToko, deskripsiToko, alamatToko;
    private int totalDisukai, totalJasa;

    public Toko(String idToko, String namaToko, String deskripsiToko, String alamatToko, int totalDisukai, int totalJasa) {
        this.idToko = idToko;
        this.namaToko = namaToko;
        this.deskripsiToko = deskripsiToko;
        this.alamatToko = alamatToko;
        this.totalDisukai = totalDisukai;
        this.totalJasa = totalJasa;
    }

    public String getIdToko() {
        return idToko;
    }

    public void setIdToko(String idToko) {
        this.idToko = idToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getDeskripsiToko() {
        return deskripsiToko;
    }

    public void setDeskripsiToko(String deskripsiToko) {
        this.deskripsiToko = deskripsiToko;
    }

    public String getAlamatToko() {
        return alamatToko;
    }

    public void setAlamatToko(String alamatToko) {
        this.alamatToko = alamatToko;
    }

    public int getTotalDisukai() {
        return totalDisukai;
    }

    public void setTotalDisukai(int totalDisukai) {
        this.totalDisukai = totalDisukai;
    }

    public int getTotalJasa() {
        return totalJasa;
    }

    public void setTotalJasa(int totalJasa) {
        this.totalJasa = totalJasa;
    }
    
    
}