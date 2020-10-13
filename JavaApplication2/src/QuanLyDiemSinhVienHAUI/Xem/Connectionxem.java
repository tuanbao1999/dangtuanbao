/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Xem;


import QuanLyDiemSinhVienHAUI.Thongke.*;
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
 * @author tran ngat
 */
public class Connectionxem {

    Connection conn = null;
    Statement stm = null;
    ResultSet rs = null;
    

    private String url = "jdbc:derby://localhost:1527/quanlydiem";
    private String userName = "admins";
    private String passWord = "123";

    public Connectionxem() {
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
    public ResultSet getdiem(ketquahoctap item) {
        String sql = "select sinhvien.masinhvien,hoten,monhoc.mamon,tenmon,hocky,diemtx1,diemtx2,diemgiuaky,diemtb,sotietnghi,dieukienduthi \n" +
"from KETQUA inner join sinhvien on ketqua.masinhvien = sinhvien.masinhvien inner join monhoc on monhoc.mamon=ketqua.mamon where sinhvien.masinhvien=?";
        try{
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getMaSinhVien());
          
//            return this.exe(pre);
            return pre.executeQuery();
//            
        } catch (SQLException ex) {
            return null;
        }
     }
    public ResultSet getdiemthi(ketquathi item) {
        String sql = "select sinhvien.masinhvien,hoten,hocky,monhoc.mamon,tenmon,sotc,diemtb,diemthy,diemtongketdiem10,diemtongketdiem4,diemchu,xeploai,dieukienduthi \n" +
"from KETQUA inner join sinhvien on ketqua.masinhvien = sinhvien.masinhvien inner join monhoc on monhoc.mamon=ketqua.mamon where sinhvien.masinhvien=?";
        try{
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getMaSinhVien());
          
//            return this.exe(pre);
            return pre.executeQuery();
//            
        } catch (SQLException ex) {
            return null;
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
        ArrayList<Khoa> ds = new ArrayList<Khoa>();
        try {
            stm = (Statement) conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Khoa sv = new Khoa(rs.getString(1),
                        rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getString(7));
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
        Connectionxem db= new Connectionxem();
    }
    
    
    //_________________________________________________________________________

}
