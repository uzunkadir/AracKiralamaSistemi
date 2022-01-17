
public class Arac {
    private int id;
    private String Sahibi;
    private int fiyat;
    private String sehir;
    private String markaModel;
    private String vitesTipi;
    private String yakitTipi;

    public Arac(int id, String Sahibi, int fiyat, String sehir, String markaModel, String vitesTipi, String yakitTipi) {
        this.id     = id;
        this.Sahibi = Sahibi;
        this.fiyat  = fiyat;
        this.sehir  = sehir;
        this.markaModel = markaModel;
        this.vitesTipi  = vitesTipi;
        this.yakitTipi  = yakitTipi;
    }

    public int getId() {
        return id;
    }

    public String getSahibi() {
        return Sahibi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public String getSehir() {
        return sehir;
    }

    public String getMarkaModel() {
        return markaModel;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSahibi(String Sahibi) {
        this.Sahibi = Sahibi;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public void setMarkaModel(String markaModel) {
        this.markaModel = markaModel;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }
    
    
}
