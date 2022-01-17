
public class Kisi {
    private int id;
    private String username;
    private String email;
    private String telNo;
    private String parola;

    public Kisi(int id, String username, String email, String telNo, String parola) {
        this.id       = id;
        this.username = username;
        this.email    = email;
        this.telNo    = telNo;
        this.parola   = parola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    

}
