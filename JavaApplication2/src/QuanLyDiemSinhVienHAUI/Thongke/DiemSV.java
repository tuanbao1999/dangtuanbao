/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Thongke;

import java.util.Objects;

/**
 *
 * @author Tuan Bao
 */
public class DiemSV {
    private String maSinhVien;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private Double diemtbchocky;
    private Double sotc;

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

    public Double getDiemtbchocky() {
        return diemtbchocky;
    }

    public void setDiemtbchocky(Double diemtbchocky) {
        this.diemtbchocky = diemtbchocky;
    }

    public Double getSotc() {
        return sotc;
    }

    public void setSotc(Double sotc) {
        this.sotc = sotc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.maSinhVien);
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
        final DiemSV other = (DiemSV) obj;
        if (!Objects.equals(this.maSinhVien, other.maSinhVien)) {
            return false;
        }
        return true;
    }

    public DiemSV() {
    }

    public DiemSV(String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, String diaChi, Double diemtbchocky, Double sotc) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.diemtbchocky = diemtbchocky;
        this.sotc = sotc;
    }
    
    
}
