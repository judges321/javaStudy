package com.imooc;

public class Animal {
	public int age = 10;
	
	@Override
	public String toString() {
		return "Animal [age=" + age + "]";
	}

	public String name;
	public void eat(){
		final int i = 10;

		System.out.println(age+"动物能吃东西");
	}
	
	public Animal(){
		
		System.out.println("anima类构造执行");
		age = 20;
	}
//	public Animal(int age){
//		
//		this.age=age; 
//	}
}
