package com.reviewclass30;

public abstract class StaffPerson {
	String name;
    String adress;
    int salary;
    String vehicleType;
    String hireDate;
    int tellNum;

    public StaffPerson(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super();
        this.name = name;
        this.adress = adress;
        this.salary = salary;
        this.vehicleType = vehicleType;
        this.hireDate = hireDate;
        this.tellNum = tellNum;
    }

    public abstract String getVehicleType();

    public abstract String getName();

    public abstract String getAddress();

    public abstract double getSalary();

    public abstract int getTellNum();

}

