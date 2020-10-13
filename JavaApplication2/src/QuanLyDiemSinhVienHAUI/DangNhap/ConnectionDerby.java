/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.DangNhap;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



/**
 *
 * @author tuanbao
 */
public class ConnectionDerby {

    private Connection conn = null;
    Statement stm = null;
    ResultSet rs = null;
    

    private String url = "jdbc:derby://localhost:1527/quanlydiem";
    private String userName = "admins";
    private String passWord = "123";

    public ConnectionDerby() {
        String driver = "org.apache.derby.jdbc.ClientDriver";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: Can't load driver");
            System.exit(1);
        }

        try {
            conn = DriverManager.getConnection(url, userName, passWord);
            System.out.println("Connect sucessful!");
        } catch (SQLException ex) {
            System.out.println("Error: Connect failded");
            System.exit(1);
        }
    }

    public boolean exe(PreparedStatement pre) throws SQLException {
        if (pre != null) {
            int result = pre.executeUpdate();
            return true;
        }
        return false;
    }
    public boolean addtaikhoan(taikhoan item) {
        String sql = "insert into taikhoan values(?,?,?,?)";
        try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getTentaikhoan());
            pre.setString(2, item.getMatkhau());
            pre.setString(3, item.getQuyentruycap());
            pre.setString(4, item.getMasv());
            return this.exe(pre);
        } catch (SQLException ex) {
            return false;
        }

    }
//    public ArrayList<taikhoan> dangnhap(taikhoan item){
//        String sql ="select * from taikhoan where Tentaikhoan=? and matkhau=? ";
//        try{
//            ArrayList<taikhoan> bt = new ArrayList<taikhoan>();
//            PreparedStatement pre = this.conn.prepareStatement(sql);
//            pre.setString(2, item.getMatkhau());
//            pre.setString(1, item.getTentaikhoan());
////            return this.exe(pre);
//            bt= getData(sql);
//            return bt;
////            
//        } catch (SQLException ex) {
//            return null;
//        }
//        
//        
//    }
     public ResultSet getTaiKhoan(taikhoan item) throws SQLException {
        String sql = "select * from taikhoan where tentaikhoan = ? and matkhau = ?";
        try{
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(2, item.getMatkhau());
            pre.setString(1, item.getTentaikhoan());
//            return this.exe(pre);
            return pre.executeQuery();
//            
        } catch (SQLException ex) {
            return null;
        }
     }
    public boolean suataikhoan(taikhoan item){
        String sql = "update taikhoan set matkhau=? where Tentaikhoan=?";
         try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getMatkhau());
            pre.setString(2, item.getTentaikhoan());
            
            
            return this.exe(pre);
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean xoataikhoan(taikhoan item){
        String sql = "delete from taikhoan where Tentaikhoan=?";
         try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getTentaikhoan());
          
            return this.exe(pre);
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public void doSQL(String sql) {
        try {
            stm = conn.createStatement();
            stm.execute(sql);
        } catch (SQLException ex) {
            System.out.println(" khong thuc hien dc cau lẹnh sql\n" + sql);
        }
    }

    public ArrayList getData(String sql) {
        ArrayList<taikhoan> ds = new ArrayList<taikhoan>();
        try {
            stm = (Statement) conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                taikhoan tk = new taikhoan(rs.getString(1),
                        rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                ds.add(tk);
            }
        } catch (Exception ex) {
            System.out.println("loi getData " + ex.toString());
            return null;
        }
        return ds;
    }
   
    public void close(){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Khong the dong ket noi");
        }
    }
    public static void main(String[] args) {
        ConnectionDerby db= new ConnectionDerby();
    }
    
    
    //_________________________________________________________________________

}
