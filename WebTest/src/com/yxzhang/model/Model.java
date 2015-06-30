package com.yxzhang.model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author acer1
 *水量计算	
 */
public class Model {
	public static void main(String args[]){
		//取水水池面积常量
		final double MTG_QS_SC01_AREA=35.76;
		final double MTG_QS_SC02_AREA=35.76;
		final double MTG_QS_SC03_AREA=71.52;
		final double MTG_QS_SC04_AREA=32.625;
		final double MTG_QS_SC05_AREA=32.625;
		//取水水池高度常量
		final double MTG_QS_SC01_H=50;
		final double MTG_QS_SC02_H=50;
		final double MTG_QS_SC03_H=50;
		final double MTG_QS_SC04_H=50;
		final double MTG_QS_SC05_H=50;

		//取水管道管径常量
		final double MTG_QS_GD01_DIAM=1;
		final double MTG_QS_GD02_DIAM=1;
		final double MTG_QS_GD03_DIAM=1;
		final double MTG_QS_GD04_DIAM=0.8;
		final double MTG_QS_GD04a_DIAM=0.8;
		final double MTG_QS_GD05_DIAM=0.8;
		final double MTG_QS_GD05a_DIAM=0.8;
		final double MTG_QS_GD06_DIAM=0.8;
		final double MTG_QS_GD07_DIAM=0.8;
		final double MTG_QS_GD08_DIAM=0.8;
		final double MTG_QS_GD09_DIAM=0.8;
		final double MTG_QS_GD010_DIAM=0.8;
		final double MTG_QS_GD011_DIAM=0.8;
		final double MTG_QS_GD012_DIAM=1.1;
		final double MTG_QS_GD013_DIAM=0.9;
		final double MTG_QS_GD014_DIAM=0.9;
		final double MTG_QS_GD015_DIAM=1;
		//混合水池面积常量
		final double MTG_HH_SC01_AREA=8.86;
		final double MTG_HH_SC02_AREA=8.86;
		final double MTG_HH_SC03_AREA=8.86;
		final double MTG_HH_SC04_AREA=8.86;
		//混合水池高度常量
		final double MTG_HH_SC01_H=5;
		final double MTG_HH_SC02_H=5;
		final double MTG_HH_SC03_H=5;
		final double MTG_HH_SC04_H=5;

		//混合管道管径常量
		final double MTG_HH_GD01_DIAM=1;
		final double MTG_HH_GD02_DIAM=1;
		final double MTG_HH_GD01a_DIAM=1;
		final double MTG_HH_GD02a_DIAM=1;
		final double MTG_HH_GD03_DIAM=1;
		final double MTG_HH_GD04_DIAM=1;
		
		final double  g=9.8;
		int n=0;
		double dt=1;
		/*
		 * 数据写入文件设置
		 */
		PrintWriter GDout = null;
		try {
			GDout = new PrintWriter("gd_Data.dat", "UTF-8");
		} catch (FileNotFoundException | UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintWriter SCout = null;
		try {
			SCout = new PrintWriter("sc_Data.dat", "UTF-8");
		} catch (FileNotFoundException | UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*
		 * 初始化取水水池对象
		 */
		SC MTG_QS_SC01 = new SC("MTG_QS_SC01",MTG_QS_SC01_AREA,MTG_QS_SC01_H,0);
		SC MTG_QS_SC02 = new SC("MTG_QS_SC02",MTG_QS_SC02_AREA,MTG_QS_SC02_H,0);
		SC MTG_QS_SC03 = new SC("MTG_QS_SC03",MTG_QS_SC03_AREA,MTG_QS_SC03_H,0);
		SC MTG_QS_SC04 = new SC("MTG_QS_SC04",MTG_QS_SC04_AREA,MTG_QS_SC04_H,0);
		SC MTG_QS_SC05 = new SC("MTG_QS_SC05",MTG_QS_SC05_AREA,MTG_QS_SC05_H,0);
		/*
		 * 初始化取水管道对象
		 */
		GD MTG_QS_GD01 = new GD("MTG_QS_GD01", MTG_QS_GD01_DIAM, 6);
		GD MTG_QS_GD02 = new GD("MTG_QS_GD02", MTG_QS_GD02_DIAM, 6);
		GD MTG_QS_GD03 = new GD("MTG_QS_GD03", MTG_QS_GD03_DIAM, 0);
		GD MTG_QS_GD04 = new GD("MTG_QS_GD04", MTG_QS_GD04_DIAM, 0);
		GD MTG_QS_GD04a = new GD("MTG_QS_GD04a",MTG_QS_GD04a_DIAM, 0);
		GD MTG_QS_GD05 = new GD("MTG_QS_GD05", MTG_QS_GD05_DIAM, 0);
		GD MTG_QS_GD05a = new GD("MTG_QS_GD05a", MTG_QS_GD05a_DIAM, 0);
		GD MTG_QS_GD06 = new GD("MTG_QS_GD06",MTG_QS_GD06_DIAM, 0);
		GD MTG_QS_GD07 = new GD("MTG_QS_GD07", MTG_QS_GD07_DIAM, 0);
		GD MTG_QS_GD08 = new GD("MTG_QS_GD08", MTG_QS_GD08_DIAM, 0);
		GD MTG_QS_GD09 = new GD("MTG_QS_GD09",MTG_QS_GD09_DIAM, 0);
		GD MTG_QS_GD10 = new GD("MTG_QS_GD010",MTG_QS_GD010_DIAM, 0);
		GD MTG_QS_GD11 = new GD("MTG_QS_GD011", MTG_QS_GD011_DIAM, 0);
		GD MTG_QS_GD12 = new GD("MTG_QS_GD012", MTG_QS_GD012_DIAM, 0);
		GD MTG_QS_GD13 = new GD("MTG_QS_GD013", MTG_QS_GD013_DIAM, 0);
		GD MTG_QS_GD14 = new GD("MTG_QS_GD014", MTG_QS_GD014_DIAM, 0);
		GD MTG_QS_GD15 = new GD("MTG_QS_GD015", MTG_QS_GD015_DIAM, 0);
		/*
		 * 初始化取水阀门对象
		 */
		FM MTG_QS_FM01 = new FM("MTG_QS_FM01",MTG_QS_GD04,1);
		FM MTG_QS_FM02 = new FM("MTG_QS_FM02",MTG_QS_GD05,1);
		FM MTG_QS_FM03 = new FM("MTG_QS_FM03",MTG_QS_GD06,1);
		FM MTG_QS_FM04 = new FM("MTG_QS_FM04",MTG_QS_GD09,1);
		/*
		 * 初始化混合池水池对象
		 */
		SC MTG_HH_SC01 = new SC("MTG_HH_SC01",MTG_HH_SC01_AREA,MTG_HH_SC01_H,0);
		SC MTG_HH_SC02 = new SC("MTG_HH_SC02",MTG_HH_SC02_AREA,MTG_HH_SC02_H,0);
		SC MTG_HH_SC03 = new SC("MTG_HH_SC03",MTG_HH_SC03_AREA,MTG_HH_SC03_H,0);
		SC MTG_HH_SC04 = new SC("MTG_HH_SC04",MTG_HH_SC04_AREA,MTG_HH_SC04_H,0);
		/*
		 * 初始化混合池管道对象
		 */
		GD MTG_HH_GD01 = new GD("MTG_HH_GD01", MTG_HH_GD01_DIAM, 0);
		GD MTG_HH_GD02 = new GD("MTG_HH_GD02", MTG_HH_GD02_DIAM, 0);
		GD MTG_HH_GD01a = new GD("MTG_HH_GD01a", MTG_HH_GD01a_DIAM, 0);
		GD MTG_HH_GD02a = new GD("MTG_HH_GD02a", MTG_HH_GD02a_DIAM, 0);
		GD MTG_HH_GD03 = new GD("MTG_HH_GD03", MTG_HH_GD03_DIAM, 0);
		GD MTG_HH_GD04 = new GD("MTG_HH_GD04", MTG_HH_GD04_DIAM, 0);
		/*
		 * 初始化混合池阀门对象
		 */
		FM MTG_HH_FM01 = new FM("MTG_HH_FM01",MTG_HH_GD01,1);
		FM MTG_HH_FM02 = new FM("MTG_HH_FM02",MTG_HH_GD02,1);
		/**
		 * 开始计算
		 */
		try{
			for(n=0;n<=1000;n++){
				GDout.println("时间："+n*dt+"s;	"+"dt="+dt+"s;");
				SCout.println("时间："+n*dt+"s;	"+"dt="+dt+"s;");
				/**
				 * 管道03
				 */
				MTG_QS_GD03.setFlow(MTG_QS_GD01.getFlow()+MTG_QS_GD02.getFlow());//流量 
				/**
				 * 管道04
				 */
				MTG_QS_GD04.setFlow(MTG_QS_GD03.getFlow()*0.5*MTG_QS_FM01.getOnoff());//流量
				/**
				 * 管道05
				 */
				MTG_QS_GD05.setFlow(MTG_QS_GD03.getFlow()*0.5*MTG_QS_FM02.getOnoff());//流量
				/**
				 * 水池01
				 */
				MTG_QS_SC01.setIn(MTG_QS_GD04.getFlow()*dt);//dt时间内进水量
				MTG_QS_SC01.setOut(Math.sqrt(2*g*MTG_QS_SC01.getH()
						)*MTG_QS_GD04a.getS()*dt);//dt时间内出水量
				MTG_QS_SC01.computeVnow();//计算水池实时水量
				/**
				 * 水池02
				 */
				MTG_QS_SC02.setIn(MTG_QS_GD05.getFlow()*dt);//dt时间内进水量
				MTG_QS_SC02.setOut(Math.sqrt(2*g*MTG_QS_SC02.getH()
						)*MTG_QS_GD05a.getS()*dt);//dt时间内出水量
				MTG_QS_SC02.computeVnow();//计算水池实时水量
				//n=1
				/**
				 * 管道04a
				 */
				MTG_QS_GD04a.setFlow(MTG_QS_SC01.getOut());//流量
				/**
				 * 管道05a
				 */
				MTG_QS_GD05a.setFlow(MTG_QS_SC02.getOut());//流量
				//n=2
				/**
				 * 管道07
				 */
				MTG_QS_GD07.setSpeed(Math.sqrt(2*g*MTG_QS_SC03.getH()));//流速
				/**
				 * 管道08
				 */
				MTG_QS_GD08.setSpeed(MTG_QS_GD07.getSpeed());//流速
				/**
				 * 管道06
				 */
				MTG_QS_GD06.setSpeed(MTG_QS_GD07.getSpeed()*MTG_QS_FM03.getOnoff());//流速
				/**
				 * 管道09
				 */
				MTG_QS_GD09.setSpeed(MTG_QS_GD07.getSpeed()*MTG_QS_FM04.getOnoff());//流速
				//n=1
				/**
				 * 水池03
				 */
				MTG_QS_SC03.setIn(MTG_QS_GD04a.getFlow()*dt+MTG_QS_GD05a.getFlow()*dt);//dt时间内进水量
				MTG_QS_SC03.setOut((MTG_QS_GD06.getFlow()+MTG_QS_GD07.getFlow()+MTG_QS_GD08.getFlow()+MTG_QS_GD09.getFlow())*dt);//dt时间内出水量    //n=2
				MTG_QS_SC03.computeVnow();//计算水池实时水量
				//n=2
				/**
				 * 取水管道10
				 */
				MTG_QS_GD10.setFlow(MTG_QS_GD10.getSpeed()*MTG_QS_GD10.getS());//流量
				MTG_QS_GD10.setSpeed(Math.sqrt(2*g*MTG_QS_SC04.getH()));//流速
				/**
				 * 取水管道11
				 */
				MTG_QS_GD11.setFlow(MTG_QS_GD11.getSpeed()*MTG_QS_GD11.getS());//流量
				MTG_QS_GD11.setSpeed(Math.sqrt(2*g*MTG_QS_SC05.getH()));//流速
				//n=2
				/**
				 * 取水管道13
				 */
				MTG_QS_GD13.setFlow(MTG_QS_GD10.getFlow());//流量
				/**
				 * 取水管道14
				 */
				MTG_QS_GD14.setFlow(MTG_QS_GD11.getFlow());//流量
				//n=2
				/**
				 * 水池04
				 */
				MTG_QS_SC04.setIn(MTG_QS_GD06.getFlow()*dt+MTG_QS_GD07.getFlow()*dt);//dt时间内进水量
				MTG_QS_SC04.setOut(MTG_QS_GD10.getFlow()*dt);//dt时间内出水量  //n=3
				MTG_QS_SC04.computeVnow();//计算水池实时水量
				//n=2
				/**
				 * 水池05
				 */
				MTG_QS_SC05.setIn(MTG_QS_GD08.getFlow()*dt+MTG_QS_GD09.getFlow()*dt);//dt时间内进水量
				MTG_QS_SC05.setOut(MTG_QS_GD11.getFlow()*dt);//dt时间内出水量  //n=3
				MTG_QS_SC05.computeVnow();//计算水池实时水量
				/**
				 * 取水管道13的流量为混合池管道01的流量
				 * 取水管道14的流量为混合池管道02的流量
				 */
				MTG_HH_GD01.setFlow(MTG_QS_GD13.getFlow());
				MTG_HH_GD02.setFlow(MTG_QS_GD14.getFlow());
				/**
				 * 混合池水池01
				 */
				MTG_HH_SC01.setIn(MTG_HH_GD01.getFlow()*dt*MTG_HH_FM01.getOnoff());//dt时间内进水量
				MTG_HH_SC01.setOut(Math.sqrt(2*g*MTG_HH_SC01.getH()
						)*MTG_HH_GD01a.getS()*dt);//dt时间内出水量
				MTG_HH_SC01.computeVnow();//计算水池实时水量
				/**
				 * 混合池水池02
				 */
				MTG_HH_SC02.setIn(MTG_HH_GD02.getFlow()*dt*MTG_HH_FM02.getOnoff());//dt时间内进水量
				MTG_HH_SC02.setOut(Math.sqrt(2*g*MTG_HH_SC02.getH()
						)*MTG_HH_GD02a.getS()*dt);//dt时间内出水量
				MTG_HH_SC02.computeVnow();//计算水池实时水量
				//n=1
				/**
				 * 混合池管道01a
				 */
				MTG_HH_GD01a.setFlow(MTG_HH_SC01.getOut());//流量
				/**
				 * 混合池管道02a
				 */
				MTG_HH_GD02a.setFlow(MTG_HH_SC02.getOut());//流量
				//n=2
				/**
				 * 混合池管道3
				 */
				MTG_HH_GD03.setFlow(0);//流量
				/**
				 * 混合池管道4
				 */
				MTG_HH_GD04.setFlow(0);//流量
				//n=2
				/**
				 * 混合池水池03
				 */
				MTG_HH_SC03.setIn(MTG_HH_GD01a.getFlow()*dt);//dt时间内进水量
				MTG_HH_SC03.setOut(MTG_HH_GD03.getFlow()*dt);
				MTG_HH_SC03.computeVnow();//计算水池实时水量
				/**
				 * 混合池水池04
				 */
				MTG_HH_SC04.setIn(MTG_HH_GD02a.getFlow()*dt);//dt时间内进水量
				MTG_HH_SC04.setOut(MTG_HH_GD04.getFlow()*dt);
				MTG_HH_SC04.computeVnow();//计算水池实时水量
				/**
				 * 将t=n秒时管道数据的数据写入gd_data.dat文件
				 */
				MTG_QS_GD01.writeData(GDout);//写入数据
				MTG_QS_GD02.writeData(GDout);//写入数据
				MTG_QS_GD03.writeData(GDout);//写入数据
				MTG_QS_GD04.writeData(GDout);//写入数据
				MTG_QS_GD05.writeData(GDout);//写入数据
				MTG_QS_GD04a.writeData(GDout);//写入数据
				MTG_QS_GD05a.writeData(GDout);//写入数据
				MTG_QS_GD06.writeData(GDout);//写入数据
				MTG_QS_GD07.writeData(GDout);//写入数据
				MTG_QS_GD08.writeData(GDout);//写入数据
				MTG_QS_GD09.writeData(GDout);//写入数据
				MTG_QS_GD10.writeData(GDout);//写入数据
				MTG_QS_GD11.writeData(GDout);//写入数据
				/**
				 * 将t=n秒时水池数据的数据写入sc_data.dat文件
				 */
				MTG_QS_SC01.writeData(SCout);//写入数据
				MTG_QS_SC02.writeData(SCout);//写入数据
				MTG_QS_SC03.writeData(SCout);//写入数据
				MTG_QS_SC04.writeData(SCout);//写入数据
				MTG_QS_SC05.writeData(SCout);//写入数据
				/**
				 * 将t=n秒时混合池管道数据的数据写入gdhh_data.dat文件
				 */
				MTG_HH_GD01.writeData(GDout);//写入数据
				MTG_HH_GD02.writeData(GDout);//写入数据
				MTG_HH_GD01a.writeData(GDout);//写入数据
				MTG_HH_GD02a.writeData(GDout);//写入数据
				MTG_HH_GD03.writeData(GDout);//写入数据
				MTG_HH_GD04.writeData(GDout);//写入数据
				
				/**
				 * 将t=n秒时混合池水池数据的数据写入schh_data.dat文件
				 */
				MTG_HH_SC01.writeData(SCout);//写入数据
				MTG_HH_SC02.writeData(SCout);//写入数据
				MTG_HH_SC03.writeData(SCout);//写入数据
				MTG_HH_SC04.writeData(SCout);//写入数据
			}
			}
		catch(Exception e){
			SCout.println(e.getMessage());
		}
		
	}
}
