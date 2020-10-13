/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Thongke;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Tuan Bao
 */
public class DSSinhVienHocBong {
    private String maSinhVien;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private Double diemtbchocky;
    private Double sohptruot;
    private Double sotc;
    private Double tbchungtrongkhung;
    private String xetduyethocbong;

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

    public Double getSohptruot() {
        return sohptruot;
    }

    public void setSohptruot(Double sohptruot) {
        this.sohptruot = sohptruot;
    }

    public Double getSotc() {
        return sotc;
    }

    public void setSotc(Double sotc) {
        this.sotc = sotc;
    }

    public Double getTbchungtrongkhung() {
        return tbchungtrongkhung;
    }

    public void setTbchungtrongkhung(Double tbchungtrongkhung) {
        this.tbchungtrongkhung = tbchungtrongkhung;
    }

    public String getXetduyethocbong() {
        return xetduyethocbong;
    }

    public void setXetduyethocbong(String xetduyethocbong) {
        this.xetduyethocbong = xetduyethocbong;
    }

    public DSSinhVienHocBong(String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, String diaChi, Double diemtbchocky, Double sohptruot, Double sotc, Double tbchungtrongkhung, String xetduyethocbong) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.diemtbchocky = diemtbchocky;
        this.sohptruot = sohptruot;
        this.sotc = sotc;
        this.tbchungtrongkhung = tbchungtrongkhung;
        this.xetduyethocbong = xetduyethocbong;
    }

    public DSSinhVienHocBong() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.maSinhVien);
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
        final DSSinhVienHocBong other = (DSSinhVienHocBong) obj;
        if (!Objects.equals(this.maSinhVien, other.maSinhVien)) {
            return false;
        }
        return true;
    }
    ArrayList<DSSinhVienHocBong> dskq = new ArrayList<DSSinhVienHocBong>();
    public ArrayList<DSSinhVienHocBong> getkq(){
        
        return dskq;
    }
    public void setDskq(ArrayList<DSSinhVienHocBong> dskq){
        this.dskq=dskq;
    }

    void getXetduyethocbong(String ho_lai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
