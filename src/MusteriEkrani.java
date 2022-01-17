
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author kadir
 */

public class MusteriEkrani extends javax.swing.JDialog {
    DefaultTableModel aracTablosuModel;
    MusteriIslemleri musteriIslemleri = new MusteriIslemleri();

    //String kiraArac = musteriIslemleri.kiraAracGetir();
    
    /**
     * Creates new form MusteriEkrani
     */
    public MusteriEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        aracTablosuModel =(DefaultTableModel) aracTablosu.getModel();
        kullaniciadiLabel.setText(GirisEkrani.kullanici_adi); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        aracTablosu = new javax.swing.JTable();
        aramaCubugu = new javax.swing.JTextField();
        mesajyazisi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        teslimEtButon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kullaniciadiLabel = new javax.swing.JLabel();
        aracKiralaButon = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        markaLabel = new javax.swing.JLabel();
        sehirLabel = new javax.swing.JLabel();
        fiyatLabel = new javax.swing.JLabel();
        vitesTipiLabel = new javax.swing.JLabel();
        yakitTipiLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        toplamTutar = new javax.swing.JLabel();
        teslimTarihi = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        alisTarihi = new com.toedter.calendar.JDateChooser();
        gunSayisiLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        kiralananAracLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sahipAracGosterCheck = new javax.swing.JCheckBox();
        musaitAracGosterCheck = new javax.swing.JCheckBox();
        sahipAracSehir = new javax.swing.JLabel();
        sahipAracMarka = new javax.swing.JLabel();
        sahipAracVites = new javax.swing.JLabel();
        sahipAracYakit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        aracTablosu.setAutoCreateRowSorter(true);
        aracTablosu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        aracTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Günlük Fiyat", "Şehir", "Marka Model", "Vites Tipi", "Yakıt Tipi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        aracTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aracTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(aracTablosu);
        if (aracTablosu.getColumnModel().getColumnCount() > 0) {
            aracTablosu.getColumnModel().getColumn(0).setResizable(false);
            aracTablosu.getColumnModel().getColumn(1).setResizable(false);
            aracTablosu.getColumnModel().getColumn(2).setResizable(false);
            aracTablosu.getColumnModel().getColumn(3).setResizable(false);
            aracTablosu.getColumnModel().getColumn(4).setResizable(false);
            aracTablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        aramaCubugu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        mesajyazisi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajyazisi.setForeground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Dinamik Arama:");

        teslimEtButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teslimEtButon.setText("Seçilen Aracı Teslim Et");
        teslimEtButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teslimEtButonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Kullanıcı Adı    ");

        kullaniciadiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        aracKiralaButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aracKiralaButon.setText("Seçilen Aracı Kirala");
        aracKiralaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracKiralaButonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Şehir");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Günlük Fiyat");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Marka Model");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Vites Tipi");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Yakıt Tipi");

        markaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        sehirLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fiyatLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        vitesTipiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        yakitTipiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Gün Sayısı");

        toplamTutar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        teslimTarihi.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                teslimTarihiPropertyChange(evt);
            }
        });

        jLabel10.setText("Alış Tarihi:");

        jLabel11.setText("Teslim Tarihi:");

        gunSayisiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        kiralananAracLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Şehir");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Marka Model");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Vites Tipi");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Yakıt Tipi");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("ARAÇ TESLİM ET ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("ARAÇ KİRALA");

        sahipAracGosterCheck.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sahipAracGosterCheck.setText("Sahip Olunan Araçları Göster");
        sahipAracGosterCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sahipAracGosterCheckActionPerformed(evt);
            }
        });

        musaitAracGosterCheck.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        musaitAracGosterCheck.setText("Müsait Araçları Göster");
        musaitAracGosterCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musaitAracGosterCheckActionPerformed(evt);
            }
        });

        sahipAracSehir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        sahipAracMarka.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        sahipAracVites.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        sahipAracYakit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(sahipAracSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(sahipAracMarka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(sahipAracVites, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(sahipAracYakit, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(kullaniciadiLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(teslimEtButon))
                                .addGap(185, 185, 185)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mesajyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(markaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vitesTipiLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sehirLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fiyatLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(gunSayisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(toplamTutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(yakitTipiLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                            .addComponent(aracKiralaButon, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(alisTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teslimTarihi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(kiralananAracLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(musaitAracGosterCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sahipAracGosterCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fiyatLabel, markaLabel, sehirLabel, vitesTipiLabel, yakitTipiLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10))
                            .addComponent(kullaniciadiLabel)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teslimTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alisTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(gunSayisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toplamTutar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fiyatLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(4, 4, 4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(sehirLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(markaLabel)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vitesTipiLabel)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(yakitTipiLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aracKiralaButon))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sahipAracSehir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(sahipAracMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(sahipAracVites, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sahipAracYakit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(34, 34, 34)
                                .addComponent(teslimEtButon)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(kiralananAracLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mesajyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sahipAracGosterCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(musaitAracGosterCheck))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, kullaniciadiLabel});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fiyatLabel, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, markaLabel, sehirLabel, vitesTipiLabel, yakitTipiLabel});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(aracTablosuModel);
        aracTablosu.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        String ara = aramaCubugu.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void teslimEtButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teslimEtButonActionPerformed

        try {
            int selectedRow = aracTablosu.getSelectedRow();
            int id = (int)aracTablosuModel.getValueAt(selectedRow, 0);
            String marka = sahipAracMarka.getText();
            String sorgu= "Update araclar set Sahibi='' where id=?";
            PreparedStatement preparedStatement = MusteriIslemleri.con.prepareStatement(sorgu);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            aracGoruntule("Select * From araclar where Sahibi='"+kullaniciadiLabel.getText()+"'");
            mesajyazisi.setText(marka + " aracı teslim edildi.");

        } catch (SQLException ex) {}
    }//GEN-LAST:event_teslimEtButonActionPerformed


    private void aracKiralaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracKiralaButonActionPerformed
        try {
            int selectedRow = aracTablosu.getSelectedRow();
            
            if (gunSayisiLabel.getText().isEmpty()){
                kiralananAracLabel.setText("Lütfen tarih seçiniz.");
            }
            else if (selectedRow==-1 ){
                kiralananAracLabel.setText("Lütfen araç seçiniz.");
            }
            else{
                String fiyat = fiyatLabel.getText();
                String sehir = sehirLabel.getText();
                String marka = markaLabel.getText();
                String vites = vitesTipiLabel.getText();
                String yakit = yakitTipiLabel.getText();
                int id = (int)aracTablosuModel.getValueAt(selectedRow, 0);
                String sorgu= "Update araclar set Sahibi=?,GünlükFiyat_TL=?,Şehir=?,MarkaModel=?,VitesTipi=?,YakıtTipi=?  where id=?";
                PreparedStatement preparedStatement = MusteriIslemleri.con.prepareStatement(sorgu);
                preparedStatement.setString(1,GirisEkrani.kullanici_adi);
                preparedStatement.setString(2,fiyat);
                preparedStatement.setString(3,sehir);
                preparedStatement.setString(4,marka);
                preparedStatement.setString(5,vites);
                preparedStatement.setString(6,yakit);
                preparedStatement.setInt(7,id);
                preparedStatement.executeUpdate();
                aracGoruntule(musteriIslemleri.sorguArac);
                kiralananAracLabel.setText(marka + " aracı kiralandı.");
                //sahipAracLabel.setText(marka);
            }
        } catch (SQLException ex) {}
    }//GEN-LAST:event_aracKiralaButonActionPerformed

    
    private void aracTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aracTablosuMouseClicked
        if (sahipAracGosterCheck.isSelected()){
            int selectedRow = aracTablosu.getSelectedRow();
            sahipAracSehir.setText(aracTablosuModel.getValueAt(selectedRow, 2).toString());
            sahipAracMarka.setText(aracTablosuModel.getValueAt(selectedRow, 3).toString());
            sahipAracVites.setText(aracTablosuModel.getValueAt(selectedRow, 4).toString());
            sahipAracYakit.setText(aracTablosuModel.getValueAt(selectedRow, 5).toString());
        }

        else{
            int selectedRow = aracTablosu.getSelectedRow();
            fiyatLabel.setText(aracTablosuModel.getValueAt(selectedRow, 1).toString());
            sehirLabel.setText(aracTablosuModel.getValueAt(selectedRow, 2).toString());
            markaLabel.setText(aracTablosuModel.getValueAt(selectedRow, 3).toString());
            vitesTipiLabel.setText(aracTablosuModel.getValueAt(selectedRow, 4).toString());
            yakitTipiLabel.setText(aracTablosuModel.getValueAt(selectedRow, 5).toString());

            if (!gunSayisiLabel.getText().isEmpty()){
                int gunint = Integer.valueOf(gunSayisiLabel.getText());
                Double fiyat = gunint*Double.valueOf(fiyatLabel.getText());
                toplamTutar.setText("Toplam Tutar: "+String.valueOf(fiyat)+" TL");
            }
        }
    }//GEN-LAST:event_aracTablosuMouseClicked

    private void teslimTarihiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_teslimTarihiPropertyChange
        if (alisTarihi.getDate() != null){
            Instant start     = alisTarihi.getDate().toInstant();
            Instant end       = teslimTarihi.getDate().toInstant();
            Duration duration = Duration.between(start, end);
            Long gunint = duration.getSeconds()/(60*60*24);
            String gun = Long.toString(gunint);
            gunSayisiLabel.setText(gun);
        }
    }//GEN-LAST:event_teslimTarihiPropertyChange

    private void sahipAracGosterCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sahipAracGosterCheckActionPerformed
        if (sahipAracGosterCheck.isSelected()){
            String sorgu= "Select * From araclar where Sahibi='"+kullaniciadiLabel.getText()+"'";
            aracGoruntule(sorgu);
            musaitAracGosterCheck.setSelected(false);
        }
        else{
            aracTablosuModel.setRowCount(0);
        }
    }//GEN-LAST:event_sahipAracGosterCheckActionPerformed

    private void musaitAracGosterCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musaitAracGosterCheckActionPerformed
        if (musaitAracGosterCheck.isSelected()){
            String sorgu= "Select * From araclar where Sahibi=''";
            aracGoruntule(sorgu);
            sahipAracGosterCheck.setSelected(false);
        } 
        else{
            aracTablosuModel.setRowCount(0);
        }
    }//GEN-LAST:event_musaitAracGosterCheckActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public void aracGoruntule(String sorgu){
        aracTablosuModel.setRowCount(0);
        ArrayList<Arac> araclar = new ArrayList<Arac>();
        araclar = musteriIslemleri.araclarıGetir(sorgu);
        
        if (araclar != null){
            for (Arac arac:araclar ){
                Object[] eklenecek={arac.getId(),
                                    arac.getFiyat(),
                                    arac.getSehir(),
                                    arac.getMarkaModel(),
                                    arac.getVitesTipi(),
                                    arac.getYakitTipi() };
                
                aracTablosuModel.addRow(eklenecek);
            } 
        }
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MusteriEkrani dialog = new MusteriEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser alisTarihi;
    private javax.swing.JButton aracKiralaButon;
    private javax.swing.JTable aracTablosu;
    private javax.swing.JTextField aramaCubugu;
    private javax.swing.JLabel fiyatLabel;
    private javax.swing.JLabel gunSayisiLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kiralananAracLabel;
    private javax.swing.JLabel kullaniciadiLabel;
    private javax.swing.JLabel markaLabel;
    private javax.swing.JLabel mesajyazisi;
    private javax.swing.JCheckBox musaitAracGosterCheck;
    private javax.swing.JCheckBox sahipAracGosterCheck;
    private javax.swing.JLabel sahipAracMarka;
    private javax.swing.JLabel sahipAracSehir;
    private javax.swing.JLabel sahipAracVites;
    private javax.swing.JLabel sahipAracYakit;
    private javax.swing.JLabel sehirLabel;
    private javax.swing.JButton teslimEtButon;
    private com.toedter.calendar.JDateChooser teslimTarihi;
    private javax.swing.JLabel toplamTutar;
    private javax.swing.JLabel vitesTipiLabel;
    private javax.swing.JLabel yakitTipiLabel;
    // End of variables declaration//GEN-END:variables
}