/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.QuanLyDiem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dong nguyen
 */
public class CustomTable extends AbstractTableModel {

    private String name[] = {"Mã sinh viên", "Họ tên", "Mã lớp", "Mã môn", "Điểm trung bình", "Điểm thy", "Điểm tổng kết", "Hạnh kiểm", "Học Kỳ", "Ghi chú"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class, String.class, String.class, int.class, int.class, int.class, String.class, String.class, String.class};
    //Tạo một đối tượng arrayList
    ArrayList<DiemSinhVien> dsDiemSinhVien = new ArrayList<DiemSinhVien>();

    public CustomTable(ArrayList<DiemSinhVien> listDiemSinhVien) {
        this.dsDiemSinhVien = listDiemSinhVien;
    }

    @Override
    public int getRowCount() {
        return dsDiemSinhVien.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                return dsDiemSinhVien.get(rowIndex).getMaSinhVien();

            case 1:
                return dsDiemSinhVien.get(rowIndex).getHoTen();

            case 2:
                return dsDiemSinhVien.get(rowIndex).getMaLop();

            case 3:
                return dsDiemSinhVien.get(rowIndex).getMaMon();

            case 4:
                return dsDiemSinhVien.get(rowIndex).getDiemTB();

            case 5:
                return dsDiemSinhVien.get(rowIndex).getDiemThy();

            case 6:
                return dsDiemSinhVien.get(rowIndex).getDiemTongKet();

            case 7:
                return dsDiemSinhVien.get(rowIndex).getHanhKiem();

            case 8:
                return dsDiemSinhVien.get(rowIndex).getHocKy();

            case 9:
                return dsDiemSinhVien.get(rowIndex).getGhiChu();

            default:
                return null;
        }
    }

    @Override
   public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
    

    

}
