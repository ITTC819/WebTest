package com.yxzhang.model;

import java.io.PrintWriter;
/*
 * ���Ŷ���
 */
public class FM extends Component{
	private GD carrier;//����ܵ�����
	private int onoff;//�򿪹ر�״̬���򿪣�1���رգ�0
	/*
	 * ������
	 */	
	public FM(String iD, GD carrier, int onoff) {
		ID = iD;
		this.carrier = carrier;
		this.onoff = onoff;
	}
	/*
	 * ��װ�����ȡ�޸ķ���
	 */
	public GD getCarrier() {
		return carrier;
	}

	public void setCarrier(GD carrier) {
		this.carrier = carrier;
	}

	public int getOnoff() {
		return onoff;
	}

	public void setOnoff(int onoff) {
		this.onoff = onoff;
	}
	/*
	 * ����д���ļ����������Ǹ�����󷽷�
	 */
	@Override
	public void writeData(PrintWriter pout) {
		// TODO �Զ����ɵķ������
		pout.println("ID:"+ID+"|"
				+"onoff:"+onoff+"|");
	}
	
	
}
