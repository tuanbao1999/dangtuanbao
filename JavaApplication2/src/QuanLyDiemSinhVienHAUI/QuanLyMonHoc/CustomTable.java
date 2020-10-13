/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.QuanLyMonHoc;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dong nguyen
 */
public class CustomTable extends AbstractTableModel {
    
    private String name[] = {"Mã môn", "Tên môn", "Số tín chỉ", "Mã giảng viên", "Học kỳ", "Mã khoa"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class, int.class, String.class, String.class, String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
    
    
    public CustomTable(ArrayList<MonHoc> listMonHoc)
   {
       this.dsMonHoc=listMonHoc;
   }

    @Override
    public int getRowCount() {
        return dsMonHoc.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {

            case 0: return dsMonHoc.get(rowIndex).getMaMon();

            case 1: return dsMonHoc.get(rowIndex).getTenMon();

            case 2: return dsMonHoc.get(rowIndex).getSoTC();

            case 3: return dsMonHoc.get(rowIndex).getMaGV();

            case 4: return dsMonHoc.get(rowIndex).getHocKy();
            
            case 5: return dsMonHoc.get(rowIndex).getMaKhoa();
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
