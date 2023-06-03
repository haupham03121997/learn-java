package model;

public class SinhVien {
    private String fullName;
    private String myClass;
    private String gender;

    public SinhVien (String fullName , String myClass , String gender ) {
        this.fullName = fullName;
        this.myClass= myClass ;
        this.gender = gender;
    }

    public  SinhVien(){}
    double averageOfSubject (double math , double physical , double chemistry ) {
        return  (math + physical + chemistry) / 3;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
