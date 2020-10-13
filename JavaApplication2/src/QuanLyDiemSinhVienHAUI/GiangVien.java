/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QuanLyDiemSinhVienHAUI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dong nguyen
 */
public class GiangVien implements Serializable{
       private String maGV;
       private String tenGV;
       private String gioiTinh;
       private int soDT;
       private String email;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, String gioiTinh, int soDT, String email) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.email = email;
    }
    public GiangVien(String maGiangVien) throws Exception {
        setMaGV(maGiangVien);
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.maGV);
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
        final GiangVien other = (GiangVien) obj;
        if (!Objects.equals(this.maGV, other.maGV)) {
            return false;
        }
        return true;
    }
    
    private ArrayList<GiangVien> dsgv = new ArrayList<GiangVien>();

    
    public boolean ThemGiangVien(GiangVien gv) throws Exception {
        if (dsgv.contains(gv)) {
            throw new Exception("giang vien đã tồn tại");
        }
        return dsgv.add(gv);
    }

    public boolean XoaGiangVien(String magv) throws Exception {
        GiangVien gv = new GiangVien(magv.trim());
        if (!dsgv.contains(gv)) {
            return false;
        }
        return dsgv.remove(gv);
    }

    public boolean SuaThongTinGV(String magv, GiangVien newGV) throws Exception {
        GiangVien gv = new GiangVien(magv);
        if (!dsgv.contains(gv)) {
            return false;
        }
        dsgv.set(dsgv.indexOf(gv), newGV);
        return true;
    }

    public GiangVien LayThongTinGV(String magv) throws Exception {
        GiangVien gv = new GiangVien(magv);
        if (!dsgv.contains(gv)) {
            return null;
        }
        gv = dsgv.get(dsgv.indexOf(gv));
        return gv;
    }

    public GiangVien LayThongTinGV(int index) throws Exception {
        if (index < 0 || index > dsgv.size()) {
            return null;
        }
        return dsgv.get(index);
    }
    public int SoGiangVien() {
        return dsgv.size();
    }

    public ArrayList<GiangVien> getDsgv() {
        return dsgv;
    }

    public void setDsgv(ArrayList<GiangVien> dsgv) {
        this.dsgv = dsgv;
    }

    
       
}
