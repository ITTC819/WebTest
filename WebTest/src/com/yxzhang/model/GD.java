package com.yxzhang.model;

import java.io.PrintWriter;

/**
 * @author zyx
 * �ܵ�����
 */
public class GD extends Component{
	private int onoff=1;//�򿪹ر�״̬���򿪣�1���رգ�0
	private double D=0;//�ܾ�
	private double flow=0;//���� ��λm3/s
	/**
	 * @author zyx
	 * ������
	 */	
	public GD(String iD, double d, double f) {
		super();
		ID = iD;
		this.D = d;
		flow=f;
	}	
	/**
	 * @author zyx
	 * ��װ�����ȡ�޸ķ���
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
	 * ����д���ļ����������Ǹ�����󷽷�
	 */
	public void writeData(PrintWriter pout) {
		// TODO �Զ����ɵķ������
//		pout.println("ID:"+ID+"|"
//				+"speed:"+speed+"|"
//				+"flow:"+flow+"|");
		pout.printf("ID:%s|������%3.3f m3/s|���٣�%3.3f m/s|",getID(),getFlow(),getSpeed());
		pout.println();
	}
}
