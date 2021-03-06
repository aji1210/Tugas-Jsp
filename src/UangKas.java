/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.kas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.awt.event.KeyEvent;
import java.sql.Date;
/**
 *
 * @author muham
 */
public class UangKas extends javax.swing.JFrame {
private Connection con;
    private Statement stat;
    private ResultSet res;
    private String t, keterangan;
    private DefaultTableModel dtm;
    /**
     * Creates new form UangKas
     */
    public UangKas() {
        initComponents(); setTitle("LAPORAN UANGKAS");
        koneksi ();
        kosongkan ();
        tabel ();
        //rata kiri dan kanan
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
           (screenSize.width - frameSize.width) / 3,
           (screenSize.height - frameSize.height) /4);
    }
    private void koneksi (){
    try {
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/aplikasikelas", "root", "");
         stat=con.createStatement();
         } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);}   
    }
    private void kosongkan(){
     fajri_no.setText("");
     fajri_tanggal.setDate(null);
     fajri_nama.setText("");
     fajri_keterangan.setText("");
     fajri_pembayaran.setText("");
     fajri_pengeluaran.setText("");
     fajri_saldoakhir.setText("");
     pembayaran.setSelected(false);
     pengeluaran.setSelected(false);
     chika_no.requestFocus();
    }
     private void tabel (){
        DefaultTableModel t= new DefaultTableModel();
        t.addColumn("No");
        t.addColumn("Tanggal");
        t.addColumn("Nama");
        t.addColumn("Pemasukan");
        t.addColumn("Pengeluaran");
        t.addColumn("SaldoAkhir");
        t.addColumn("Keterangan");
        chika_table.setModel(t); try{ res= stat.executeQuery("select * from uangkas");
    while (res.next()) {
    t.addRow(new Object[]{ 
      res.getString("No"),
      res.getString("Tanggal"),
      res.getString("Nama"),
      res.getString("Pemasukan"),
      res.getString("Pengeluaran"),
      res.getString("SaldoAkhir"),
      res.getString("Keterangan")
        });}
}catch (Exception e) {
    JOptionPane.showMessageDialog(rootPane, e);}    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fajri_no = new javax.swing.JTextField();
        pembayaran = new javax.swing.JCheckBox();
        pengeluaran = new javax.swing.JCheckBox();
        fajri_lihat = new javax.swing.JButton();
        fajri_edit = new javax.swing.JButton();
        fajri_simpan = new javax.swing.JButton();
        fajri_clear = new javax.swing.JButton();
        fajri_hapus = new javax.swing.JButton();
        fajri_search = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fajri_nama = new javax.swing.JTextField();
        fajri_keterangan = new javax.swing.JTextField();
        fajri_tanggal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        UANGKAS = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fajri_pembayaran = new javax.swing.JTextField();
        fajri_pengeluaran = new javax.swing.JTextField();
        fajri_saldoakhir = new javax.swing.JTextField();
        fajri_menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setText("NO");

        jLabel3.setText("TANGGAL");

        jLabel4.setText("NAMA");

        jLabel5.setText("KETERANGAN");

        fajri_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajri_noActionPerformed(evt);
            }
        });

        pembayaran.setText("Pembayaran");
        pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayaranActionPerformed(evt);
            }
        });

        pengeluaran.setText("Pengeluaran");
        pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengeluaranActionPerformed(evt);
            }
        });

        fajri_lihat.setText("Lihat");
        fajri_lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajri_lihatActionPerformed(evt);
            }
        });

        fajri_edit.setText("EDIT");
        fajri_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajri_editActionPerformed(evt);
            }
        });

        fajri_simpan.setText("SIMPAN");
        fajri_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajri_simpanActionPerformed(evt);
            }
        });

        fajri_clear.setText("CLEAR");
        fajri_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajri_clearActionPerformed(evt);
            }
        });

        fajri_hapus.setText("HAPUS");

        fajri_search.setText("SEARCH");
        fajri_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajri_searchActionPerformed(evt);
            }
        });

        jLabel6.setText("Saldo akhir");

        jLabel7.setText("Uang Kas/2Minggu Rp:");

        jLabel8.setText("Rp:");

        jLabel9.setText("Rp");

        fajri_pembayaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fajri_pembayaranKeyTyped(evt);
            }
        });

        fajri_pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajri_pengeluaranActionPerformed(evt);
            }
        });

        fajri_saldoakhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajri_saldoakhirActionPerformed(evt);
            }
        });

        fajri_menu.setText("MENU");
        fajri_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fajri_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fajri_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fajri_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fajri_no, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fajri_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UANGKAS, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(pembayaran)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fajri_pembayaran))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(pengeluaran)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fajri_pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(fajri_lihat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fajri_saldoakhir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(fajri_menu))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(fajri_edit)
                                .addGap(35, 35, 35)
                                .addComponent(fajri_simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(fajri_clear)))
                        .addGap(30, 30, 30)
                        .addComponent(fajri_hapus)
                        .addGap(34, 34, 34)
                        .addComponent(fajri_search)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fajri_no, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pembayaran)
                    .addComponent(jLabel8)
                    .addComponent(fajri_pembayaran)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fajri_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(pengeluaran)
                    .addComponent(fajri_pengeluaran)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fajri_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fajri_lihat)
                    .addComponent(jLabel6)
                    .addComponent(fajri_saldoakhir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fajri_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(UANGKAS, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fajri_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fajri_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fajri_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fajri_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fajri_search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(fajri_menu)
                .addGap(16, 16, 16))
        );

        jLabel1.setText("LAPORAN KEUANGAN KAS KELAS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fajri_pengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajri_pengeluaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fajri_pengeluaranActionPerformed

    private void fajri_saldoakhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajri_saldoakhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fajri_saldoakhirActionPerformed

    private void fajri_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajri_noActionPerformed
        // TODO add your handling code here:
         try{
            res=stat.executeQuery("select * from uangkas where "+ "No='" + fajri_no.getText()
                +"'" ); while (res.next())
                { fajri_tanggal.setDate (res.getDate("Tanggal"));
                fajri_nama.setText(res.getString("Nama"));
                fajri_pembayaran.setText(res.getString("Pemasukan"));
                fajri_pengeluaran.setText(res.getString("Pengeluaran"));
                fajri_saldoakhir.setText(res.getString("SaldoAkhir"));
                fajri_keterangan.setText(res.getString("Keterangan"));
                }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_fajri_noActionPerformed

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayaranActionPerformed
        // TODO add your handling code here:
        keterangan = "Uang Masuk";
        pengeluaran.setSelected(false);
        chika_keterangan.setText(""+keterangan);
    }//GEN-LAST:event_pembayaranActionPerformed

    private void pengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengeluaranActionPerformed
        // TODO add your handling code here:
         keterangan = "Uang Keluar";
        pembayaran.setSelected(false);
        chika_keterangan.setText(""+keterangan);
    }//GEN-LAST:event_pengeluaranActionPerformed

    private void fajri_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajri_simpanActionPerformed
        // TODO add your handling code here:
         String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm=new SimpleDateFormat(tampilan);
        String Tanggal=String.valueOf(fm.format(fajri_tanggal.getDate()));
        
        try {
         stat.executeUpdate("insert into uangkas values ("
             + "'" + fajri_no.getText()+"',"
             + "'" + Tanggal+"',"
             + "'" + fajri_nama.getText()+"',"
             + "'" + fajri_pembayaran.getText()+"',"
             + "'" + fajri_pengeluaran.getText()+"',"
             + "'" + fajri_saldoakhir.getText()+"',"
             + "'" + fajri_keterangan.getText()+"')");
         kosongkan();
         JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data");
         new UangKas().setVisible(true);
         dispose();
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Gagal Menyimpan Data! : "+e);
        }
    }//GEN-LAST:event_fajri_simpanActionPerformed

    private void fajri_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajri_editActionPerformed
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null,"Apakah yakin ingin mengedit data?","Confirmation",
                JOptionPane.YES_NO_OPTION);
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm=new SimpleDateFormat(tampilan);
        String Tanggal=String.valueOf(fm.format(fajri_tanggal.getDate()));
    try{
    String sql = "update uangkas set No=?,Tanggal=?,Nama=?,Pemasukan=?,Pengeluaran=?,"
            + "SaldoAkhir=?,Keterangan=? where No='"
                    + fajri_no.getText()+"'";
    PreparedStatement st=con.prepareStatement(sql);
    if(ok==0){
    try{
    st.setString(1,fajri_no.getText());
    st.setString(2,Tanggal);
    st.setString(3,fajri_nama.getText());
    st.setString(4,fajri_pembayaran.getText());
    st.setString(5,fajri_pengeluaran.getText());
    st.setString(6,fajri_saldoakhir.getText());
    st.setString(7,fajri_keterangan.getText());
    st.executeUpdate();
    kosongkan();
    JOptionPane.showMessageDialog(null,"Edit Data Sukses");
    new UangKas().setVisible(true);
    dispose();
    }catch (Exception e){
    JOptionPane.showMessageDialog(null, "Edit Data Gagal");}}
    }catch (Exception e){}
    }//GEN-LAST:event_fajri_editActionPerformed

    private void fajri_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajri_clearActionPerformed
        // TODO add your handling code here:
          kosongkan();
    }                                           

    private void chika_hapusActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null,"Apakah yakin ingin menghapus data?","Confirmation",
                JOptionPane.YES_NO_OPTION);
         try{
             String sql="delete from uangkas where No='"+fajri_no.getText()+"'";
             PreparedStatement st=con.prepareStatement (sql);
             st.executeUpdate();
             kosongkan();
             JOptionPane.showMessageDialog(null, "Delete Data Sukses");
             new UangKas().setVisible(true);
             dispose();
         } catch (Exception e)
         {
             JOptionPane.showMessageDialog(null, "Delete Data Gagal");
         }
         
    }//GEN-LAST:event_fajri_clearActionPerformed

    private void fajri_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajri_searchActionPerformed
        // TODO add your handling code here:
         try {
    res=stat.executeQuery("select * from uangkas where "+ "No='" +fajri_no.getText()
    +"'" ); while (res.next())
    { chika_tanggal.setDate(res.getDate("Tanggal"));
      chika_nama.setText(res.getString("Nama"));
      chika_pembayaran.setText(res.getString("Pemasukan"));
      chika_pengeluaran.setText(res.getString("Pengeluaran"));
      chika_saldoakhir.setText(res.getString("SaldoAkhir"));
      chika_keterangan.setText(res.getString("Keterangan"));
    }
}catch (Exception e) {
JOptionPane.showMessageDialog(rootPane, e);
}
    }//GEN-LAST:event_fajri_searchActionPerformed

    private void fajri_lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajri_lihatActionPerformed
        // TODO add your handling code here:
        new TableMahasiswa().setVisible(true);
        dispose();
    }                                           

    private void chika_menuActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        new MenuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_fajri_lihatActionPerformed

    private void fajri_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fajri_menuActionPerformed
        // TODO add your handling code here:
         new MenuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_fajri_menuActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
           int i = fajri_table.getSelectedRow();
    if(i==-1){
    return;
    }
    String code = (String)fajri_table.getValueAt(i,0);
    String code1 = (String)fajri_table.getValueAt(i,1);
    String code2 = (String)fajri_table.getValueAt(i,2);
    String code3 = (String)fajri_table.getValueAt(i,3);
    String code4 = (String)fajri_table.getValueAt(i,4);
    String code5 = (String)fajri_table.getValueAt(i,5);
    String code6 = (String)fajri_table.getValueAt(i,6);
    
    fajri_no.setText(code);
    fajri_tanggal.setDateFormatString(code1);
    fajri_nama.setText(code2);
    fajri_pembayaran.setText(code3);
    fajri_pengeluaran.setText(code4);
    fajri_saldoakhir.setText(code5);
    fajri_keterangan.setText(code6);
    }//GEN-LAST:event_jTable1MouseClicked

    private void fajri_pembayaranKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fajri_pembayaranKeyTyped
        // TODO add your handling code here:
        char fajri=evt.getKeyChar();
        if(!(Character.isDigit(chika)))
        {
            evt.consume();
        }
    }                                         

    private void fajri_pengeluaranKeyTyped(java.awt.event.KeyEvent evt) {                                           
        // TODO add your handling code here:
        char fajri=evt.getKeyChar();
        if(!(Character.isDigit(chika)))
        {
            evt.consume();
        }
    }                                          

    private void fajri_saldoakhirKeyTyped(java.awt.event.KeyEvent evt) {                                          
        // TODO add your handling code here:
        char fajri=evt.getKeyChar();
        if(!(Character.isDigit(chika)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_fajri_pembayaranKeyTyped
 private void fajri_noKeyTyped(java.awt.event.KeyEvent evt) {                                  
        // TODO add your handling code here:
        char fajri=evt.getKeyChar();
        if(!(Character.isDigit(chika)))
        {
            evt.consume();
        }
    }        
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UangKas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UangKas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UangKas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UangKas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UangKas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UANGKAS;
    private javax.swing.JButton fajri_clear;
    private javax.swing.JButton fajri_edit;
    private javax.swing.JButton fajri_hapus;
    private javax.swing.JTextField fajri_keterangan;
    private javax.swing.JButton fajri_lihat;
    private javax.swing.JButton fajri_menu;
    private javax.swing.JTextField fajri_nama;
    private javax.swing.JTextField fajri_no;
    private javax.swing.JTextField fajri_pembayaran;
    private javax.swing.JTextField fajri_pengeluaran;
    private javax.swing.JTextField fajri_saldoakhir;
    private javax.swing.JButton fajri_search;
    private javax.swing.JButton fajri_simpan;
    private javax.swing.JTextField fajri_tanggal;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox pembayaran;
    private javax.swing.JCheckBox pengeluaran;
    // End of variables declaration//GEN-END:variables
}
