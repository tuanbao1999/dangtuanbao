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
public class Khoa implements Serializable{
    private String maKhoa;
    private String tenKhoa;
    private String Truongkhoa;
    private Double Sogiaovien;
    private String diachi;
    private String SDT;
    private String email;

    public Khoa() {
    }

    public Khoa(String maKhoa, String tenKhoa, String Truongkhoa, Double Sogiaovien, String diachi, String SDT, String email) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.Truongkhoa = Truongkhoa;
        this.Sogiaovien = Sogiaovien;
        this.diachi = diachi;
        this.SDT = SDT;
        this.email = email;
    }

    public String getTruongkhoa() {
        return Truongkhoa;
    }

    public void setTruongkhoa(String Truongkhoa) {
        this.Truongkhoa = Truongkhoa;
    }

    public Double getSogiaovien() {
        return Sogiaovien;
    }

    public void setSogiaovien(Double Sogiaovien) {
        this.Sogiaovien = Sogiaovien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Connectionxem getDb() {
        return db;
    }

    public void setDb(Connectionxem db) {
        this.db = db;
    }

    
    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
    Connectionxem db= new Connectionxem();
    private ArrayList<Khoa> dsKhoa = new ArrayList<Khoa>();
    public ArrayList<Khoa> hienthi(){
        String sql="select khoa.makhoa, tenkhoa,truongkhoa,count(*),diachikhoa,Sdt,emailkhoa "
                + "from khoa inner join giangvien on khoa.makhoa = giangvien.makhoa "
                + "group by khoa.makhoa, tenkhoa,truongkhoa,diachikhoa,Sdt,emailkhoa";
        dsKhoa.clear();
        dsKhoa= db.getData(sql);
        return dsKhoa;
    }

    public ArrayList<Khoa> getDsKhoa() {
        return dsKhoa;
    }

    public void setDsKhoa(ArrayList<Khoa> dsKhoa) {
        this.dsKhoa = dsKhoa;
    }
    
    
    
    
}
