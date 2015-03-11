package com.yongdai.modbus;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);//设置使用main。xMl文件定义的界面布局
		setContentView(R.layout.activity_main);
		Button bn=(Button)findViewById(R.id.bn18);//获取UI界面中id为R。id。OK的按钮
		bn.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				final TextView show =(TextView)findViewById(R.id.show);
				show.setText("与服务器通信状态：\n"+"成功不必在我，而功力必不唐娟\n"+new java.util.Date());
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings)
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
