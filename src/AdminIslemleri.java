
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminIslemleri extends MusteriIslemleri {
    public String sorgubosArac  = "Select * From araclar where Sahibi=''";
    public String sorgukiraArac = "Select * From araclar where LENGTH(Sahibi)>1";
    public String sorguMusteri  = "Select * From musteriler";
    public String sorguAdmin    = "Select * From adminler ";
    
    public AdminIslemleri() {
        super();
        this.sorguArac = "Select * From araclar";
        this.sorguKisi = "Select * From adminler where username = ? and password = ?";
    }
    
    public void aracEkle(String sahibi,String fiyat,String sehir,String markamodel,String vites,String yakit){
        try {
            String sorguEkle = "Insert Into araclar (Sahibi,GünlükFiyat_TL,Şehir,MarkaModel,VitesTipi,YakıtTipi) VALUES(?,?,?,?,?,?)";
            try {
                preparedStatement = con.prepareStatement(sorguEkle);
            } catch (SQLException ex) {
                Logger.getLogger(AdminIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            preparedStatement.setString(1, sahibi);
            preparedStatement.setString(2, fiyat);
            preparedStatement.setString(3, sehir);
            preparedStatement.setString(4, markamodel);
            preparedStatement.setString(5, vites);
            preparedStatement.setString(6, yakit);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    
    public void kullaniciEkle(String adsoyad, String email,String telno,String guvenlikSorusu,String guvenlikCevabi,String parola ){
        try {
            String sorgukullaniciEkle = "Insert Into musteriler (username,email,telno,guvenlikSorusu,guvenlikCevabi,password) VALUES(?,?,?,?,?,?)";
            
            try {
                preparedStatement = con.prepareStatement(sorgukullaniciEkle);
            } catch (SQLException ex) {
                Logger.getLogger(AdminIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }

            preparedStatement.setString(1, adsoyad);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, telno);
            preparedStatement.setString(4, guvenlikSorusu);
            preparedStatement.setString(5, guvenlikCevabi);
            preparedStatement.setString(6, parola);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AdminIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void musteriGuncelle(int id,String username,String email, String telno){
        try {
            String sorgu = "Update musteriler set username=?,email=?,telno=? where id=?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, telno);
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void musteriSil(int id){
        try {
            String sorgu = "Delete from musteriler where id=?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
       
    public ArrayList<Kisi> kullaniciGetir(String sorgu){
        ArrayList<Kisi> cikti = new ArrayList<Kisi>();
        
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
  
            while (rs.next()){
                int id           = rs.getInt("id");
                String username  = rs.getString("username");
                String email     = rs.getString("email");
                String telefonNo = rs.getString("telno");
                cikti.add(new Kisi(id,username,email,telefonNo,""));
            }

            return cikti;
            
        } catch (SQLException ex) {
            System.out.println("kullanıcı getirirken hata oldu");
            return null;
        }
    }    

}
