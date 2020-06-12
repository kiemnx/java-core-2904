package oop.activity52;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String name, int age, String gender, String address, int bac1, int bac2, int bac3, int bac4, int bac5, int bac6, int bac7, int bac8, int bac9, int bac10) {
        super(name, age, gender, address);
        this.bac = bac;
    }

    public CongNhan() {
    }

    public int getBac() {
        return bac;
    }
    public void setBac1(int bac) {
        this.bac = bac;
    }
}
