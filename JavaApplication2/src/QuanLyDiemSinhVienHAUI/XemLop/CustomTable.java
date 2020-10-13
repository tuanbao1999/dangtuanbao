/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QuanLyDiemSinhVienHAUI.XemLop;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dong nguyen
 */
public class CustomTable extends AbstractTableModel {
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã lớp","Tên Lớp","Mã Khoa"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<Lop> dsLop=new ArrayList<Lop>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public CustomTable(ArrayList<Lop> listLop)
   {
       this.dsLop=listLop;
   }
    
    
    
    @Override
    public int getRowCount() {
        return dsLop.size();
    }
    
    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch(columnIndex)
        {

            case 0: return dsLop.get(rowIndex).getMaLop();

            case 1: return dsLop.get(rowIndex).getTenLop();

            case 2: return dsLop.get(rowIndex).getMaKhoa();

            default :return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
