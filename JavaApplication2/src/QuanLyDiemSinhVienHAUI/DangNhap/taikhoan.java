/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.DangNhap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Tuan Bao
 */
public class taikhoan implements Serializable {
  
    private String tentaikhoan;
    private String matkhau;
    private String quyentruycap;
    private String masv;
    private String hoten;
    private String ngaysinh;
    private String GioiTinh;
    private String Diachi;

    public taikhoan(String tentaikhoan, String matkhau, String quyentruycap, String masv, String hoten, String ngaysinh, String GioiTinh, String Diachi) {
        this.tentaikhoan = tentaikhoan;
        this.matkhau = matkhau;
        this.quyentruycap = quyentruycap;
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.GioiTinh = GioiTinh;
        this.Diachi = Diachi;
    }

    public taikhoan() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.tentaikhoan);
        hash = 67 * hash + Objects.hashCode(this.masv);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final taikhoan other = (taikhoan) obj;
        if (!Objects.equals(this.tentaikhoan, other.tentaikhoan)) {
            return false;
        }
        if (!Objects.equals(this.masv, other.masv)) {
            return false;
        }
        return true;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getQuyentruycap() {
        return quyentruycap;
    }

    public void setQuyentruycap(String quyentruycap) {
        this.quyentruycap = quyentruycap;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public ConnectionDerby getDb() {
        return db;
    }

    public void setDb(ConnectionDerby db) {
        this.db = db;
    }

    
    private ConnectionDerby db= new ConnectionDerby();
    private ArrayList<taikhoan> dstk = new ArrayList<taikhoan>();
    public ArrayList<taikhoan> hienthi(){
        String sql="select tentaikhoan, matkhau ,quyentruycap,taikhoan.masinhvien,hoten,ngaysinh,gioitinh,diachi"
                + " from taikhoan inner join sinhvien on taikhoan.masinhvien= sinhvien.masinhvien where quyentruycap='SinhVien'";
        dstk.clear();
        dstk= db.getData(sql);
        return dstk;
    }
    public ArrayList<taikhoan> getDstk(){
        return dstk;
    }
    public void setDstk(ArrayList<taikhoan> dstk){
        this.dstk=dstk;
    }
    
}
