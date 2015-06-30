package com.yxzhang.model;

import java.io.PrintWriter;
/*
 * ���������ֻ࣬�����̳�
 */
public abstract class Component {

	protected String ID="";

	public Component() {
		super();
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public abstract void writeData(PrintWriter pout);
}