package com.reviewclass30;

public class Secretary1 extends Staff {


		@Override
		void getVehicleType(String vehicleType) {
		this.vehicleType=vehicleType;
		System.out.println(vehicleType);
			
		}

		@Override
		void getName(String name) {
			// TODO Auto-generated method stub
			this.name=name;
			System.out.println(name);
		}

		@Override
		void getAddress(String address) {
			// TODO Auto-generated method stub
			this.address=address;
			System.out.println(address);
		}

		@Override
		void getTelNum(long telNum) {
			// TODO Auto-generated method stub
			this.telNum=telNum;
			System.out.println(telNum);
		}

		@Override
		void computeStipend(double stipend) {
			// TODO Auto-generated method stub
			this.stipend=stipend;
			System.out.println(stipend);
		}
		
	}

