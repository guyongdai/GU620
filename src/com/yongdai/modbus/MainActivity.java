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
		super.onCreate(savedInstanceState);//设置使用main。xMl文件定义的界面布局
		setContentView(R.layout.activity_main);
		Button bn=(Button)findViewById(R.id.bn18);//获取UI界面中id为R。id。OK的按钮
		bn.setOnClickListener(new OnClickListener()
		{
			
			
			public void onClick(View v)
			{
				final TextView show =(TextView)findViewById(R.id.show);
				show.setText("与服务器通信状态：\n"+"成功不必在我，而功力必不唐娟\n"+new java.util.Date());
				
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
