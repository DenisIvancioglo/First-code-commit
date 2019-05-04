package com.reviewclass30;

import java.util.ArrayList;
import java.util.Iterator;

public class StaffPersonEncapsTest {
	public static void main(String[] args) {
		
	
	ArrayList<StaffPerson> department = new ArrayList();

    department.add(new Professor("John Snow","1231fwfs",5437,"Toyota", "12/23/1223",123355678));
    		
    department.add(new Professor("Arias Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878));
    department.add(new Professor("Tom Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878));

    department.add(new Secretary("Anna Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878));
    department.add(new Secretary("More Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878));

    Iterator<StaffPerson> it = department.iterator();

    double departmentSalary=0;

//    while (it.hasNext()) {
//        departmentSalary += it.next().getSalary();
//
//    }
    
    for (StaffPerson abc : department) {
        departmentSalary += abc.getSalary();
    }

    System.out.println("Department salary total = " + (departmentSalary));

}}

