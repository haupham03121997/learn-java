package model;

public class Labor extends NhanVien implements  ChucNang{

    @Override
    public void tinhLuong() {
     System.out.println("Luong lao cong");
    }
}
