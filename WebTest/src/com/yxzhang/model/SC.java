package com.yxzhang.model;

import java.io.PrintWriter;

/**
 * @author zyx
 * 水池对象
 */
public class SC extends Component{
	private double vNow=0; //实时水量
	private double S=0; //底面积	
	private double Height=5;//水池高度
	private double in=0;//入水流量
	private double out=0;//出水流量
	/**
	 * @author zyx
	 * 构造器
	 */	
	public SC(String iD,double s,double height,double vnow) {
		ID = iD;
		S = s;
		Height=height;
		vNow = vnow;
	}
	/**
	 * @author zyx
	 * 封装对象读取修改方法
	 * @throws Exception 
	 */	
	public void computeVnow(){
		vNow =getIn()-getOut()+getvNow();
	}
	public double getvNow() {
		return vNow;
	}

	public void setvNow(double vNow) {
		this.vNow = vNow;
	}

	public double getS() {
		return S;
	}

	public void setS(double s) {
		S = s;
	}

	public double getH() {
		return getvNow()/getS();
	}

	public void setH(double h) {
		vNow = h*getS();
	}

	public double getIn() {
		return in;
	}

	public void setIn(double in) {
		this.in = in;
	}

	public double getOut() {
		return out;
	}

	public void setOut(double out) {
		this.out = out;
	}
	
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	/*
	 * 数据写入文件方法，覆盖父类抽象方法
	 */
//	public void testFull() throws Exception{
//		if(getvNow()>=175){
//			throw new Exception(getID());
//		}
//	}
	public void writeData(PrintWriter pout) {
//		// TODO 自动生成的方法存根
//		pout.println("ID:"+ID+"|"
//				+"vNow:"+vNow+"|"
//				+"h:"+h+"|"
//				+"in:"+in+"|"
//				+"out:"+out+"|");
//		if(getvNow()>=175){
//			System.exit(0);
//		}
		pout.printf("ID:%s|实时水量：%5.3f立方米|高度：%4.3f米|进水量：%3.3f立方米|出水量：%3.3f立方米|",getID(),getvNow(),getH(),getIn(),getOut());
		pout.println();
	}
}
