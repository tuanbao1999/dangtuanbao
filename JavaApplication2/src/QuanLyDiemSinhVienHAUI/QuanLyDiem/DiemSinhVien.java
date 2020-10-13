/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QuanLyDiemSinhVienHAUI.QuanLyDiem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dong nguyen
 */
public class DiemSinhVien implements Serializable {
    
    private String maSinhVien;
    private String hoTen;
    private String maLop;
    private String maMon;
    private float diemTB;
    private float diemThy;
    private float diemTongKet;
    private String hanhKiem;
    private String hocKy;
    private String ghiChu;

    public DiemSinhVien() {
    }

    public DiemSinhVien(String maSinhVien, String hoTen, String maLop, String maMon, float diemTB, float diemThy, float diemTongKet, String hanhKiem, String hocKy, String ghiChu) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.maLop = maLop;
        this.maMon = maMon;
        this.diemTB = diemTB;
        this.diemThy = diemThy;
        this.diemTongKet = diemTongKet;
        this.hanhKiem = hanhKiem;
        this.hocKy = hocKy;
        this.ghiChu = ghiChu;
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

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public float getDiemThy() {
        return diemThy;
    }

    public void setDiemThy(float diemThy) {
        this.diemThy = diemThy;
    }

    public float getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(float diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    public String getHanhKiem() {
        return hanhKiem;
    }

    public void setHanhKiem(String hanhKiem) {
        this.hanhKiem = hanhKiem;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    public DiemSinhVien(String maSinhVien) throws Exception {
        setMaSinhVien(maSinhVien);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.maSinhVien);
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
        final DiemSinhVien other = (DiemSinhVien) obj;
        if (!Objects.equals(this.maSinhVien, other.maSinhVien)) {
            return false;
        }
        return true;
    }
    
    private ArrayList<DiemSinhVien> dsdiem = new ArrayList<DiemSinhVien>();
    
    public boolean ThemSinhVien(DiemSinhVien sv) throws Exception {
        if (dsdiem.contains(sv)) {
            throw new Exception("Thí sinh đã tồn tại");
        }
        return dsdiem.add(sv);
    }

    public boolean XoaSinhVien(String masv) throws Exception {
        DiemSinhVien sv = new DiemSinhVien(masv.trim());
        if (!dsdiem.contains(sv)) {
            return false;
        }
        return dsdiem.remove(sv);
    }

    public boolean SuaThongTinSV(String masv, DiemSinhVien newSV) throws Exception {
        DiemSinhVien sv = new DiemSinhVien(masv);
        if (!dsdiem.contains(sv)) {
            return false;
        }
        dsdiem.set(dsdiem.indexOf(sv), newSV);
        return true;
    }

    public DiemSinhVien LayThongTinSV(String masv) throws Exception {
        DiemSinhVien sv = new DiemSinhVien(masv);
        if (!dsdiem.contains(sv)) {
            return null;
        }
        sv = dsdiem.get(dsdiem.indexOf(sv));
        return sv;
    }

    public DiemSinhVien LayThongTinSV(int index) throws Exception {
        if (index < 0 || index > dsdiem.size()) {
            return null;
        }
        return dsdiem.get(index);
    }
    public int SoSinhVien() {
        return dsdiem.size();
    }

    public ArrayList<DiemSinhVien> getDsdiem() {
        return dsdiem;
    }

    public void setDsdiem(ArrayList<DiemSinhVien> dsdiem) {
        this.dsdiem = dsdiem;
    }

    
}
