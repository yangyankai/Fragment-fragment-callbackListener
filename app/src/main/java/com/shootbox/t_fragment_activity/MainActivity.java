/*
 */

package com.shootbox.t_fragment_activity;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity implements LeftFragment.MyListener
{
	/**
	 * ʵ��MyListener,��LeftFragment�е����һҳ��ʱ����RightFragment��ʾ��һҳ��Ϣ,ͬ������ڶ�ҳ��ʱ��RightFragment��ʾ�ڶ�ҳ��Ϣ
	 *
	 * @param index
	 *            ��ʾ��ҳ��
	 */
	public void showMessage(int index)
	{
		if (1 == index)
			textViewOnLeft.setText("first page");
		if (2 == index)
			textViewOnLeft.setText("second page");
		if (3 == index)
			textViewOnLeft.setText("third page");
	}

	/** �õ�RightFragment����ʾ��Ϣ�Ŀؼ� */
	private TextView textViewOnLeft;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("Activity--->onCreate");

		FragmentManager manager     = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		// ��̬����Fragment
		RightFragment rightFragment = new RightFragment();
		LeftFragment  leftFragment  = new LeftFragment();
		transaction.add(R.id.left_layout, leftFragment, "leftfragment");
		transaction.add(R.id.right_layout, rightFragment, "rightfragment");
		transaction.commit();

	}

	@Override
	protected void onResume()
	{
		super.onResume();
//		System.out.println("Activity--->onResume");
		Log.e("aaa", "Activity--->onResume");
		textViewOnLeft = (TextView) findViewById(R.id.right_show_message);
	}
}