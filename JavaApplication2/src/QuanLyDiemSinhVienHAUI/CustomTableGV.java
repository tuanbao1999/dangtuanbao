/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QuanLyDiemSinhVienHAUI;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dong nguyen
 */
public class CustomTableGV extends AbstractTableModel{ 
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã giảng viên","Họ tên","Giới tính","SDT","Email"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,String.class,int.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<GiangVien> dsGiangVien=new ArrayList<GiangVien>();

    //phương thức khởi tạo cho class có tham số truyền vào.

    public CustomTableGV(ArrayList<GiangVien> listGiangVien)
    {
        this.dsGiangVien=listGiangVien;
    }

    @Override
    public int getRowCount() {
        return dsGiangVien.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {

            case 0: return dsGiangVien.get(rowIndex).getMaGV();

            case 1: return dsGiangVien.get(rowIndex).getTenGV();

            case 2: return dsGiangVien.get(rowIndex).getGioiTinh();

            case 3: return dsGiangVien.get(rowIndex).getSoDT();

            case 4: return dsGiangVien.get(rowIndex).getEmail();
           
            default :return null;
        }
    }
    
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
    
    
    
}
