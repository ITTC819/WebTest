package com.yxzhang.model;

import java.io.PrintWriter;

/**
 * @author zyx
 * 管道对象
 */
public class GD extends Component{
	private int onoff=1;//打开关闭状态，打开：1，关闭：0
	private double D=0;//管径
	private double flow=0;//流量 单位m3/s
	/**
	 * @author zyx
	 * 构造器
	 */	
	public GD(String iD, double d, double f) {
		super();
		ID = iD;
		this.D = d;
		flow=f;
	}	
	/**
	 * @author zyx
	 * 封装对象读取修改方法
	 */
	public int getOnoff() {
		return onoff;
	}
	public void setOnoff(int onoff) {
		this.onoff = onoff;
	}
	
	public double getSpeed() {
		return getFlow()/getS();
	}
	public void setSpeed(double speed) {
		setFlow(speed*getS());;
	}
	public double getFlow() {
		return flow;
	}
	public void setFlow(double flow) {
		this.flow = flow;
	}
	
	public double getD() {
		return D;
	}
	public void setD(double d) {
		D = d;
	}
	public double getS() {
		return (Math.sqrt(getD()/2))*Math.PI;
	}
	/*
	 * 数据写入文件方法，覆盖父类抽象方法
	 */
	public void writeData(PrintWriter pout) {
		// TODO 自动生成的方法存根
//		pout.println("ID:"+ID+"|"
//				+"speed:"+speed+"|"
//				+"flow:"+flow+"|");
		pout.printf("ID:%s|流量：%3.3f m3/s|流速：%3.3f m/s|",getID(),getFlow(),getSpeed());
		pout.println();
	}
}
