package flashlaundry;
/*
 * @author dzakwandh
 */
public class Pengguna {
    private int idPengguna;
    private String username;
    private String noHP;
    private String alamatPengguna;
    private String email;
    private String kataSandi;

    public Pengguna(int idPengguna, String username, String noHP, String alamatPengguna, String email, String kataSandi) {
        this.idPengguna = idPengguna;
        this.username = username;
        this.noHP = noHP;
        this.alamatPengguna = alamatPengguna;
        this.email = email;
        this.kataSandi = kataSandi;
    }

    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getAlamatPengguna() {
        return alamatPengguna;
    }

    public void setAlamatPengguna(String alamatPengguna) {
        this.alamatPengguna = alamatPengguna;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKataSandi() {
        return kataSandi;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }
}
