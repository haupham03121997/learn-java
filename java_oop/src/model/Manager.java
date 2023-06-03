package model;
import model.*;

public class Manager extends NhanVien {
    private  double responsibilityMoney;

    public double getResponsibilityMoney() {
        return responsibilityMoney;
    }

    public void setResponsibilityMoney(double responsibilityMoney) {
        this.responsibilityMoney = responsibilityMoney;
    }

    @Override // Ghi đè cái ham tính lương của thằng cha SinhVien
    public double tinhLuong(double luong) {

        System.out.println("tien " + super.tinhLuong(luong + this.responsibilityMoney));
        return super.tinhLuong(luong + this.responsibilityMoney);
    }

    // Overload - hàm trùng tên nhưng khác nhau về kiểu dữ liệu & tham số - Tính đa hình dạng runtime
    public void diCongTac (){
        System.out.println("Đây là hàm đi công tác" );
    }

    public double diCongTac (int thoiGianDiCongTac){
        System.out.println("Đây là hàm kiểm tra thời gian công tác" + thoiGianDiCongTac);
        return  12;
    }

    public double diCongTac (int thoiGianDiCongTac, String diaDiem){
        System.out.println("Đây là hàm kiểm tra thời gian công tác + địa điểm" + thoiGianDiCongTac + diaDiem);
        return  12;
    }
}
