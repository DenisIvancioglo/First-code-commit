package com.reviewclass30;

public class SecretaryEn extends StaffPersonEncaps{
    public SecretaryEn(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
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
        return super.getAdress();
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
