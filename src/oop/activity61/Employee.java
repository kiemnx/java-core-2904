package oop.activity61;

public abstract class Employee {
    private String name;
    private int age;
    private String identificationNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }


    abstract long getMealAllowance();
    abstract long getSalaryRate();
    abstract int getWorkingCount();

    long calculateSalary(){
        long luong = getWorkingCount() * getSalaryRate() + getMealAllowance();
        return luong;
    }

}
