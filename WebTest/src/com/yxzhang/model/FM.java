package com.yxzhang.model;

import java.io.PrintWriter;
/*
 * 阀门对象
 */
public class FM extends Component{
	private GD carrier;//载体管道对象
	private int onoff;//打开关闭状态，打开：1，关闭：0
	/*
	 * 构造器
	 */	
	public FM(String iD, GD carrier, int onoff) {
		ID = iD;
		this.carrier = carrier;
		this.onoff = onoff;
	}
	/*
	 * 封装对象读取修改方法
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
	 * 数据写入文件方法，覆盖父类抽象方法
	 */
	@Override
	public void writeData(PrintWriter pout) {
		// TODO 自动生成的方法存根
		pout.println("ID:"+ID+"|"
				+"onoff:"+onoff+"|");
	}
	
	
}
