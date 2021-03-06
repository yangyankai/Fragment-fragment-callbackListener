/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/11/17 6:12:32
 * Project: T_Fragment_activity
 * File: LeftFragment.java
 * Class: LeftFragment
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

package com.shootbox.t_fragment_activity;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by yangyankai on 2015/11/17.
 */

public class LeftFragment extends Fragment
{
	/** Acitivity要实现这个接口，这样Fragment和Activity就可以共享事件触发的资源了 */
	public interface MyListener
	{
		public void showMessage(int index);
	}

	private MyListener myListener;
	private Button firstButton;
	private Button secondButton;
	private Button thirdButton;

	/** Fragment第一次附属于Activity时调用,在onCreate之前调用 */
	@Override
	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
		System.out.println("LeftFragment--->onAttach");

		myListener = (MyListener) activity;
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		System.out.println("LeftFragment--->onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		System.out.println("LeftFragment--->onCreateView");
		return inflater.inflate(R.layout.leftfragment, container, false);
	}

	@Override
	public void onResume()
	{
		super.onResume();
		System.out.println("LeftFragment--->onResume");

		firstButton = (Button) getActivity().findViewById(R.id.first_button);
		secondButton = (Button) getActivity().findViewById(R.id.second_button);
		thirdButton = (Button) getActivity().findViewById(R.id.third_button);

		MyButtonClickListener clickListener = new MyButtonClickListener();
		firstButton.setOnClickListener(clickListener);
		secondButton.setOnClickListener(clickListener);
		thirdButton.setOnClickListener(clickListener);
	}

	/** 按钮的监听器 */
	class MyButtonClickListener implements View.OnClickListener
	{
		public void onClick(View v)
		{
			Button button = (Button) v;
			if (button == firstButton)
				myListener.showMessage(1);
			if (button == secondButton)
				myListener.showMessage(2);
			if (button == thirdButton)
				myListener.showMessage(3);
		}
	}
}