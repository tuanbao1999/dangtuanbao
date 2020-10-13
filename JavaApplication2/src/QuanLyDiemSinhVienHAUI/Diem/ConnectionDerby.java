/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Diem;



import QuanLyDiemSinhVienHAUI.DangNhap.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;



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
    public ResultSet getdiem(Ketqua item) {
        String sql = "select monhoc.mamon,tenmon,sotc,hocky,sinhvien.masinhvien,hoten,diemtx1,diemtx2,diemgiuaky,"
                + "diemtb,sotietnghi,dieukienduthi,diemthy,diemtongketdiem10,diemtongketdiem4,diemchu,xeploai\n" +
"                from ketqua inner join monhoc on ketqua.mamon = monhoc.mamon inner join sinhvien\n" +
"                 on ketqua.masinhvien = sinhvien.masinhvien where Ketqua.mamon=?  ";
        try{
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getMaMon());
          
//            return this.exe(pre);
            return pre.executeQuery();
//            
        } catch (SQLException ex) {
            return null;
        }
     }
     public ResultSet getdiemthy(Ketqua item) {
        String sql = "select monhoc.mamon,tenmon,sotc,hocky,sinhvien.masinhvien,hoten,diemtx1,diemtx2,diemgiuaky,"
                + "diemtb,sotietnghi,dieukienduthi,diemthy,diemtongketdiem10,diemtongketdiem4,diemchu,xeploai\n" +
"                from ketqua inner join monhoc on ketqua.mamon = monhoc.mamon inner join sinhvien\n" +
"                 on ketqua.masinhvien = sinhvien.masinhvien where Ketqua.mamon=? and sinhvien.masinhvien=? ";
        try{
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getMaMon());
            pre.setString(2,item.getMaSinhVien());
          
//            return this.exe(pre);
            return pre.executeQuery();
//            
        } catch (SQLException ex) {
            return null;
        }
     }
     public boolean updatediemthi(Ketqua item) {
        String sql = "update ketqua set\n" +
"                diemthy=?,diemtongketdiem10=?,diemtongketdiem4=?,Diemchu=?,xeploai=?\n" +
"                where mamon=? and masinhvien=? and dieukienduthi='Đủ điều kiện'";
        try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setDouble(1, item.getDiemthy());
            pre.setDouble(2, (double) Math.round(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)*10)/10);
            
            if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<4 ){
                pre.setString(4, "F");
                pre.setDouble(3, 0);
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=4 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=4.6  ){
                pre.setString(4, "D");
                pre.setDouble(3, 1);
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=4.7 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=5.4 ){
                pre.setString(4, "D+");
                pre.setDouble(3, 1.5);
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=5.5 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=6.1  ){
                pre.setString(4, "C");
                pre.setDouble(3, 2);
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=6.2 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=6.9 ){
                pre.setString(4, "C+");
                pre.setDouble(3, 2.5);
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=7.0 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=7.6 ){
                pre.setString(4, "B");
                pre.setDouble(3, 3);
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=7.7 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=8.4 ){
                pre.setString(4, "B+");
                pre.setDouble(3, 3.5);
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>8.5 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=10){
                pre.setString(4, "A");
                pre.setDouble(3, 4);
            }
            
            
            if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<4 ){
                pre.setString(5, "Kém");
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=4 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=4.6  ){
                pre.setString(5, "Trung bình yếu");
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=4.7 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=5.4 ){
                pre.setString(5, "Trung bình yếu");
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=5.5 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=6.1  ){
                pre.setString(5, "Trung bình");
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=6.2 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=6.9 ){
                pre.setString(5, "Trung bình");
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=7.0 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=7.6 ){
                pre.setString(5, "Khá");
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>=7.7 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=8.4 ){
                pre.setString(5, "Khá");
            }
            else if(((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)>8.5 && ((item.getDiemTrungBinh()+ item.getDiemthy()*2 )/3)<=10){
                pre.setString(5, "Giỏi");
            }
            
            pre.setString(6, item.getMaMon());
            pre.setString(7, item.getMaSinhVien());
            
            return this.exe(pre);
        } catch (SQLException ex) {
            
            return false;
        }

    }
    public boolean add(Ketqua item) {
        String sql = "insert into ketqua values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getMaSinhVien());
            pre.setString(2, item.getMaMon());
            pre.setDouble(3, item.getHocKy());
            pre.setDouble(4, item.getDiemTX1());
            pre.setDouble(5, item.getDiemTX2());
            pre.setDouble(6, item.getDiemGiuaKy());
            pre.setDouble(7, item.getDiemTrungBinh());
            pre.setDouble(8, item.getSoTietNghi());
            pre.setString(9, item.getDieuKienDuThi());
            pre.setDouble(10,item.getDiemthy());
            pre.setDouble(11,item.getDiemTongKetDiem10());
            pre.setDouble(12,item.getDiemTongketDiem4());
            pre.setString(13, item.getDiemChu());
            pre.setString(14, item.getXepLoai());
            
            return this.exe(pre);
        } catch (SQLException ex) {
            
            return false;
        }

    }
    public boolean update(Ketqua item) {
        String sql = "update ketqua set\n" +
"                Diemtx1 = ?,Diemtx2 =?,Diemgiuaky = ?,Diemtb = ?,sotietnghi=?,Dieukienduthi=?\n" +
"                where mamon=? and masinhvien=?";
        try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setDouble(1, item.getDiemTX1());
            pre.setDouble(2, item.getDiemTX2());
            pre.setDouble(3, item.getDiemGiuaKy());
            pre.setDouble(4, item.getDiemTrungBinh());
            pre.setDouble(5, item.getSoTietNghi());
            pre.setString(6, item.getDieuKienDuThi());
            pre.setString(7, item.getMaMon());
            pre.setString(8, item.getMaSinhVien());
            
            return this.exe(pre);
        } catch (SQLException ex) {
            
            return false;
        }

    }
      public boolean delete(Ketqua item) {
        String sql = "delete from ketqua where mamon=? and masinhvien=?";
        try {
            PreparedStatement pre = this.conn.prepareStatement(sql);
            pre.setString(1, item.getMaMon());
            pre.setString(2, item.getMaSinhVien());
            
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
   
  
 
    
    public void doSQL(String sql) {
        try {
            stm = conn.createStatement();
            stm.execute(sql);
        } catch (SQLException ex) {
            System.out.println(" khong thuc hien dc cau lẹnh sql\n" + sql);
        }
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
