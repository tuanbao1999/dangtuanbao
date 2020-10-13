/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Xem;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tran ngat
 */
public class CustomTable extends AbstractTableModel {
    
    private String name[] = { "Mã khoa","Tên khoa","Trưởng khoa","Số giảng viên","Địa chỉ","Số điện thoại","Email"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class,String.class,Double.class,String.class,String.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<Khoa> dskhoa = new ArrayList<Khoa>();
    
    
    public CustomTable(ArrayList<Khoa> listMonHoc)
   {
       this.dskhoa=listMonHoc;
   }

    @Override
    public int getRowCount() {
        return dskhoa.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {

            case 0: return dskhoa.get(rowIndex).getMaKhoa();

            case 1: return dskhoa.get(rowIndex).getTenKhoa();

            case 2: return dskhoa.get(rowIndex).getTruongkhoa();
            
            case 3: return dskhoa.get(rowIndex).getSogiaovien();
            
            case 4: return dskhoa.get(rowIndex).getDiachi();
            
            case 5: return dskhoa.get(rowIndex).getSDT();
            
            case 6: return dskhoa.get(rowIndex).getEmail();
            
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
