/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.QuanLyMonHoc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Remain
 */
public class ConnectionDerby {

    private Connection conn = null;
    Statement stm = null;
    ResultSet rs = null;
    

    private String url = "jdbc:derby://localhost:1527/QLDiem";
    private String userName = "nhom12";
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
    public boolean addmonhoc(MonHoc item) {
        String sql = "insert into monhoc values(?,?,?,?,?,?)";
        try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getMaMon());
            pre.setString(2, item.getTenMon());
            pre.setInt(3, item.getSoTC());
            pre.setString(4, item.getMaGV());
            pre.setString(5, item.getHocKy());
            pre.setString(6, item.getMaKhoa());


            return this.exe(pre);
        } catch (SQLException ex) {
            return false;
        }

    }
    public boolean suamonhoc(MonHoc item){
        String sql = "update monhoc set tenmon=?, soTc=?,magv=?,hocky=?,makhoa=? where mamon=?";
         try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(6, item.getMaMon());
            pre.setString(1, item.getTenMon());
            pre.setInt(2, item.getSoTC());
            pre.setString(3, item.getMaGV());
            pre.setString(4, item.getHocKy());
            pre.setString(5, item.getMaKhoa());


            return this.exe(pre);
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean xoamonhoc(MonHoc item){
        String sql = "delete from monhoc where mamon=?";
         try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getMaMon());
          
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
        ArrayList<MonHoc> ds = new ArrayList<MonHoc>();
        try {
            stm = (Statement) conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                MonHoc sv = new MonHoc(rs.getString(1),
                        rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
                ds.add(sv);
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
}
