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
public class CustomTablediem extends AbstractTableModel {
    
    private String name[] = { "Mã môn","Tên môn","Học kỳ","Điểm TX1","Điểm TX2","Điểm giữa kì","Điểm TB","Số tiết nghỉ","Điều kiện dự thi"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class, String.class, Double.class,Double.class,Double.class,Double.class,Double.class,String.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<ketquahoctap> dssv = new ArrayList<ketquahoctap>();
    
    
    public CustomTablediem(ArrayList<ketquahoctap> listdv)
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
            
            case 3: return dssv.get(rowIndex).getDiemTX1();
            
            case 4: return dssv.get(rowIndex).getDiemTX2();
            
            case 5: return dssv.get(rowIndex).getDiemGiuaky();
            
            case 6: return dssv.get(rowIndex).getDiemtb();
            
            case 7: return dssv.get(rowIndex).getSotietnghi();
            
            case 8: return dssv.get(rowIndex).getDieukienduthi();

           
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
