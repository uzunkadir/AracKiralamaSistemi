
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MusteriIslemleri {
    public static Connection con      = null;
    public static Statement statement = null;
    public static PreparedStatement preparedStatement  = null;
    public  String sorguArac = "Select * From araclar where Sahibi=''";
    public  String sorguKisi = "Select * From musteriler where username = ? and password = ?";
    

    public String aracTeslimEt(){
        try {
            String sorgu = "Select * From araclar where Sahibi="+"'"+GirisEkrani.kullanici_adi+"'";
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            rs.next();
            String kiraArac = rs.getString("MarkaModel");
            return kiraArac;
            
        } catch (Exception e) {
            return "";
        }
    }
    
    public ArrayList<Arac> araclarıGetir(String sorgu){
        ArrayList<Arac> cikti = new ArrayList<Arac>();
        
        try {
            statement    = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()){
                int id            = rs.getInt("id");
                String Sahibi     = rs.getString("Sahibi");
                int fiyat         = rs.getInt("GünlükFiyat_TL");
                String sehir      = rs.getString("Şehir");
                String markaModel = rs.getString("MarkaModel");
                String vitesTipi  = rs.getString("VitesTipi");
                String yakitTipi  = rs.getString("YakıtTipi");
                
                cikti.add(new Arac(id,Sahibi,fiyat,sehir,markaModel,vitesTipi,yakitTipi));
            }
            
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(MusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public boolean girisYap(String kullanici_adi, String parola){
        
        try {
            preparedStatement = con.prepareStatement(this.sorguKisi);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(MusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    
    public MusteriIslemleri(){

        String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+"?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı...");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Baglanti.kullanici_adi, Baglanti.parola);
            System.out.println("Bağlantı Başarılı...");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
        }
    }
        
}
