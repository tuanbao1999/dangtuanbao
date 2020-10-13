/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Thongke;


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
 * @author tuanbao
 */
public class ConnectionDerbyDiem {

    private Connection conn = null;
    Statement stm = null;
    ResultSet rs = null;
    

    private String url = "jdbc:derby://localhost:1527/quanlydiem";
    private String userName = "admins";
    private String passWord = "123";

    public ConnectionDerbyDiem() {
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
   public ResultSet getsvcanhbao(String hocky,String diemcb) {
        String sql="select sinhvien.masinhvien , hoten ,ngaysinh,gioitinh,diachi,sum(Diemtongketdiem4*sotc)/sum(sotc),sum(sotc) "
                + "from sinhvien inner join ketqua on sinhvien.masinhvien = ketqua.masinhvien"
               + " inner join monhoc on monhoc.mamon=ketqua.mamon\n" +
"where hocky = ? group by sinhvien.masinhvien , hoten ,ngaysinh,gioitinh,diachi having (sum(Diemtongketdiem4*sotc)/sum(sotc))< ?";
        try{
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setDouble(1, Double.parseDouble(hocky));
            pre.setDouble(2, Double.parseDouble(diemcb));
//            return  this.exe(pre);
            return pre.executeQuery();
//            
        } catch (SQLException ex) {
            return null;
        }
     }
   public ResultSet getsvhocbong(String hocky) {
        String sql="select sinhvien.masinhvien , hoten ,ngaysinh,gioitinh,diachi,sum(Diemtongketdiem4*sotc)/sum(sotc),sum(sotc) ,"
                + "hocky from sinhvien inner join ketqua on sinhvien.masinhvien = ketqua.masinhvien"
               + " inner join monhoc on monhoc.mamon=ketqua.mamon\n" +
"where hocky = ?  group by sinhvien.masinhvien , hoten ,ngaysinh,gioitinh,diachi,hocky having sum(Diemtongketdiem4*sotc)/sum(sotc)>2.5";
        try{
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setDouble(1, Double.parseDouble(hocky));
//            return  this.exe(pre);
            return pre.executeQuery();
//            
        } catch (SQLException ex) {
            return null;
        }
     }
   public ResultSet getsohptruot(String hocky) {
        String sql="select sinhvien.masinhvien , count(dieukienduthi) from sinhvien inner join ketqua on sinhvien.masinhvien = ketqua.masinhvien"
               + " inner join monhoc on monhoc.mamon=ketqua.mamon"
                + " where hocky = ? and dieukienduthi='Học lại' group by sinhvien.masinhvien  ";
        try{
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setDouble(1, Double.parseDouble(hocky));
//            return  this.exe(pre);
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
        ArrayList<DiemSV> ds = new ArrayList<DiemSV>();
        try {
            stm = (Statement) conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                DiemSV sv = new DiemSV(rs.getString(1),
                        rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getDouble(7));
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
        ConnectionDerbyDiem db= new ConnectionDerbyDiem();
    }
    
    
    //_________________________________________________________________________

}
