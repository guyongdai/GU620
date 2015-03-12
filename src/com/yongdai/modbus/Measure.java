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
	
/*创建对话框选择需要测量的项目进行查询         */
    final int SINGLE_DIALOG=0x113;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);//设置使用main。xMl文件定义的界面布局
		setContentView(R.layout.measure);
		Button bn=(Button)findViewById(R.id.bn19);//获取UI界面中id为R。id。OK的按钮
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
			b.setTitle("项目列表");
			b.setSingleChoiceItems(new String []
					{"发电相电压","发电线电压","发电负载电流","发电频率","发电功率因数","发电视在功率","发电有功功率","发电无功功率","转速油压水温等"}
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
								show1.setText("发电相电压");
								Setupgu(which);
								break;
							case 1:
								show1.setText("发电线电压");
								Setupgu(which);
								break;
								
							case 2:
								show1.setText("发电负载电流");
								Setupgu(which);
								break;
								
							case 3:
								show1.setText("发电频率");
								Setupgu(which);
								break;
								
							case 4:
								show1.setText("发电功率因数");
								Setupgu(which);
								break;
							case 5:
								show1.setText("发电视在功率");
								Setupgu(which);
								break;
							case 6:
								show1.setText("发电有功功率");
								Setupgu(which);
								break;
							case 7:
								show1.setText("发电无功功率");
								Setupgu(which);
								break;
							case 8:
								show1.setText("转速油压水温等");
								Setupgu(which);
								break;
												
							}
						}

					});
			
		b.setPositiveButton("确定",null);
		return b.create();
		}
	  return null;
	}
	
	
	
	

/********表格基本数据填写子程序*********/
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
	/*********子数据gu4子程序
	 * @return ***********/
	public void Setgu4(int num)
	{
		TextView show4 =(TextView)findViewById(R.id.gu4);
		switch (num)
		{
		case 0:
			show4.setText("A相电压");
			break;
		case 1:
			show4.setText("AB线电压");
			break;
		case 2:
			show4.setText("A相电流");
			break;
		case 3:
			show4.setText("发电频率");
			break;
		case 4:
			show4.setText("A相功率因数");
			break;
		case 5:
			show4.setText("A相视在功率");
			break;
		case 6:
			show4.setText("A相有功功率");
			break;
		case 7:
			show4.setText("A相无功功率");
			break;
		case 8:
			show4.setText("转速");
			break;
		}
		
	}
	/*********shujugu7子程序***********/
	public void Setgu7(int num)
	{
		TextView show7 =(TextView)findViewById(R.id.gu7);
		switch (num)
		{
		case 0:
			show7.setText("B相电压");
			break;
		case 1:
			show7.setText("BC线电压");
			break;
		case 2:
			show7.setText("B相电流");
			break;
		case 3:
			show7.setText("发电有功电度");
			break;
		case 4:
			show7.setText("B相功率因数");
			break;
		case 5:
			show7.setText("B相视在功率");
			break;
		case 6:
			show7.setText("B相有功功率");
			break;
		case 7:
			show7.setText("B相无功功率");
			break;
		case 8:
			show7.setText("油压");
			break;
		}
		
	}
	/*********gu10子程序***********/
	public void Setgu10(int num)
	{
		TextView show10 =(TextView)findViewById(R.id.gu10);
		switch (num)
		{
		case 0:
			show10.setText("C相电压");
			break;
		case 1:
			show10.setText("AC线电压");
			break;
		case 2:
			show10.setText("C相电流");
			break;
		case 3:
			show10.setText("发电无功电度");
			break;
		case 4:
			show10.setText("C相功率因数");
			break;
		case 5:
			show10.setText("C相视在功率");
			break;
		case 6:
			show10.setText("C相有功功率");
			break;
		case 7:
			show10.setText("C相无功功率");
			break;
		case 8:
			show10.setText("水温");
			break;
		}
		
	}
	/*********gu5子程序***********/
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
	/*********查询发电功率因数子程序***********/
	/*********gu9子程序***********/
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
	/*********查询发电视在功率子程序***********/
	/*********gu12子程序***********/
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
			show12.setText("0~120℃");
			break;
		}
		
	}
	
	/*********gu13子程序***********/
	public void Setgu13(int num)
	{
		TextView show13 =(TextView)findViewById(R.id.gu13);
		switch (num)
		{
		case 0:
			show13.setText("高电压故障值：");
			break;
		case 1:
			show13.setText("");
			break;
		case 2:
			show13.setText("过流值：");
			break;
		case 3:
			show13.setText("传感器2高水平值：");
			break;
		case 4:
			show13.setText("");
			break;
		case 5:
			show13.setText("");
			break;
		case 6:
			show13.setText("超负载故障值：");
			break;
		case 7:
			show13.setText("");
			break;
		case 8:
			show13.setText("");
			break;
		
		}
		
	}
	/*********查询gu15子程序***********/
	public void Setgu15(int num)
	{
		TextView show15 =(TextView)findViewById(R.id.gu15);
		switch (num)
		{
		case 0:
			show15.setText("高电压警告值：");
			break;
		case 1:
			show15.setText("");
			break;
		case 2:
			show15.setText("");
			break;
		case 3:
			show15.setText("低频率故障值：");
			break;
		case 4:
			show15.setText("");
			break;
		case 5:
			show15.setText("");
			break;
		case 6:
			show15.setText("超负载警告值：");
			break;
		case 7:
			show15.setText("");
			break;
		case 8:
			show15.setText("");
			break;
		
		
		
		}
		
	}
	/*********查询gu17子程序***********/
	public void Setgu17(int num)
	{
		TextView show17 =(TextView)findViewById(R.id.gu17);
		switch (num)
		{
		case 0:
			show17.setText("低电压故障值：");
			break;
		case 1:
			show17.setText("：");
			break;
		case 2:
			show17.setText("：");
			break;
		case 3:
			show17.setText("传感器2高水平值：");
			break;
		case 4:
			show17.setText("：");
			break;
		case 5:
			show17.setText("：");
			break;
		case 6:
			show17.setText("：");
			break;
		case 7:
			show17.setText("：");
			break;
		case 8:
			show17.setText("：");
			break;
		
		}
		
	}
	
	/*********查询gu19子程序***********/
	public void Setgu19(int num)
	{
		TextView show19 =(TextView)findViewById(R.id.gu19);
		switch (num)
		{
		case 0:
			show19.setText("低电压警告值：");
			break;
		case 1:
			show19.setText("");
			break;
		case 2:
			show19.setText("");
			break;
		case 3:
			show19.setText("低频率警告值：");
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
	
	/*********查询gu14子程序***********/
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
	/*********查询gu16子程序***********/
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
	
/*********查询gu18子程序***********/
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
	/*********查询gu20子程序***********/
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
/*********查询转速油压水温等子程序***********/	
}