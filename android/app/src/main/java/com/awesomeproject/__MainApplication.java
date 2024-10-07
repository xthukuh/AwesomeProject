package com.awesomeproject;

import android.app.Application;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactHost;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.facebook.react.flipper.ReactNativeFlipper;
import com.facebook.soloader.SoLoader;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
	private final ReactNativeHost reactNativeHost = new DefaultReactNativeHost(this) {
		@Override
		protected List<ReactPackage> getPackages() {
			return new PackageList(this).getPackages();
			// Packages that cannot be autolinked yet can be added manually here, for
			// example:
			// packages.add(new MyReactNativePackage());
		}

		@Override
		protected String getJSMainModuleName() {
			return "index";
		}

		@Override
		public boolean getUseDeveloperSupport() {
			return BuildConfig.DEBUG;
		}

		@Override
		public boolean isNewArchEnabled() {
			return BuildConfig.IS_NEW_ARCHITECTURE_ENABLED;
		}

		@Override
		public boolean isHermesEnabled() {
			return BuildConfig.IS_HERMES_ENABLED;
		}
	};

	private final ReactHost reactHost = DefaultReactHost.getDefaultReactHost(this.getApplicationContext(),
			reactNativeHost);

	@Override
	public ReactNativeHost getReactNativeHost() {
		return reactNativeHost;
	}

	@Override
	public ReactHost getReactHost() {
		return reactHost;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		SoLoader.init(this, false);
		if (BuildConfig.IS_NEW_ARCHITECTURE_ENABLED) {
			// If you opted-in for the New Architecture, we load the native entry point for
			// this app.
			DefaultNewArchitectureEntryPoint.load();
		}
		ReactNativeFlipper.initializeFlipper(this, reactNativeHost.getReactInstanceManager());
	}
}
