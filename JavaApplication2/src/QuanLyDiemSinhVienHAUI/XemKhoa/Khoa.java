/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QuanLyDiemSinhVienHAUI.XemKhoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dong nguyen
 */
public class Khoa implements Serializable{
    private String maKhoa;
    private String tenKhoa;

    public Khoa() {
    }

    public Khoa(String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
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
    public Khoa(String maKhoa) throws Exception {
        setMaKhoa(maKhoa);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.maKhoa);
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
        final Khoa other = (Khoa) obj;
        if (!Objects.equals(this.maKhoa, other.maKhoa)) {
            return false;
        }
        return true;
    }
    private ArrayList<Khoa> dsKhoa = new ArrayList<Khoa>();

    public ArrayList<Khoa> getDsKhoa() {
        return dsKhoa;
    }

    public void setDsKhoa(ArrayList<Khoa> dsKhoa) {
        this.dsKhoa = dsKhoa;
    }
    
    
    
    
}
