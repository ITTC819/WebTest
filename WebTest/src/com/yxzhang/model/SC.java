package com.yxzhang.model;

import java.io.PrintWriter;

/**
 * @author zyx
 * ˮ�ض���
 */
public class SC extends Component{
	private double vNow=0; //ʵʱˮ��
	private double S=0; //�����	
	private double Height=5;//ˮ�ظ߶�
	private double in=0;//��ˮ����
	private double out=0;//��ˮ����
	/**
	 * @author zyx
	 * ������
	 */	
	public SC(String iD,double s,double height,double vnow) {
		ID = iD;
		S = s;
		Height=height;
		vNow = vnow;
	}
	/**
	 * @author zyx
	 * ��װ�����ȡ�޸ķ���
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
	 * ����д���ļ����������Ǹ�����󷽷�
	 */
//	public void testFull() throws Exception{
//		if(getvNow()>=175){
//			throw new Exception(getID());
//		}
//	}
	public void writeData(PrintWriter pout) {
//		// TODO �Զ����ɵķ������
//		pout.println("ID:"+ID+"|"
//				+"vNow:"+vNow+"|"
//				+"h:"+h+"|"
//				+"in:"+in+"|"
//				+"out:"+out+"|");
//		if(getvNow()>=175){
//			System.exit(0);
//		}
		pout.printf("ID:%s|ʵʱˮ����%5.3f������|�߶ȣ�%4.3f��|��ˮ����%3.3f������|��ˮ����%3.3f������|",getID(),getvNow(),getH(),getIn(),getOut());
		pout.println();
	}
}
