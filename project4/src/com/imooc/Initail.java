package com.imooc;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Animal obj1 = new Animal();
//	Animal obj2 = new Dog();
//	Animal obj3 = new Cat();
//	obj1.eat();
//	obj2.eat();
//	obj3.eat();

		Dog dog = new Dog();
		Animal animal = dog;//自动类型提升 向上类型
		Dog dog2 = (Dog)animal;//强制类型转换 向下类型转换
		if(animal instanceof Cat){ 
		Cat cat = (Cat)animal;
		}else{
			System.out.println("noway");
		}
	}

}
