package com.itheima.gooviewtest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		List<Msg> msgList=new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			msgList.add(new Msg("标题"+i,i));
		}
		RecyclerView rlv= (RecyclerView) findViewById(R.id.rlv);
		rlv.setLayoutManager(new LinearLayoutManager(this));
		rlv.setAdapter(new MsgAdapter(msgList,this));
//		GooView gooView= (GooView) findViewById(R.id.goo_view);
//		gooView.setText("6");
//		gooView.initGooViewPosition(300,700);
	}
}
