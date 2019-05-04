package com.reviewclass30;

public class ProfessorEn extends StaffPersonEncaps {
	public ProfessorEn(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super(name, adress, salary, vehicleType, hireDate, tellNum);
    }

    @Override
    public String getVehicleType() {
        return super.getVehicleType();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public int getTellNum() {
        return super.getTellNum();
    }
}
