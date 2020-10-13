/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.Diem;



import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tuan bao
 */
public class CustomTablethi extends AbstractTableModel {
    
    private String name[] = {"Mã Sinh Viên", "Họ Tên","Điểm Thi","Điểm tổng kết (điểm 10)","Điểm tổng kết (điểm 4)","Điểm chữ","Xếp loại" };
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class,Double.class,Double.class,Double.class,String.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<Ketqua> dsdiem = new ArrayList<Ketqua>();
    
    
    public CustomTablethi(ArrayList<Ketqua> listtaikhoan)
   {
       this.dsdiem=listtaikhoan;
   }

    @Override
    public int getRowCount() {
        return dsdiem.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {

            case 0: return dsdiem.get(rowIndex).getMaSinhVien();

            case 1: return dsdiem.get(rowIndex).getHoTen();
            
            case 2: return dsdiem.get(rowIndex).getDiemthy();
            
            case 3: return dsdiem.get(rowIndex).getDiemTongKetDiem10();
            
            case 4: return dsdiem.get(rowIndex).getDiemTongketDiem4();
            
            case 5: return dsdiem.get(rowIndex).getDiemChu();
            
            case 6: return dsdiem.get(rowIndex).getXepLoai();
            

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
