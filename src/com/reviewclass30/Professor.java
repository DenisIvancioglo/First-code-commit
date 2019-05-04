package com.reviewclass30;

public class Professor extends StaffPerson {
	public Professor(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super(name, adress, salary, vehicleType, hireDate, tellNum);
    }

    @Override
    public String getVehicleType() {
        return super.vehicleType;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String getAddress() {
        return super.adress;
    }

    @Override
    public double getSalary() {
        return super.salary;
    }

    @Override
    public int getTellNum() {
        return super.tellNum;
    }
}
