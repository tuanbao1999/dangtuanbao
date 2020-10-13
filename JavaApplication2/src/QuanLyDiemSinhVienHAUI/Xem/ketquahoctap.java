/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Xem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author tran ngat
 */
public class ketquahoctap implements Serializable {

    private String maSinhVien;
    private String hoten;
    private String hocky;
    private String maMon;
    private String tenmon;
    private Double DiemTX1;
    private Double diemTX2;
    private Double diemGiuaky;
    private Double diemtb ;
    private Double sotietnghi;
    private String dieukienduthi;

    public ketquahoctap() {
    }

    public ketquahoctap(String maSinhVien, String hoten, String hocky, String maMon, String tenmon, Double DiemTX1, Double diemTX2, Double diemGiuaky, Double diemtb, Double sotietnghi, String dieukienduthi) {
        this.maSinhVien = maSinhVien;
        this.hoten = hoten;
        this.hocky = hocky;
        this.maMon = maMon;
        this.tenmon = tenmon;
        this.DiemTX1 = DiemTX1;
        this.diemTX2 = diemTX2;
        this.diemGiuaky = diemGiuaky;
        this.diemtb = diemtb;
        this.sotietnghi = sotietnghi;
        this.dieukienduthi = dieukienduthi;
    }

    public String getHocky() {
        return hocky;
    }

    public void setHocky(String hocky) {
        this.hocky = hocky;
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

    public Double getDiemTX1() {
        return DiemTX1;
    }

    public void setDiemTX1(Double DiemTX1) {
        this.DiemTX1 = DiemTX1;
    }

    public Double getDiemTX2() {
        return diemTX2;
    }

    public void setDiemTX2(Double diemTX2) {
        this.diemTX2 = diemTX2;
    }

    public Double getDiemGiuaky() {
        return diemGiuaky;
    }

    public void setDiemGiuaky(Double diemGiuaky) {
        this.diemGiuaky = diemGiuaky;
    }

    public Double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(Double diemtb) {
        this.diemtb = diemtb;
    }

    public Double getSotietnghi() {
        return sotietnghi;
    }

    public void setSotietnghi(Double sotietnghi) {
        this.sotietnghi = sotietnghi;
    }

    public String getDieukienduthi() {
        return dieukienduthi;
    }

    public void setDieukienduthi(String dieukienduthi) {
        this.dieukienduthi = dieukienduthi;
    }

    public Connectionxem getDb() {
        return db;
    }

    public void setDb(Connectionxem db) {
        this.db = db;
    }

   
    
    Connectionxem db= new Connectionxem();
    private ArrayList<ketquahoctap> dsdiem = new ArrayList<ketquahoctap>();
    
    public ArrayList<ketquahoctap> getDsdiem() {
        return dsdiem;
    }

    public void setDsdiem(ArrayList<ketquahoctap> dsdiem) {
        this.dsdiem = dsdiem;
    }

}
