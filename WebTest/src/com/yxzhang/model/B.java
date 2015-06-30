package com.yxzhang.model;

import java.io.PrintWriter;
/*
 * 水泵对象
 */
public class B extends Component {
	private double p; //水压
	private double vIn; //入泵流速
	private double vOut;//出泵流速
	private GD OutGD;//出泵管道对象
	/*
	 * 无参构造器
	 */
	public  B(){
		ID = "null";
		p = 0;
		vIn = 0;
		vIn = 0;
		OutGD = null;
	}
	/*
	 * 构造器
	 */
	public B(String iD, double p, double vIn, double vOut, GD outGD) {
		ID = iD;
		this.p = p;
		this.vIn = vIn;
		this.vOut = vOut;
		OutGD = outGD;
	}
	/*
	 * 封装对象读取修改方法
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
	 * 数据写入文件方法，覆盖父类抽象方法
	 */
	@Override
	public void writeData(PrintWriter pout) {
		// TODO 自动生成的方法存根
		pout.println("ID:"+ID+"|"
				+"p:"+p+"|"
				+"OutGD:"+OutGD.ID+"|"
				+"vin:"+vIn+"|"
				+"vout:"+vOut+"|");
		
	}
	
}
