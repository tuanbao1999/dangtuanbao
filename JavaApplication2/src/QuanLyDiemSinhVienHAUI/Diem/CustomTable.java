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
public class CustomTable extends AbstractTableModel {
    
    private String name[] = {"Mã Sinh Viên", "Họ Tên","Điểm Thường Xuyên 1","Điểm Thường Xuyên 2","Điểm Giữa Kỳ","Điểm Trung Bình","Số Tiết Nghỉ","Điều Kiện Dự Thi" };
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class,Double.class,Double.class,Double.class,Double.class,Double.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<Ketqua> dsdiem = new ArrayList<Ketqua>();
    
    
    public CustomTable(ArrayList<Ketqua> listtaikhoan)
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
            
            case 2: return dsdiem.get(rowIndex).getDiemTX1();
            
            case 3: return dsdiem.get(rowIndex).getDiemTX2();
            
            case 4: return dsdiem.get(rowIndex).getDiemGiuaKy();
            
            case 5: return dsdiem.get(rowIndex).getDiemTrungBinh();
            
            case 6: return dsdiem.get(rowIndex).getSoTietNghi();
            
            case 7: return dsdiem.get(rowIndex).getDieuKienDuThi();

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
