package com.yongdai.modbus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);//����ʹ��main��xMl�ļ�����Ľ��沼��
		setContentView(R.layout.activity_main);
		Button bn=(Button)findViewById(R.id.bn18);//��ȡUI������idΪR��id��OK�İ�ť
		bn.setOnClickListener(new OnClickListener()
		{
			
			
			public void onClick(View v)
			{
				final TextView show =(TextView)findViewById(R.id.show);
				show.setText("�������ͨ��״̬��\n"+"�ɹ��������ң��������ز��ƾ�\n"+new java.util.Date());
				
			}
		});
		
		
		Button bt=(Button)findViewById(R.id.bn9);
		bt.setOnClickListener(new OnClickListener()
		{
			
			
			public void onClick(View v)
			{
				Intent i=new Intent(MainActivity.this, Measure.class);
				startActivity(i);
				
			}
		});
	}

	
	
}
