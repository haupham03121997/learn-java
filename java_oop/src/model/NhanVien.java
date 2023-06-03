package model;

// abstract class là tính trừu tượng, nó mang đầy đủ 1 class nhưng không khởi tạo được. Nó chỉ dùng để kế thừa
// Điểm khác nhau giữa abstract class và interface:
//  + Abstract class thì khai báo biến được, method(xử lý logic code), định nghĩa hàm, chi kế thừa class hoặc  abstract class 1 lần
//  + Interface - định nghĩa hàm và khai báo hắng số - Kế thừa được nhiều interface khác nhau
public abstract class NhanVien {
    private String fullName;
    private  int age;
    public String getFullName() {
        System.out.println("Fullname" + this.fullName);
        return fullName;
    }

    public double tinhLuong(double luong) {
        return  luong * 2;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
