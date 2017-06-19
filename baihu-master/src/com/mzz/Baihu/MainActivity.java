package com.mzz.Baihu;

import com.lk.BaiHuGame.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private float size1=0;
	
	private int lwj1=0;
	private int lwj2=0;
	private int lwj3=0;
	private int lwj4=0;
	
	private int luo1=0;
	private int luo2=0;
	private int luo3=0;
	private int luo4=0;
	
	private int mccken1=0;
	private int mccken2=0;
	private int mccken3=0;
	private int mccken4=0;
	
	int sluo1=0;
	int sluo2=0;
	int sluo3=0;
	int sluo4=0;
	
	
	float slwj1=0;
	float slwj2=0;
	float slwj3=0;
	float slwj4=0;
	
	float ss1=0;
	float ss2=0;
	float ss3=0;
	float ss4=0;
	
	private TextView rs1,rs2,rs3,rs4;
	
	private EditText 
	size,
	lwjtext1,
	lwjtext2,
	lwjtext3,
	lwjtext4,
	luotext1,
	luotext2,
	luotext3,
	luotext4,
	mcckentext1,
	mcckentext2,
	mcckentext3,
	mcckentext4;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rs1=(TextView)findViewById(R.id.result1);
		rs2=(TextView)findViewById(R.id.result2);
		rs3=(TextView)findViewById(R.id.result3);
		rs4=(TextView)findViewById(R.id.result4);
		size=(EditText)findViewById(R.id.edSize);
	 lwjtext1=(EditText)findViewById(R.id.lwj1);
	 lwjtext2=(EditText)findViewById(R.id.lwj2);
	 lwjtext3=(EditText)findViewById(R.id.lwj55);	
	 lwjtext4=(EditText)findViewById(R.id.lwj4);
	 luotext1=(EditText)findViewById(R.id.luo1);
	 luotext2=(EditText)findViewById(R.id.luo2);
	 luotext3=(EditText)findViewById(R.id.luo3);
	 luotext4=(EditText)findViewById(R.id.luo4);
	 mcckentext1=(EditText)findViewById(R.id.mccken1);
	 mcckentext2=(EditText)findViewById(R.id.mccken2);
	 mcckentext3=(EditText)findViewById(R.id.mccken3);
	 mcckentext4=(EditText)findViewById(R.id.mccken4);
	}
	
	
	public void getResult(View view){
	
	size1= Float.parseFloat(size.getText().toString());
	

	lwj1=Integer.parseInt(lwjtext1.getText().toString());	
	lwj2=Integer.parseInt(lwjtext2.getText().toString());
	lwj3=Integer.parseInt(lwjtext3.getText().toString());
	lwj4=Integer.parseInt(lwjtext4.getText().toString());
	

	luo1=Integer.parseInt(luotext1.getText().toString());
	luo2=Integer.parseInt(luotext2.getText().toString());
	luo3=Integer.parseInt(luotext3.getText().toString());
	luo4=Integer.parseInt(luotext4.getText().toString());

	mccken1=Integer.parseInt(mcckentext1.getText().toString());
	mccken2=Integer.parseInt(mcckentext2.getText().toString());
	mccken3=Integer.parseInt(mcckentext3.getText().toString());
	mccken4=Integer.parseInt(mcckentext4.getText().toString());
	
	
	int []lwj={lwj1,lwj2,lwj3,lwj4};
	
	int []luo= {luo1,luo2,luo3,luo4};
	
	int []mccken={mccken1,mccken2,mccken3,mccken4};
	
	int []sluo={sluo1,sluo2,sluo3,sluo4};
	
	float []slwj={slwj1,slwj2,slwj3,slwj4};
			
			
	
	for(int i=0;i<4;i++){
		if(mccken[i]%10<5){
			mccken[i]=mccken[i]/10*10;
		}
		else {if(mccken[i]<0){
			mccken[i]=(mccken[i]/10-1)*10;
		}else{
			mccken[i]=(mccken[i]/10+1)*10;
			}
		}
	}
	
	
	for(int j=0;j<4;j++){
		for(int i=0;i<4;i++){
			slwj[j]+=(mccken[j]-mccken[i])*size1*(lwj[j]+1)*(lwj[i]+1);
		}
	}

	for(int j=0;j<4;j++){
		for(int i=0;i<4;i++){
			if(luo[j]-luo[i]<0){
				sluo[j]+=-luo[j]-luo[i];
			}else if(luo[j]-luo[i]>0){
				sluo[j]+=luo[j]+luo[i];
			}else continue;
			}
		}
	
	
	ss1=slwj[0]+sluo[0];
	
		ss2=slwj[1]+sluo[1];
		
		ss3=slwj[2]+sluo[2];
		
		ss4=slwj[3]+sluo[3];
	/*	System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		System.out.println(ss4);*/
		rs1.setText(ss1+"");
		rs2.setText(ss2+"");
		rs3.setText(ss3+"");
		rs4.setText(ss4+"");
	}
	

	public void clean(View view){
		size.setText("0");
		lwjtext1.setText("0");
		lwjtext2.setText("0");
		lwjtext3.setText("0");
		lwjtext4.setText("0");
		luotext1.setText("0");
		luotext2.setText("0");
		luotext3.setText("0");
		luotext4.setText("0");
		mcckentext1.setText("0");
		mcckentext2.setText("0");
		mcckentext3.setText("0");
		mcckentext4.setText("0");
		rs1.setText("0");
		rs2.setText("0");
		rs3.setText("0");
		rs4.setText("0");
	}
	
	public void exit(View view){
		finish();
	}

}
