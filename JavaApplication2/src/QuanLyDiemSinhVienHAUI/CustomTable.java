package QuanLyDiemSinhVienHAUI;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class CustomTable extends AbstractTableModel
{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã sinh viên","Họ tên","Ngày sinh","Giới tính","Địa chỉ","Mã lớp"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,String.class,String.class,String.class,String.class};
    //Tạo một đối tượng arrayList có tên listSinhVien
    ArrayList<SinhVien> dsSinhVien=new ArrayList<SinhVien>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public CustomTable(ArrayList<SinhVien> listSinhVien)
   {
       this.dsSinhVien=listSinhVien;
   }
    @Override
    public int getRowCount()
    {
        return dsSinhVien.size();
    }
    //Lấy số lượng tiêu để của mảng.
    @Override
    public int getColumnCount()
    {
        return name.length;
    }
    //Đưa thông tin của phần tử trong arrayList lên jTable
    public Object getValueAt(int rowIndex,int columnIndex)
    {
        switch(columnIndex)
        {

            case 0: return dsSinhVien.get(rowIndex).getMaSinhVien();

            case 1: return dsSinhVien.get(rowIndex).getHoTen();

            case 2: return dsSinhVien.get(rowIndex).getNgaySinh();

            case 3: return dsSinhVien.get(rowIndex).getGioiTinh();

            case 4: return dsSinhVien.get(rowIndex).getDiaChi();
            
            case 5: return dsSinhVien.get(rowIndex).getMaLop();
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}
