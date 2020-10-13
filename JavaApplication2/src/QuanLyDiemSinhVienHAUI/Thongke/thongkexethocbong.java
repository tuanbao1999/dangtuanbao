/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Thongke;


import QuanLyDiemSinhVienHAUI.Main;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tuan Bao
 */
public class thongkexethocbong extends javax.swing.JFrame {

    ConnectionDerbyDiem db= new ConnectionDerbyDiem();
    private ArrayList<DSSinhVienHocBong> dskq = new ArrayList<DSSinhVienHocBong>();
//    public static ArrayList<DSSinhVienHocBong> items = new ArrayList<DSSinhVienHocBong>();
    private DSSinhVienHocBong ds = new DSSinhVienHocBong();
    public static String hk="10";
    
    /**
     * Creates new form thongkexethocbong
     */
    public thongkexethocbong() {
        initComponents();
        loadTable();
        
        
    }
    public void loadTable() {
          jtbThongke.setModel(new QuanLyDiemSinhVienHAUI.Thongke.CustomTablehocbong(hienthi()));
    }
    public ArrayList<DSSinhVienHocBong> hienthi(){
        dskq = getdsv(db.getsvhocbong(hk),db.getsohptruot(hk));
//        dskq = getdsvt(db.getsohptruot(hk));
        
        return dskq;
       
    }
//    public ArrayList<DSSinhVienHocBong> getdsvt(ResultSet s) {
////        ArrayList<DSSinhVienHocBong> items = new ArrayList<DSSinhVienHocBong>();
//        
//        try{
//            int i=0;
//            while(s.next()){
//                DSSinhVienHocBong item = new DSSinhVienHocBong();
//                item.setMaSinhVien(items.get(i).getMaSinhVien());
//                item.setHoTen(items.get(i).getHoTen());
//                item.setNgaySinh(items.get(i).getNgaySinh());
//                item.setGioiTinh(items.get(i).getGioiTinh());
//                item.setDiaChi(items.get(i).getDiaChi());
//                item.setDiemtbchocky(items.get(i).getDiemtbchocky());
//              
////                if(item.getMaSinhVien().equals(s.getString(1))){
////                    item.setSohptruot(s.getDouble(2));
////                   
////                }
//                    
//                    
//                    item.setTbchungtrongkhung(items.get(i).getSotc());
//  
//                
////                if(item.getDiemtbchocky()>=2.5 &&item.getDiemtbchocky()<3.2)
////                {
////                    item.setXetduyethocbong("Khá");
////                }
////                else if(item.getDiemtbchocky()>=3.2 &&item.getDiemtbchocky()<3.6)
////                {
////                    item.setXetduyethocbong("Giỏi");
////                }
////                else if(item.getDiemtbchocky()>=3.6 && item.getDiemtbchocky()<=4)
////                {
////                    item.setXetduyethocbong("Xuất sắc");
////                }
//                
//                items.
//                i++;
//                
//   
//            }
//            
//        }
//        catch(SQLException ex){
//            
//        }
//        return items;
//    }
//    
    public ArrayList<DSSinhVienHocBong> getdsv(ResultSet rs,ResultSet r) {
        ArrayList<DSSinhVienHocBong> items = new ArrayList<DSSinhVienHocBong>();
        
        try{
            
            while(rs.next()){
                DSSinhVienHocBong item = new DSSinhVienHocBong();
                item.setMaSinhVien(rs.getString(1));
                item.setHoTen(rs.getString(2));
                item.setNgaySinh(rs.getString(3));
                item.setGioiTinh(rs.getString(4));
                item.setDiaChi(rs.getString(5));
                item.setDiemtbchocky(rs.getDouble(6));
                item.setSotc(rs.getDouble(7));
                
                if(rs.getDouble(8)==1 || rs.getDouble(8)==2){
                    item.setTbchungtrongkhung(18.0);
                }
                else 
                {
                    item.setTbchungtrongkhung(20.0);
                }
                
                
                if(rs.getDouble(6)>=2.5 && rs.getDouble(6)<3.2 ){
                        item.setXetduyethocbong("Khá");
                }
                else if(rs.getDouble(6)>=3.2 && rs.getDouble(6)<3.6 ){
                    item.setXetduyethocbong("Giỏi");
                }
                else {
                    item.setXetduyethocbong("Xuất sắc");
                }
                
                if( !r.next() ){
                    item.setSohptruot(0.0);
                }
                else{
                    while(r.next()){
                    if(rs.getString(1).equals(r.getString(1)))
                    {
                        item.setSohptruot(r.getDouble(2));
                        break;
                    }
                    else
                    {
                        item.setSohptruot(0.0);
                        break;
                    }
                    
                }
                }
                
                
                items.add(item);
                
   
            }
            
            
        }
        catch(SQLException ex){
            
        }
        return items;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbhocky = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbThongke = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh sách sinh viên đủ điều kiện xét học bổng");
        setLocation(new java.awt.Point(400, 200));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("DANH SÁCH SINH VIÊN ĐỦ ĐIỀU KIỆN XÉT HỌC BỔNG");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Học kỳ");

        cbhocky.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        cbhocky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhockyActionPerformed(evt);
            }
        });

        jtbThongke.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbThongke);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon("E:\\dowload\\JavaApplication2\\JavaApplication2\\src\\anh\\back.png")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbhocky, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbhocky, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbhockyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhockyActionPerformed
        // TODO add your handling code here:
        
        hk = cbhocky.getSelectedItem().toString();
        loadTable();
    }//GEN-LAST:event_cbhockyActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Main m= new Main();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(thongkexethocbong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(thongkexethocbong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(thongkexethocbong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(thongkexethocbong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new thongkexethocbong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbhocky;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbThongke;
    // End of variables declaration//GEN-END:variables
}
