/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDiemSinhVienHAUI.DangNhap;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tuan bao
 */
public class CustomTable extends AbstractTableModel {
    
    private String name[] = {"Tên tài khoản", "Mật khẩu","Họ tên","Ngày Sinh","Giới tính","Địa chỉ" };
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class,String.class,String.class,String.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<taikhoan> dstaikhoan = new ArrayList<taikhoan>();
    
    
    public CustomTable(ArrayList<taikhoan> listtaikhoan)
   {
       this.dstaikhoan=listtaikhoan;
   }

    @Override
    public int getRowCount() {
        return dstaikhoan.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {

            case 0: return dstaikhoan.get(rowIndex).getTentaikhoan();

            case 1: return dstaikhoan.get(rowIndex).getMatkhau();
            
            case 2: return dstaikhoan.get(rowIndex).getHoten();
            
            case 3: return dstaikhoan.get(rowIndex).getNgaysinh();
            
            case 4: return dstaikhoan.get(rowIndex).getGioiTinh();
            
            case 5: return dstaikhoan.get(rowIndex).getDiachi();
            

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
