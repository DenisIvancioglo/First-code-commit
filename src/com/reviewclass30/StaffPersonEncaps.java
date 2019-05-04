package com.reviewclass30;

public class StaffPersonEncaps {
	 private String name;
	    private String adress;
	    private int salary;
	    private String vehicleType;
	    private String hireDate;
	    private int tellNum;

	    public StaffPersonEncaps(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
	        super();
	        this.name = name;
	        this.adress = adress;
	        this.salary = salary;
	        this.vehicleType = vehicleType;
	        this.hireDate = hireDate;
	        this.tellNum = tellNum;
	    }

	    public String getAddress() {
	        // TODO Auto-generated method stub
	        return null;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getAdress() {
	        return adress;
	    }

	    public void setAdress(String adress) {
	        this.adress = adress;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	    public String getVehicleType() {
	        return vehicleType;
	    }

	    public void setVehicleType(String vehicleType) {
	        this.vehicleType = vehicleType;
	    }

	    public String getHireDate() {
	        return hireDate;
	    }

	    public void setHireDate(String hireDate) {
	        this.hireDate = hireDate;
	    }

	    public int getTellNum() {
	        return tellNum;
	    }

	    public void setTellNum(int tellNum) {
	        this.tellNum = tellNum;
	    }
}
