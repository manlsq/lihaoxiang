package com.ecmp.annh;

import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.ieds.gis.base.BaseActivity;
import com.ieds.gis.base.util.GisHttpUtils;
import com.ieds.gis.base.util.ProgressTask;

public class MainActivity extends BaseActivity {
	TextView t1;
	TextView t2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t1 = (TextView) this.findViewById(R.id.etUserName);
		t2 = (TextView) this.findViewById(R.id.pwd_view);
		this.findViewById(R.id.login).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				new ProgressTask(MainActivity.this, true, true, true,
						"是否上传已经采集的交跨数据？\n注意：数据上传后只能在CS系统删除！") {

					@Override
					public boolean onRunning() throws Exception {
						Map<String, Object> params = new HashMap<String, Object>();
						params.put("loginName", t1.getText().toString());
						params.put("password", t2.getText().toString());
						String s = GisHttpUtils.getHttpData(
								"http://192.168.1.102:8080/nssh/user/login_android",
								params);
						System.out.println(s);
						return true;
					}

					@Override
					public void onSucceed() {
						// TODO Auto-generated method stub

					}

					@Override
					public void onFail(String fail) {
						// TODO Auto-generated method stub

					}

				};

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
