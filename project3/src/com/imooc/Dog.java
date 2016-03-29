package com.imooc;

public class Dog extends Animal {
	int age = 10;
	public void eat(){
		System.out.println(age+"狗能吃骨头");
	}

	public void method(){
		super.eat();
	}
	public Dog(){
		super();
		System.out.println("dog类执行了");
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
