/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Xem;

import java.util.Objects;

/**
 *
 * @author Tuan Bao
 */
public class ketquathi {
    private String maSinhVien;
    private String hoten;
    private String hocky;
    private String maMon;
    private String tenmon;
    private Double sotc;
    private Double Diemtb;
    private String dieukienduthi;
    private Double Diemthi;
    private Double diemtk10;
    private Double diemtk4;
    private String Diemchu;
    private String xeploai;

    public Double getSotc() {
        return sotc;
    }

    public String getDieukienduthi() {
        return dieukienduthi;
    }

    public void setDieukienduthi(String dieukienduthi) {
        this.dieukienduthi = dieukienduthi;
    }

    public void setSotc(Double sotc) {
        this.sotc = sotc;
    }

    public Double getDiemtb() {
        return Diemtb;
    }

    public void setDiemtb(Double Diemtb) {
        this.Diemtb = Diemtb;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.maSinhVien);
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
        final ketquathi other = (ketquathi) obj;
        if (!Objects.equals(this.maSinhVien, other.maSinhVien)) {
            return false;
        }
        return true;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getHocky() {
        return hocky;
    }

    public void setHocky(String hocky) {
        this.hocky = hocky;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public Double getDiemthi() {
        return Diemthi;
    }

    public void setDiemthi(Double Diemthi) {
        this.Diemthi = Diemthi;
    }

    public Double getDiemtk10() {
        return diemtk10;
    }

    public void setDiemtk10(Double diemtk10) {
        this.diemtk10 = diemtk10;
    }

    public Double getDiemtk4() {
        return diemtk4;
    }

    public void setDiemtk4(Double diemtk4) {
        this.diemtk4 = diemtk4;
    }

    public String getDiemchu() {
        return Diemchu;
    }

    public void setDiemchu(String Diemchu) {
        this.Diemchu = Diemchu;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    public ketquathi() {
    }

    public ketquathi(String maSinhVien, String hoten, String hocky, String maMon, String tenmon, Double sotc, Double Diemtb, String dieukienduthi, Double Diemthi, Double diemtk10, Double diemtk4, String Diemchu, String xeploai) {
        this.maSinhVien = maSinhVien;
        this.hoten = hoten;
        this.hocky = hocky;
        this.maMon = maMon;
        this.tenmon = tenmon;
        this.sotc = sotc;
        this.Diemtb = Diemtb;
        this.dieukienduthi = dieukienduthi;
        this.Diemthi = Diemthi;
        this.diemtk10 = diemtk10;
        this.diemtk4 = diemtk4;
        this.Diemchu = Diemchu;
        this.xeploai = xeploai;
    }

    

    
    
    
}
