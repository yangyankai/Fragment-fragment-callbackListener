/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/11/17 6:13:37
 * Project: T_Fragment_activity
 * File: RightFragment.java
 * Class: RightFragment
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

package com.shootbox.t_fragment_activity;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yangyankai on 2015/11/17.
 */
public class RightFragment extends Fragment
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
//		System.out.println("RightFragment--->onCreate");
		Log.e("aaa","RightFragment-->onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
//		System.out.println("RightFragment--->onCreateView");
		Log.e("aaa","RightFragment--->onCreateView");
		return inflater.inflate(R.layout.rightfragment, container, false);
	}
}