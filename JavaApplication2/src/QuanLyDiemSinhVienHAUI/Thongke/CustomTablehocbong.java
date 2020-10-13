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
public class CustomTablehocbong extends AbstractTableModel {
    
    private String name[] = {"Mã sinh viên","Họ tên","Ngày sinh","Giới tính","Địa chỉ","Điểm TBC học kỳ","Số HP trượt","Số TC hoc","Số TC trong khung","Xét duyệt học bổng"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class, String.class, String.class, String.class,Double.class,Double.class,Double.class,Double.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<DSSinhVienHocBong> ds = new ArrayList<DSSinhVienHocBong>();
    
    
    
    public CustomTablehocbong(ArrayList<DSSinhVienHocBong> listDiem)
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
            
            case 6: return ds.get(rowIndex).getSohptruot();
            
            case 7: return ds.get(rowIndex).getSotc();
            
            case 8: return ds.get(rowIndex).getTbchungtrongkhung();
            
            case 9: return ds.get(rowIndex).getXetduyethocbong();
            

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
