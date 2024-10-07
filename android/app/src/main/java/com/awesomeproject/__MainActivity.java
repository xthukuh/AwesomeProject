package com.awesomeproject;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;

public class MainActivity extends ReactActivity {

	/**
	 * Returns the name of the main component registered from JavaScript. This is
	 * used to schedule
	 * rendering of the component.
	 */
	@Override
	protected String getMainComponentName() {
		return "AwesomeProject";
	}

	/**
	 * Returns the instance of the [ReactActivityDelegate]. We use
	 * [DefaultReactActivityDelegate]
	 * which allows you to enable New Architecture with a single boolean flags
	 * [fabricEnabled]
	 */
	@Override
	protected ReactActivityDelegate createReactActivityDelegate() {
		return new DefaultReactActivityDelegate(this, getMainComponentName(),
				DefaultNewArchitectureEntryPoint.fabricEnabled());
	}
}
