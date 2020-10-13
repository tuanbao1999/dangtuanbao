/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author dong nguyen
 */
public class SinhVien implements Serializable {

    private String maSinhVien;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String maLop;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, String diaChi, String maLop) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.maLop = maLop;
    }

    public SinhVien(String maSinhVien) throws Exception {
        setMaSinhVien(maSinhVien);
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.maSinhVien);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        if (!Objects.equals(this.maSinhVien, other.maSinhVien)) {
            return false;
        }
        return true;
    }
    private ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();

    public boolean ThemSinhVien(SinhVien sv) throws Exception {
        if (dssv.contains(sv)) {
            throw new Exception(" thí sinh đã tồn tại");
        }
        return dssv.add(sv);
    }

    public boolean XoaSinhVien(String masv) throws Exception {
        SinhVien sv = new SinhVien(masv.trim());
        if (!dssv.contains(sv)) {
            return false;
        }
        return dssv.remove(sv);
    }

    public boolean SuaThongTinSV(String masv, SinhVien newSV) throws Exception {
        SinhVien sv = new SinhVien(masv);
        if (!dssv.contains(sv)) {
            return false;
        }
        dssv.set(dssv.indexOf(sv), newSV);
        return true;
    }

    public SinhVien LayThongTinSV(String masv) throws Exception {
        SinhVien sv = new SinhVien(masv);
        if (!dssv.contains(sv)) {
            return null;
        }
        sv = dssv.get(dssv.indexOf(sv));
        return sv;
    }

    public SinhVien LayThongTinSV(int index) throws Exception {
        if (index < 0 || index > dssv.size()) {
            return null;
        }
        return dssv.get(index);
    }
    public int SoSinhVien() {
        return dssv.size();
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }
    
    
    
    
    
}
