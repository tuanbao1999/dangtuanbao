/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QuanLyDiemSinhVienHAUI.XemLop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dong nguyen
 */
public class Lop implements Serializable {
    private String maLop;
    private String tenLop;
    private String maKhoa;

    public Lop() {
    }

    public Lop(String maLop, String tenLop, String maKhoa) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maKhoa = maKhoa;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }
    public Lop(String maLop) throws Exception {
        setMaLop(maLop);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.maLop);
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
        final Lop other = (Lop) obj;
        if (!Objects.equals(this.maLop, other.maLop)) {
            return false;
        }
        return true;
    }
    private ArrayList<Lop> dsLop = new ArrayList<Lop>();

    public ArrayList<Lop> getDsLop() {
        return dsLop;
    }

    public void setDsLop(ArrayList<Lop> dsLop) {
        this.dsLop = dsLop;
    }
    
    
    
}
