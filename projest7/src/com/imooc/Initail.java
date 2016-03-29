package com.imooc;
import java.util.Scanner;
public class Initail {

	public static void main(String[] args) {

		Car[] cars = {new PassengerCar(1,"奥迪A4",500,4),new PassengerCar(2,"马自达6",400,4),new PickUp(3,"皮卡雪6",450,4,2),new Trunk(4,"松花江",400,4)};
		
		// TODO Auto-generated method stub
		System.out.println("欢迎使用答答租车系统／n您是否要租车：1是0否");
		 Scanner scan = new Scanner(System.in);
		 int chance = scan.nextInt();
		if(chance == 1){
		System.out.println("您可租车的类型及其价目表：");

		System.out.printf("%s\t%s\t%s\t\t%s\n", "序号", "汽车名称", "租金", "容量");
			for(int i=0 ; i<cars.length;i++){
					String out = cars[i].id+"	"+cars[i].name+"	"+cars[i].rental+"元／天"+"\t";
					if(cars[i] instanceof PassengerCar){
						PassengerCar passenger = (PassengerCar)cars[i];
						out +="载人："+passenger.manned+" ";
					}else if(cars[i] instanceof Trunk){
						Trunk trunk = (Trunk)cars[i];
						out +="载货："+trunk.cargo+" ";
					}else if(cars[i] instanceof PickUp){
						PickUp pickUp = (PickUp)cars[i];
						out +="载货："+pickUp.cargo+" "+"载人："+pickUp
								.manned+" ";
					}
					System.out.println(out);
			}
			
		System.out.println("请输入汽车数目");	
		 int carNum = scan.nextInt();
		 
		for(int i= 0;i<carNum;i++){
			System.out.println("请输入第"+(i+1)+"辆车的序号：");
//			rentNum[i-1] = scan.nextInt();
		}
		
		
		
		
		
			
		}else{
			System.out.println("安全退出");
			

			

		}
		
	}

}
