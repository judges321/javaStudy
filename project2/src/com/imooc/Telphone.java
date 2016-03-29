package com.imooc;

public class Telphone {
	private float screen;
	private float cpu;
	private float mem;
	public void sendMessage(){
		
	}
	public float getScreen(){
		return screen;
	}
	public void setScreen(float newScreen){
		this.screen = newScreen;
	}
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public float getMem() {
		return mem;
	}
	public void setMem(float mem) {
		this.mem = mem;
	}
	public Telphone(){
		System.out.println("无参的构造方法");
	}
	
	public Telphone(float newScreen,float newCpu,float newMem){
	
	if(newScreen<3.5){
		System.out.println("你输入值有问题");

		screen = 3.5f;
	}else{
		screen = newScreen;

	}
	cpu = newCpu;
	mem = newMem;
	System.out.println("有参的构造方法");
	}
	
}
