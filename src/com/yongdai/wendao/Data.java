package com.yongdai.wendao;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Data extends Activity{
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.data);
		Button bn=(Button)findViewById(R.id.bn11);//获取UI界面中id为R。id。bn8的按钮
		bn.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				//Intent b=new Intent(Data.this, MainActivity.class);
				//startActivity(b);
				finish();
				
			}
		});
	}

}