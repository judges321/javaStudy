package com.imooc;

public class SmartPhone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("语音");

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("语音");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("能玩游戏");

	}
	
}
