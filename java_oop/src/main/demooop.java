package main;
import model.*;

/**
 * Tính Kế  - Inheritance
 * Tính Đóng Gói - Encapsulation
 * Tính Trừu Tượng - Abstraction
 * Tính Đa Hình - Polymorphism
 */

public class demooop {
    public static void main(String[] args) {
        // Initialization class - syntax : new nameClass
//          NhanVien nguyenVanA = new NhanVien("Pham Xuan hau" , 12);
//        nguyenVanA.fullName = "Pham Xuan Hau";
//        nguyenVanA.age = 24;
//        nguyenVanA.phone = "0373331451";
//        nguyenVanA.gender = "male";
//        double salary =  nguyenVanA.calculatorSalary(200000);
//
//        System.out.println("Kiem Tra" + salary);
//        NhanVien nguyenVanB = new NhanVien();
//        SinhVien sinhVien  = new SinhVien();
//
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Full name is : ");
//        String fullName = myObj.nextLine();
//        System.out.println("Class  is : ");
//        String myClass = myObj.nextLine();
//        System.out.println("Gender is : ");
//        String gender = myObj.nextLine();
//
//        sinhVien.setFullName(fullName) ;
//        sinhVien.setMyClass(myClass);
//        sinhVien.setGender(gender);
//
//        System.out.println("Full name is " + sinhVien.getFullName()  +
//         "My class is" + sinhVien.getMyClass() + " Gender is" + sinhVien.getGender() );

        Manager manger1 = new Manager();
        manger1.setResponsibilityMoney(100);
        manger1.tinhLuong(1000);
        manger1.diCongTac(12 , "Sam Son");

        Director director = new Director();
        director.setFullName("My is Director");
        director.getFullName();

        Labor labor = new Labor();
        labor.tinhLuong();

        // Polymorphism
        NhanVien nhanVien1 = new Director();
        NhanVien nhanVien2 = new Manager();

        // Ép kiểu nhân viên thành Giám đốc này được gọi là tính đa hình
        ((Director) nhanVien2).diCongTac();
    }
}
