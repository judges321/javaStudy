package com.imooc;

public class PickUp extends Car{
	public int cargo;
	public int manned;
	public PickUp(int NewId,String NewName,int NewRental,int NewManned,int NewCargo){
		this.id = NewId;
		this.name = NewName;
		this.rental = NewRental;
		this.manned = NewManned; 
		this.cargo = NewCargo;
		
	}
}
