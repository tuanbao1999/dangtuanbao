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
public class CustomTablediemthi extends AbstractTableModel {
    
    private String name[] = { "Mã môn","Tên môn","Học kỳ","Số tín chỉ","Điểm TB","Điểm thi","Trung bình môn(Điểm 10)","Trung bình môn(Điểm 4) ","Điểm chữ","Xếp loại"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class, String.class, Double.class,Double.class,Double.class,Double.class,Double.class,String.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<ketquathi> dssv = new ArrayList<ketquathi>();
    
    
    public CustomTablediemthi(ArrayList<ketquathi> listdv)
   {
       this.dssv=listdv;
   }

    @Override
    public int getRowCount() {
        return dssv.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {

            case 0: return dssv.get(rowIndex).getMaMon();

            case 1: return dssv.get(rowIndex).getTenmon();
            
            case 2: return dssv.get(rowIndex).getHocky();
            
            case 3: return dssv.get(rowIndex).getSotc();
            
            case 4: return dssv.get(rowIndex).getDiemtb();
            
            case 5: return dssv.get(rowIndex).getDiemthi();
            
            case 6: return dssv.get(rowIndex).getDiemtk10();
            
            case 7: return dssv.get(rowIndex).getDiemtk4();
            
            case 8: return dssv.get(rowIndex).getDiemchu();
            
            case 9: return dssv.get(rowIndex).getXeploai();

           
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
