/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Diem;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Tuan Bao
 */
public class Ketqua {
    
    private String MaMon;
    private String TenMon;
    private Double SoTinChi;
    private Double HocKy;
    private String MaSinhVien = "^([S]){1}([V]){1}([0-9]){2}$";
    private String HoTen;
    private Double DiemTX1;
    private Double DiemTX2;
    private Double DiemGiuaKy;
    private Double DiemTrungBinh;
    private Double SoTietNghi;
    private String DieuKienDuThi;
    private Double Diemthy;
    private Double DiemTongKetDiem10;
    private Double DiemTongketDiem4;
    private String DiemChu;
    private String XepLoai;

    public Ketqua() {
    }

    public Ketqua(String MaMon, String TenMon, Double SoTinChi, Double HocKy, String MaSinhVien, String HoTen, Double DiemTX1, Double DiemTX2, Double DiemGiuaKy, Double DiemTrungBinh, Double SoTietNghi, String DieuKienDuThi, Double Diemthy, Double DiemTongKetDiem10, Double DiemTongketDiem4, String DiemChu, String XepLoai) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.SoTinChi = SoTinChi;
        this.HocKy = HocKy;
        this.MaSinhVien = MaSinhVien;
        this.HoTen = HoTen;
        this.DiemTX1 = DiemTX1;
        this.DiemTX2 = DiemTX2;
        this.DiemGiuaKy = DiemGiuaKy;
        this.DiemTrungBinh = DiemTrungBinh;
        this.SoTietNghi = SoTietNghi;
        this.DieuKienDuThi = DieuKienDuThi;
        this.Diemthy = Diemthy;
        this.DiemTongKetDiem10 = DiemTongKetDiem10;
        this.DiemTongketDiem4 = DiemTongketDiem4;
        this.DiemChu = DiemChu;
        this.XepLoai = XepLoai;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public Double getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(Double SoTinChi) {
        this.SoTinChi = SoTinChi;
    }

    public Double getHocKy() {
        return HocKy;
    }

    public void setHocKy(Double HocKy) {
        this.HocKy = HocKy;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Double getDiemTX1() {
        return DiemTX1;
    }

    public void setDiemTX1(Double DiemTX1) {
        this.DiemTX1 = DiemTX1;
    }

    public Double getDiemTX2() {
        return DiemTX2;
    }

    public void setDiemTX2(Double DiemTX2) {
        this.DiemTX2 = DiemTX2;
    }

    public Double getDiemGiuaKy() {
        return DiemGiuaKy;
    }

    public void setDiemGiuaKy(Double DiemGiuaKy) {
        this.DiemGiuaKy = DiemGiuaKy;
    }

    public Double getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(Double DiemTrungBinh) {
        this.DiemTrungBinh = DiemTrungBinh;
    }

    public Double getSoTietNghi() {
        return SoTietNghi;
    }

    public void setSoTietNghi(Double SoTietNghi) {
        this.SoTietNghi = SoTietNghi;
    }

    public String getDieuKienDuThi() {
        return DieuKienDuThi;
    }

    public void setDieuKienDuThi(String DieuKienDuThi) {
        this.DieuKienDuThi = DieuKienDuThi;
    }

    public Double getDiemthy() {
        return Diemthy;
    }

    public void setDiemthy(Double Diemthy) {
        this.Diemthy = Diemthy;
    }

    public Double getDiemTongKetDiem10() {
        return DiemTongKetDiem10;
    }

    public void setDiemTongKetDiem10(Double DiemTongKetDiem10) {
        this.DiemTongKetDiem10 = DiemTongKetDiem10;
    }

    public Double getDiemTongketDiem4() {
        return DiemTongketDiem4;
    }

    public void setDiemTongketDiem4(Double DiemTongketDiem4) {
        this.DiemTongketDiem4 = DiemTongketDiem4;
    }

    public String getDiemChu() {
        return DiemChu;
    }

    public void setDiemChu(String DiemChu) {
        this.DiemChu = DiemChu;
    }

    public String getXepLoai() {
        return XepLoai;
    }

    public void setXepLoai(String XepLoai) {
        this.XepLoai = XepLoai;
    }

 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.MaMon);
        hash = 97 * hash + Objects.hashCode(this.MaSinhVien);
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
        final Ketqua other = (Ketqua) obj;
        if (!Objects.equals(this.MaMon, other.MaMon)) {
            return false;
        }
        if (!Objects.equals(this.MaSinhVien, other.MaSinhVien)) {
            return false;
        }
        return true;
    }
    private ArrayList<Ketqua> dskq = new ArrayList<Ketqua>();
    
    public ArrayList<Ketqua> getkq(){
        
        return dskq;
    }
    public void setDskq(ArrayList<Ketqua> dskq){
        this.dskq=dskq;
    }
    
}
