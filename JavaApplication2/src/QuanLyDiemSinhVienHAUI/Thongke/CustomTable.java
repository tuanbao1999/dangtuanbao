/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Thongke;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tuanbao
 */
public class CustomTable extends AbstractTableModel {
    
    private String name[] = {"Mã sinh viên","Họ tên","Ngày sinh","Giới tính","Địa chỉ","Điểm TBC học kỳ","Số TC học"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class, String.class, String.class, String.class,Double.class,Double.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<DiemSV> ds = new ArrayList<DiemSV>();
    
    
    public CustomTable(ArrayList<DiemSV> listDiem)
   {
       this.ds=listDiem;
   }

    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {

            case 0: return ds.get(rowIndex).getMaSinhVien();

            case 1: return ds.get(rowIndex).getHoTen();

            case 2: return ds.get(rowIndex).getNgaySinh();
            
            case 3: return ds.get(rowIndex).getGioiTinh();
            
            case 4: return ds.get(rowIndex).getDiaChi();
            
            case 5: return ds.get(rowIndex).getDiemtbchocky();
            
            case 6: return ds.get(rowIndex).getSotc();
            

            default :return null;
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
