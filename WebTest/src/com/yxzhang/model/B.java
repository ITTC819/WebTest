package com.yxzhang.model;

import java.io.PrintWriter;
/*
 * ˮ�ö���
 */
public class B extends Component {
	private double p; //ˮѹ
	private double vIn; //�������
	private double vOut;//��������
	private GD OutGD;//���ùܵ�����
	/*
	 * �޲ι�����
	 */
	public  B(){
		ID = "null";
		p = 0;
		vIn = 0;
		vIn = 0;
		OutGD = null;
	}
	/*
	 * ������
	 */
	public B(String iD, double p, double vIn, double vOut, GD outGD) {
		ID = iD;
		this.p = p;
		this.vIn = vIn;
		this.vOut = vOut;
		OutGD = outGD;
	}
	/*
	 * ��װ�����ȡ�޸ķ���
	 */
	public GD getOutGD() {
		return OutGD;
	}

	public double getP() {
		return p;
	}

	public double getVin() {
		return vIn;
	}

	public double getVOut() {
		return vIn;
	}

	public void setOutGD(GD outGD) {
		OutGD = outGD;
	}

	public void setP(double p) {
		this.p = p;
	}

	public void setVin(double vIn) {
		this.vIn = vIn;
	}

	public void setVOut(double vOut) {
		vIn = vOut;
	}
	/*
	 * ����д���ļ����������Ǹ�����󷽷�
	 */
	@Override
	public void writeData(PrintWriter pout) {
		// TODO �Զ����ɵķ������
		pout.println("ID:"+ID+"|"
				+"p:"+p+"|"
				+"OutGD:"+OutGD.ID+"|"
				+"vin:"+vIn+"|"
				+"vout:"+vOut+"|");
		
	}
	
}
