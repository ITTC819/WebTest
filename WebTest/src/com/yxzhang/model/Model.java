package com.yxzhang.model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author acer1
 *ˮ������	
 */
public class Model {
	public static void main(String args[]){
		//ȡˮˮ���������
		final double MTG_QS_SC01_AREA=35.76;
		final double MTG_QS_SC02_AREA=35.76;
		final double MTG_QS_SC03_AREA=71.52;
		final double MTG_QS_SC04_AREA=32.625;
		final double MTG_QS_SC05_AREA=32.625;
		//ȡˮˮ�ظ߶ȳ���
		final double MTG_QS_SC01_H=50;
		final double MTG_QS_SC02_H=50;
		final double MTG_QS_SC03_H=50;
		final double MTG_QS_SC04_H=50;
		final double MTG_QS_SC05_H=50;

		//ȡˮ�ܵ��ܾ�����
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
		//���ˮ���������
		final double MTG_HH_SC01_AREA=8.86;
		final double MTG_HH_SC02_AREA=8.86;
		final double MTG_HH_SC03_AREA=8.86;
		final double MTG_HH_SC04_AREA=8.86;
		//���ˮ�ظ߶ȳ���
		final double MTG_HH_SC01_H=5;
		final double MTG_HH_SC02_H=5;
		final double MTG_HH_SC03_H=5;
		final double MTG_HH_SC04_H=5;

		//��Ϲܵ��ܾ�����
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
		 * ����д���ļ�����
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
		 * ��ʼ��ȡˮˮ�ض���
		 */
		SC MTG_QS_SC01 = new SC("MTG_QS_SC01",MTG_QS_SC01_AREA,MTG_QS_SC01_H,0);
		SC MTG_QS_SC02 = new SC("MTG_QS_SC02",MTG_QS_SC02_AREA,MTG_QS_SC02_H,0);
		SC MTG_QS_SC03 = new SC("MTG_QS_SC03",MTG_QS_SC03_AREA,MTG_QS_SC03_H,0);
		SC MTG_QS_SC04 = new SC("MTG_QS_SC04",MTG_QS_SC04_AREA,MTG_QS_SC04_H,0);
		SC MTG_QS_SC05 = new SC("MTG_QS_SC05",MTG_QS_SC05_AREA,MTG_QS_SC05_H,0);
		/*
		 * ��ʼ��ȡˮ�ܵ�����
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
		 * ��ʼ��ȡˮ���Ŷ���
		 */
		FM MTG_QS_FM01 = new FM("MTG_QS_FM01",MTG_QS_GD04,1);
		FM MTG_QS_FM02 = new FM("MTG_QS_FM02",MTG_QS_GD05,1);
		FM MTG_QS_FM03 = new FM("MTG_QS_FM03",MTG_QS_GD06,1);
		FM MTG_QS_FM04 = new FM("MTG_QS_FM04",MTG_QS_GD09,1);
		/*
		 * ��ʼ����ϳ�ˮ�ض���
		 */
		SC MTG_HH_SC01 = new SC("MTG_HH_SC01",MTG_HH_SC01_AREA,MTG_HH_SC01_H,0);
		SC MTG_HH_SC02 = new SC("MTG_HH_SC02",MTG_HH_SC02_AREA,MTG_HH_SC02_H,0);
		SC MTG_HH_SC03 = new SC("MTG_HH_SC03",MTG_HH_SC03_AREA,MTG_HH_SC03_H,0);
		SC MTG_HH_SC04 = new SC("MTG_HH_SC04",MTG_HH_SC04_AREA,MTG_HH_SC04_H,0);
		/*
		 * ��ʼ����ϳعܵ�����
		 */
		GD MTG_HH_GD01 = new GD("MTG_HH_GD01", MTG_HH_GD01_DIAM, 0);
		GD MTG_HH_GD02 = new GD("MTG_HH_GD02", MTG_HH_GD02_DIAM, 0);
		GD MTG_HH_GD01a = new GD("MTG_HH_GD01a", MTG_HH_GD01a_DIAM, 0);
		GD MTG_HH_GD02a = new GD("MTG_HH_GD02a", MTG_HH_GD02a_DIAM, 0);
		GD MTG_HH_GD03 = new GD("MTG_HH_GD03", MTG_HH_GD03_DIAM, 0);
		GD MTG_HH_GD04 = new GD("MTG_HH_GD04", MTG_HH_GD04_DIAM, 0);
		/*
		 * ��ʼ����ϳط��Ŷ���
		 */
		FM MTG_HH_FM01 = new FM("MTG_HH_FM01",MTG_HH_GD01,1);
		FM MTG_HH_FM02 = new FM("MTG_HH_FM02",MTG_HH_GD02,1);
		/**
		 * ��ʼ����
		 */
		try{
			for(n=0;n<=1000;n++){
				GDout.println("ʱ�䣺"+n*dt+"s;	"+"dt="+dt+"s;");
				SCout.println("ʱ�䣺"+n*dt+"s;	"+"dt="+dt+"s;");
				/**
				 * �ܵ�03
				 */
				MTG_QS_GD03.setFlow(MTG_QS_GD01.getFlow()+MTG_QS_GD02.getFlow());//���� 
				/**
				 * �ܵ�04
				 */
				MTG_QS_GD04.setFlow(MTG_QS_GD03.getFlow()*0.5*MTG_QS_FM01.getOnoff());//����
				/**
				 * �ܵ�05
				 */
				MTG_QS_GD05.setFlow(MTG_QS_GD03.getFlow()*0.5*MTG_QS_FM02.getOnoff());//����
				/**
				 * ˮ��01
				 */
				MTG_QS_SC01.setIn(MTG_QS_GD04.getFlow()*dt);//dtʱ���ڽ�ˮ��
				MTG_QS_SC01.setOut(Math.sqrt(2*g*MTG_QS_SC01.getH()
						)*MTG_QS_GD04a.getS()*dt);//dtʱ���ڳ�ˮ��
				MTG_QS_SC01.computeVnow();//����ˮ��ʵʱˮ��
				/**
				 * ˮ��02
				 */
				MTG_QS_SC02.setIn(MTG_QS_GD05.getFlow()*dt);//dtʱ���ڽ�ˮ��
				MTG_QS_SC02.setOut(Math.sqrt(2*g*MTG_QS_SC02.getH()
						)*MTG_QS_GD05a.getS()*dt);//dtʱ���ڳ�ˮ��
				MTG_QS_SC02.computeVnow();//����ˮ��ʵʱˮ��
				//n=1
				/**
				 * �ܵ�04a
				 */
				MTG_QS_GD04a.setFlow(MTG_QS_SC01.getOut());//����
				/**
				 * �ܵ�05a
				 */
				MTG_QS_GD05a.setFlow(MTG_QS_SC02.getOut());//����
				//n=2
				/**
				 * �ܵ�07
				 */
				MTG_QS_GD07.setSpeed(Math.sqrt(2*g*MTG_QS_SC03.getH()));//����
				/**
				 * �ܵ�08
				 */
				MTG_QS_GD08.setSpeed(MTG_QS_GD07.getSpeed());//����
				/**
				 * �ܵ�06
				 */
				MTG_QS_GD06.setSpeed(MTG_QS_GD07.getSpeed()*MTG_QS_FM03.getOnoff());//����
				/**
				 * �ܵ�09
				 */
				MTG_QS_GD09.setSpeed(MTG_QS_GD07.getSpeed()*MTG_QS_FM04.getOnoff());//����
				//n=1
				/**
				 * ˮ��03
				 */
				MTG_QS_SC03.setIn(MTG_QS_GD04a.getFlow()*dt+MTG_QS_GD05a.getFlow()*dt);//dtʱ���ڽ�ˮ��
				MTG_QS_SC03.setOut((MTG_QS_GD06.getFlow()+MTG_QS_GD07.getFlow()+MTG_QS_GD08.getFlow()+MTG_QS_GD09.getFlow())*dt);//dtʱ���ڳ�ˮ��    //n=2
				MTG_QS_SC03.computeVnow();//����ˮ��ʵʱˮ��
				//n=2
				/**
				 * ȡˮ�ܵ�10
				 */
				MTG_QS_GD10.setFlow(MTG_QS_GD10.getSpeed()*MTG_QS_GD10.getS());//����
				MTG_QS_GD10.setSpeed(Math.sqrt(2*g*MTG_QS_SC04.getH()));//����
				/**
				 * ȡˮ�ܵ�11
				 */
				MTG_QS_GD11.setFlow(MTG_QS_GD11.getSpeed()*MTG_QS_GD11.getS());//����
				MTG_QS_GD11.setSpeed(Math.sqrt(2*g*MTG_QS_SC05.getH()));//����
				//n=2
				/**
				 * ȡˮ�ܵ�13
				 */
				MTG_QS_GD13.setFlow(MTG_QS_GD10.getFlow());//����
				/**
				 * ȡˮ�ܵ�14
				 */
				MTG_QS_GD14.setFlow(MTG_QS_GD11.getFlow());//����
				//n=2
				/**
				 * ˮ��04
				 */
				MTG_QS_SC04.setIn(MTG_QS_GD06.getFlow()*dt+MTG_QS_GD07.getFlow()*dt);//dtʱ���ڽ�ˮ��
				MTG_QS_SC04.setOut(MTG_QS_GD10.getFlow()*dt);//dtʱ���ڳ�ˮ��  //n=3
				MTG_QS_SC04.computeVnow();//����ˮ��ʵʱˮ��
				//n=2
				/**
				 * ˮ��05
				 */
				MTG_QS_SC05.setIn(MTG_QS_GD08.getFlow()*dt+MTG_QS_GD09.getFlow()*dt);//dtʱ���ڽ�ˮ��
				MTG_QS_SC05.setOut(MTG_QS_GD11.getFlow()*dt);//dtʱ���ڳ�ˮ��  //n=3
				MTG_QS_SC05.computeVnow();//����ˮ��ʵʱˮ��
				/**
				 * ȡˮ�ܵ�13������Ϊ��ϳعܵ�01������
				 * ȡˮ�ܵ�14������Ϊ��ϳعܵ�02������
				 */
				MTG_HH_GD01.setFlow(MTG_QS_GD13.getFlow());
				MTG_HH_GD02.setFlow(MTG_QS_GD14.getFlow());
				/**
				 * ��ϳ�ˮ��01
				 */
				MTG_HH_SC01.setIn(MTG_HH_GD01.getFlow()*dt*MTG_HH_FM01.getOnoff());//dtʱ���ڽ�ˮ��
				MTG_HH_SC01.setOut(Math.sqrt(2*g*MTG_HH_SC01.getH()
						)*MTG_HH_GD01a.getS()*dt);//dtʱ���ڳ�ˮ��
				MTG_HH_SC01.computeVnow();//����ˮ��ʵʱˮ��
				/**
				 * ��ϳ�ˮ��02
				 */
				MTG_HH_SC02.setIn(MTG_HH_GD02.getFlow()*dt*MTG_HH_FM02.getOnoff());//dtʱ���ڽ�ˮ��
				MTG_HH_SC02.setOut(Math.sqrt(2*g*MTG_HH_SC02.getH()
						)*MTG_HH_GD02a.getS()*dt);//dtʱ���ڳ�ˮ��
				MTG_HH_SC02.computeVnow();//����ˮ��ʵʱˮ��
				//n=1
				/**
				 * ��ϳعܵ�01a
				 */
				MTG_HH_GD01a.setFlow(MTG_HH_SC01.getOut());//����
				/**
				 * ��ϳعܵ�02a
				 */
				MTG_HH_GD02a.setFlow(MTG_HH_SC02.getOut());//����
				//n=2
				/**
				 * ��ϳعܵ�3
				 */
				MTG_HH_GD03.setFlow(0);//����
				/**
				 * ��ϳعܵ�4
				 */
				MTG_HH_GD04.setFlow(0);//����
				//n=2
				/**
				 * ��ϳ�ˮ��03
				 */
				MTG_HH_SC03.setIn(MTG_HH_GD01a.getFlow()*dt);//dtʱ���ڽ�ˮ��
				MTG_HH_SC03.setOut(MTG_HH_GD03.getFlow()*dt);
				MTG_HH_SC03.computeVnow();//����ˮ��ʵʱˮ��
				/**
				 * ��ϳ�ˮ��04
				 */
				MTG_HH_SC04.setIn(MTG_HH_GD02a.getFlow()*dt);//dtʱ���ڽ�ˮ��
				MTG_HH_SC04.setOut(MTG_HH_GD04.getFlow()*dt);
				MTG_HH_SC04.computeVnow();//����ˮ��ʵʱˮ��
				/**
				 * ��t=n��ʱ�ܵ����ݵ�����д��gd_data.dat�ļ�
				 */
				MTG_QS_GD01.writeData(GDout);//д������
				MTG_QS_GD02.writeData(GDout);//д������
				MTG_QS_GD03.writeData(GDout);//д������
				MTG_QS_GD04.writeData(GDout);//д������
				MTG_QS_GD05.writeData(GDout);//д������
				MTG_QS_GD04a.writeData(GDout);//д������
				MTG_QS_GD05a.writeData(GDout);//д������
				MTG_QS_GD06.writeData(GDout);//д������
				MTG_QS_GD07.writeData(GDout);//д������
				MTG_QS_GD08.writeData(GDout);//д������
				MTG_QS_GD09.writeData(GDout);//д������
				MTG_QS_GD10.writeData(GDout);//д������
				MTG_QS_GD11.writeData(GDout);//д������
				/**
				 * ��t=n��ʱˮ�����ݵ�����д��sc_data.dat�ļ�
				 */
				MTG_QS_SC01.writeData(SCout);//д������
				MTG_QS_SC02.writeData(SCout);//д������
				MTG_QS_SC03.writeData(SCout);//д������
				MTG_QS_SC04.writeData(SCout);//д������
				MTG_QS_SC05.writeData(SCout);//д������
				/**
				 * ��t=n��ʱ��ϳعܵ����ݵ�����д��gdhh_data.dat�ļ�
				 */
				MTG_HH_GD01.writeData(GDout);//д������
				MTG_HH_GD02.writeData(GDout);//д������
				MTG_HH_GD01a.writeData(GDout);//д������
				MTG_HH_GD02a.writeData(GDout);//д������
				MTG_HH_GD03.writeData(GDout);//д������
				MTG_HH_GD04.writeData(GDout);//д������
				
				/**
				 * ��t=n��ʱ��ϳ�ˮ�����ݵ�����д��schh_data.dat�ļ�
				 */
				MTG_HH_SC01.writeData(SCout);//д������
				MTG_HH_SC02.writeData(SCout);//д������
				MTG_HH_SC03.writeData(SCout);//д������
				MTG_HH_SC04.writeData(SCout);//д������
			}
			}
		catch(Exception e){
			SCout.println(e.getMessage());
		}
		
	}
}
