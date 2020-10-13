/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QuanLyDiemSinhVienHAUI.QuanLyMonHoc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dong nguyen
 */
public class MonHoc implements Serializable{
    private String maMon;
    private String tenMon;
    private int soTC;
    private String maGV;
    private String hocKy;
    private String maKhoa;

    public MonHoc() {
    }

    public MonHoc(String maMon, String tenMon, int soTC, String maGV, String hocKy, String maKhoa) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTC = soTC;
        this.maGV = maGV;
        this.hocKy = hocKy;
        this.maKhoa = maKhoa;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    private ArrayList<MonHoc> dsmh = new ArrayList<MonHoc>();
    
        public ArrayList<MonHoc> getDsmh() {
        return dsmh;
    }

    public void setDsmh(ArrayList<MonHoc> dsmh) {
        this.dsmh = dsmh;
    }
    
    
    private ConnectionDerby db = new ConnectionDerby();

    public ArrayList<MonHoc> hienthi(){
       String sql="select * from monhoc";
       dsmh.clear();
       dsmh = db.getData(sql);
       return dsmh;
    }

}
