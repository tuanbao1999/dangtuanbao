/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.DangNhap;
import QuanLyDiemSinhVienHAUI.Main;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 *
 * @author Tuan Bao
 */
public class QuanlyTKsinhvien extends javax.swing.JFrame {

    private ConnectionDerby db=new ConnectionDerby();
    private taikhoan taikhoan = new taikhoan();
    /**
     * Creates new form QuanlyTKsinhvien
     */
    public QuanlyTKsinhvien() {
        initComponents();
        setLocation(500,150);
        loadTable();
    }
    public void loadTable(){
        jTabletaikhoan.setModel(new CustomTable(taikhoan.hienthi()));
    }
    public void clearTextDetail() {
        txttentaikhoan.setText("");
        txtmatkhau.setText("");
        txtmasv.setText("");
        
    }

    private void setTextDetail(taikhoan ts) {
        txttentaikhoan.setText(ts.getTentaikhoan());
        txtmatkhau.setText(ts.getMatkhau());
        txtmasv.setText(ts.getMasv());
        

    }

    private taikhoan getThiSinhDetail() {
        String taikhoan = txttentaikhoan.getText().trim();
        String matkhau = txtmatkhau.getText().trim();
        String masv = txtmasv.getText().trim();
        return new taikhoan(taikhoan,matkhau,"SinhVien",masv,null,null,null,null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttentaikhoan = new javax.swing.JTextField();
        txtmatkhau = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabletaikhoan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý tài khoản sinh viên");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chi tiết"));

        jLabel2.setText("Tên tài khoản");

        jLabel3.setText("Mật khẩu");

        jLabel4.setText("Mã sinh viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttentaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(txtmatkhau)
                    .addComponent(txtmasv)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttentaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(283, 283, 283))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách"));

        jTabletaikhoan.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabletaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabletaikhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabletaikhoan);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Quản lý tài khoản Sinh Viên");

        btnthem.setText("Thêm");
        btnthem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnthemMouseClicked(evt);
            }
        });
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnxoaMouseClicked(evt);
            }
        });

        jButton4.setText("Thoát");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(356, 356, 356))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabletaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabletaikhoanMouseClicked
        // TODO add your handling code here:
        int row = jTabletaikhoan.getSelectedRow();
        //thí sinh trên dòng chọn chính là bản ghi tứ i trong dsts
        taikhoan ts = taikhoan.getDstk().get(row);
        // gan du lieu cho cac o text tương ứng dòng chọn
        setTextDetail(ts);
    }//GEN-LAST:event_jTabletaikhoanMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
             //lấy dòng chọn trong table
            int row = jTabletaikhoan.getSelectedRow();
            //lấy dữ liệu từ giao diện tạo thí sinh mới
            String soBD = jTabletaikhoan.getValueAt(row, 0).toString();
            
            taikhoan newtk = getThiSinhDetail();
            boolean tb=db.suataikhoan(newtk);
            if (tb) {
                System.out.println("Sửa thành công");
            } else {
                System.out.println("Không sửa được!");
            }
            //lấy lại dữ liệu cho bảng
            loadTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Không sửa được " + ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnthemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthemMouseClicked
        // TODO add your handling code here:
        try{
            taikhoan tk = getThiSinhDetail();
            
            boolean tb= db.addtaikhoan(tk);
            if(tb) {
                JOptionPane.showMessageDialog(rootPane, "thông báo thành công");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "thông báo không thành công");
            }
           loadTable();
           clearTextDetail();
        } catch (HeadlessException ex) {
            System.out.println("lỗi = " + ex.toString());
        }
    }//GEN-LAST:event_btnthemMouseClicked

    private void btnxoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnxoaMouseClicked
        // TODO add your handling code here:
        try{
            int click = JOptionPane.showConfirmDialog(null, "Chắc chắn môn học này", "Xóa?", JOptionPane.YES_NO_OPTION);
            if (click == JOptionPane.YES_OPTION) {
                //lấy dòng chọn hiện thời trong table
                int row = jTabletaikhoan.getSelectedRow();
                //lấy số báo danh ở cột 0
                String soBD = jTabletaikhoan.getValueAt(row, 0).toString();
                //truyền vào phognf thi xóa theo sbd
                taikhoan newts = getThiSinhDetail();
                db.xoataikhoan(newts);
                loadTable();
                clearTextDetail();
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Không xóa được " + ex.toString());
        }
    }//GEN-LAST:event_btnxoaMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
         Main m= new Main();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(QuanlyTKsinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanlyTKsinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanlyTKsinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanlyTKsinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dangnhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabletaikhoan;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txtmatkhau;
    private javax.swing.JTextField txttentaikhoan;
    // End of variables declaration//GEN-END:variables
}
