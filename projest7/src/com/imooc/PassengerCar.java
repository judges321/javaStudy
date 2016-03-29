package com.imooc;

public class PassengerCar extends Car {
	public int manned;
	public PassengerCar (int NewId,String NewName,int NewRental,int NewManned){
		this.id = NewId;
		this.name = NewName;
		this.rental = NewRental;
		this.manned = NewManned; 
	}
}
