package com.yongdai.modbus;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Measure extends Activity
{   
	
/*�����Ի���ѡ����Ҫ��������Ŀ���в�ѯ         */
    final int SINGLE_DIALOG=0x113;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);//����ʹ��main��xMl�ļ�����Ľ��沼��
		setContentView(R.layout.measure);
		Button bn=(Button)findViewById(R.id.bn19);//��ȡUI������idΪR��id��OK�İ�ť
		bn.setOnClickListener(new OnClickListener()
		{
			
			
			@SuppressWarnings("deprecation")
			public void onClick(View source)
			{
				showDialog(SINGLE_DIALOG);
				
				
			}
		});
	}
	@Override
	public Dialog onCreateDialog(int id,Bundle state)
	{
		switch (id)
		{
		case SINGLE_DIALOG:
			 
			Builder b =new AlertDialog.Builder(this);
			b.setIcon(R.drawable.abc_ab_share_pack_holo_dark);
			b.setTitle("��Ŀ�б�");
			b.setSingleChoiceItems(new String []
					{"�������ѹ","�����ߵ�ѹ","���縺�ص���","����Ƶ��","���繦������","�������ڹ���","�����й�����","�����޹�����","ת����ѹˮ�µ�"}
			        ,0
			        ,new DialogInterface.OnClickListener()
					{
						
						public void onClick(DialogInterface dialog,int which)
						{
							// TODO Auto-generated method stub
							TextView show1 =(TextView)findViewById(R.id.View6);
							switch (which)
							{
							case 0:
								show1.setText("�������ѹ");
								Setupgu(which);
								break;
							case 1:
								show1.setText("�����ߵ�ѹ");
								Setupgu(which);
								break;
								
							case 2:
								show1.setText("���縺�ص���");
								Setupgu(which);
								break;
								
							case 3:
								show1.setText("����Ƶ��");
								Setupgu(which);
								break;
								
							case 4:
								show1.setText("���繦������");
								Setupgu(which);
								break;
							case 5:
								show1.setText("�������ڹ���");
								Setupgu(which);
								break;
							case 6:
								show1.setText("�����й�����");
								Setupgu(which);
								break;
							case 7:
								show1.setText("�����޹�����");
								Setupgu(which);
								break;
							case 8:
								show1.setText("ת����ѹˮ�µ�");
								Setupgu(which);
								break;
												
							}
						}

					});
			
		b.setPositiveButton("ȷ��",null);
		return b.create();
		}
	  return null;
	}
	
	
	
	

/********������������д�ӳ���*********/
	public void Setupgu(int which)
	{
		Setgu4(which);
		Setgu6(which);
		Setgu7(which);
		Setgu9(which);
		Setgu10(which);
		Setgu12(which);
		Setgu13(which);
		Setgu15(which);
		Setgu17(which);
		Setgu19(which);
		Setgu14(which);
		Setgu16(which);
		Setgu18(which);
		Setgu20(which);
	}
	/*********������gu4�ӳ���
	 * @return ***********/
	public void Setgu4(int num)
	{
		TextView show4 =(TextView)findViewById(R.id.gu4);
		switch (num)
		{
		case 0:
			show4.setText("A���ѹ");
			break;
		case 1:
			show4.setText("AB�ߵ�ѹ");
			break;
		case 2:
			show4.setText("A�����");
			break;
		case 3:
			show4.setText("����Ƶ��");
			break;
		case 4:
			show4.setText("A�๦������");
			break;
		case 5:
			show4.setText("A�����ڹ���");
			break;
		case 6:
			show4.setText("A���й�����");
			break;
		case 7:
			show4.setText("A���޹�����");
			break;
		case 8:
			show4.setText("ת��");
			break;
		}
		
	}
	/*********shujugu7�ӳ���***********/
	public void Setgu7(int num)
	{
		TextView show7 =(TextView)findViewById(R.id.gu7);
		switch (num)
		{
		case 0:
			show7.setText("B���ѹ");
			break;
		case 1:
			show7.setText("BC�ߵ�ѹ");
			break;
		case 2:
			show7.setText("B�����");
			break;
		case 3:
			show7.setText("�����й����");
			break;
		case 4:
			show7.setText("B�๦������");
			break;
		case 5:
			show7.setText("B�����ڹ���");
			break;
		case 6:
			show7.setText("B���й�����");
			break;
		case 7:
			show7.setText("B���޹�����");
			break;
		case 8:
			show7.setText("��ѹ");
			break;
		}
		
	}
	/*********gu10�ӳ���***********/
	public void Setgu10(int num)
	{
		TextView show10 =(TextView)findViewById(R.id.gu10);
		switch (num)
		{
		case 0:
			show10.setText("C���ѹ");
			break;
		case 1:
			show10.setText("AC�ߵ�ѹ");
			break;
		case 2:
			show10.setText("C�����");
			break;
		case 3:
			show10.setText("�����޹����");
			break;
		case 4:
			show10.setText("C�๦������");
			break;
		case 5:
			show10.setText("C�����ڹ���");
			break;
		case 6:
			show10.setText("C���й�����");
			break;
		case 7:
			show10.setText("C���޹�����");
			break;
		case 8:
			show10.setText("ˮ��");
			break;
		}
		
	}
	/*********gu5�ӳ���***********/
	public void Setgu6(int num)
	{
		TextView show6 =(TextView)findViewById(R.id.gu6);
		switch (num)
		{
		case 0:
			show6.setText("0~300V");
			break;
		case 1:
			show6.setText("0~450V");
			break;
		case 2:
			show6.setText("0~9000A");
			break;
		case 3:
			show6.setText("0~60HZ");
			break;
		case 4:
			show6.setText("-1.0~1.0");
			break;
		case 5:
			show6.setText("0~9000KVA");
			break;
		case 6:
			show6.setText("0~7500KW");
			break;
		case 7:
			show6.setText("0~9000kVAr");
			break;
		case 8:
			show6.setText("0~2000RPM");
			break;
		}
		
	}
	/*********��ѯ���繦�������ӳ���***********/
	/*********gu9�ӳ���***********/
	public void Setgu9(int num)
	{
		TextView show9 =(TextView)findViewById(R.id.gu9);
		switch (num)
		{
		case 0:
			show9.setText("0~300V");
			break;
		case 1:
			show9.setText("0~450V");
			break;
		case 2:
			show9.setText("0~9000A");
			break;
		case 3:
			show9.setText("0~4500kWhr");
			break;
		case 4:
			show9.setText("-1.0~1.0");
			break;
		case 5:
			show9.setText("0~9000KVA");
			break;
		case 6:
			show9.setText("0~9000KW");
			break;
		case 7:
			show9.setText("0~7500KVAr");
			break;
		case 8:
			show9.setText("0~10Bar");
			break;
		}
		
	}
	/*********��ѯ�������ڹ����ӳ���***********/
	/*********gu12�ӳ���***********/
	public void Setgu12(int num)
	{
		TextView show12 =(TextView)findViewById(R.id.gu12);
		switch (num)
		{
		case 0:
			show12.setText("0~300V");
			break;
		case 1:
			show12.setText("0~450V");
			break;
		case 2:
			show12.setText("0~9000A");
			break;
		case 3:
			show12.setText("0~3000kVArhr");
			break;
		case 4:
			show12.setText("-1.0~1.0");
			break;
		case 5:
			show12.setText("0~9000KVA");
			break;
		case 6:
			show12.setText("0~3000KW");
			break;
		case 7:
			show12.setText("0~9000KVAr");
			break;
		case 8:
			show12.setText("0~120��");
			break;
		}
		
	}
	
	/*********gu13�ӳ���***********/
	public void Setgu13(int num)
	{
		TextView show13 =(TextView)findViewById(R.id.gu13);
		switch (num)
		{
		case 0:
			show13.setText("�ߵ�ѹ����ֵ��");
			break;
		case 1:
			show13.setText("");
			break;
		case 2:
			show13.setText("����ֵ��");
			break;
		case 3:
			show13.setText("������2��ˮƽֵ��");
			break;
		case 4:
			show13.setText("");
			break;
		case 5:
			show13.setText("");
			break;
		case 6:
			show13.setText("�����ع���ֵ��");
			break;
		case 7:
			show13.setText("");
			break;
		case 8:
			show13.setText("");
			break;
		
		}
		
	}
	/*********��ѯgu15�ӳ���***********/
	public void Setgu15(int num)
	{
		TextView show15 =(TextView)findViewById(R.id.gu15);
		switch (num)
		{
		case 0:
			show15.setText("�ߵ�ѹ����ֵ��");
			break;
		case 1:
			show15.setText("");
			break;
		case 2:
			show15.setText("");
			break;
		case 3:
			show15.setText("��Ƶ�ʹ���ֵ��");
			break;
		case 4:
			show15.setText("");
			break;
		case 5:
			show15.setText("");
			break;
		case 6:
			show15.setText("�����ؾ���ֵ��");
			break;
		case 7:
			show15.setText("");
			break;
		case 8:
			show15.setText("");
			break;
		
		
		
		}
		
	}
	/*********��ѯgu17�ӳ���***********/
	public void Setgu17(int num)
	{
		TextView show17 =(TextView)findViewById(R.id.gu17);
		switch (num)
		{
		case 0:
			show17.setText("�͵�ѹ����ֵ��");
			break;
		case 1:
			show17.setText("��");
			break;
		case 2:
			show17.setText("��");
			break;
		case 3:
			show17.setText("������2��ˮƽֵ��");
			break;
		case 4:
			show17.setText("��");
			break;
		case 5:
			show17.setText("��");
			break;
		case 6:
			show17.setText("��");
			break;
		case 7:
			show17.setText("��");
			break;
		case 8:
			show17.setText("��");
			break;
		
		}
		
	}
	
	/*********��ѯgu19�ӳ���***********/
	public void Setgu19(int num)
	{
		TextView show19 =(TextView)findViewById(R.id.gu19);
		switch (num)
		{
		case 0:
			show19.setText("�͵�ѹ����ֵ��");
			break;
		case 1:
			show19.setText("");
			break;
		case 2:
			show19.setText("");
			break;
		case 3:
			show19.setText("��Ƶ�ʾ���ֵ��");
			break;
		case 4:
			show19.setText("");
			break;
		case 5:
			show19.setText("");
			break;
		case 6:
			show19.setText("");
			break;
		case 7:
			show19.setText("");
			break;
		case 8:
			show19.setText("");
			break;
		
		}
		
	}
	
	/*********��ѯgu14�ӳ���***********/
	public void Setgu14(int num)
	{
		TextView show14 =(TextView)findViewById(R.id.gu14);
		switch (num)
		{
		case 0:
			show14.setText("2197.8");
			break;
		case 1:
			show14.setText("");
			break;
		case 2:
			show14.setText("1000");
			break;
		case 3:
			show14.setText("9999");
			break;
		case 4:
			show14.setText("");
			break;
		case 5:
			show14.setText("");
			break;
		case 6:
			show14.setText("500");
			break;
		case 7:
			show14.setText("");
			break;
		case 8:
			show14.setText("");
			break;
		
		}
		
	}
	/*********��ѯgu16�ӳ���***********/
	public void Setgu16(int num)
	{
		TextView show16 =(TextView)findViewById(R.id.gu16);
		switch (num)
		{
		case 0:
			show16.setText("253");
			break;
		case 1:
			show16.setText("");
			break;
		case 2:
			show16.setText("");
			break;
		case 3:
			show16.setText("0");
			break;
		case 4:
			show16.setText("");
			break;
		case 5:
			show16.setText("");
			break;
		case 6:
			show16.setText("4995");
			break;
		case 7:
			show16.setText("");
			break;
		case 8:
			show16.setText("");
			break;
		
		}
		
	}
	
/*********��ѯgu18�ӳ���***********/
	public void Setgu18(int num)
	{
		TextView show18 =(TextView)findViewById(R.id.gu18);
		switch (num)
		{
		case 0:
			show18.setText("0");
			break;
		case 1:
			show18.setText("");
			break;
		case 2:
			show18.setText("");
			break;
		case 3:
			show18.setText("9999");
			break;
		case 4:
			show18.setText("");
			break;
		case 5:
			show18.setText("");
			break;
		case 6:
			show18.setText("");
			break;
		case 7:
			show18.setText("");
			break;
		case 8:
			show18.setText("");
			break;
		
		}
		
	}	
	/*********��ѯgu20�ӳ���***********/
	public void Setgu20(int num)
	{
		TextView show20 =(TextView)findViewById(R.id.gu20);
		switch (num)
		{
		case 0:
			show20.setText("198");
			break;
		case 1:
			show20.setText("");
			break;
		case 2:
			show20.setText("");
			break;
		case 3:
			show20.setText("48.0");
			break;
		case 4:
			show20.setText("");
			break;
		case 5:
			show20.setText("");
			break;
		case 6:
			show20.setText("");
			break;
		case 7:
			show20.setText("");
			break;
		case 8:
			show20.setText("");
			break;
		
		}
		
	}	
/*********��ѯת����ѹˮ�µ��ӳ���***********/	
}