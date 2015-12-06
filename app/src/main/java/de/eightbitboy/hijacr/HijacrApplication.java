package de.eightbitboy.hijacr;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.core.CrashlyticsCore;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.orhanobut.logger.Logger;

import de.eightbitboy.hijacr.data.db.Database;
import io.fabric.sdk.android.Fabric;

public class HijacrApplication extends Application {

	public static final String DEBUG_NO_CL = "debugNoCl";

	@Override
	public void onCreate() {
		super.onCreate();

		if (BuildConfig.BUILD_TYPE.equals(DEBUG_NO_CL)) {
			Logger.w("Running app with build type #debugNoCl#!");
		}

		Crashlytics crashlyticsKit = new Crashlytics.Builder().core(
				new CrashlyticsCore.Builder().disabled(
						BuildConfig.BUILD_TYPE.equals(DEBUG_NO_CL)).build())
				.build();

		Fabric.with(this, crashlyticsKit);

		Database.getInstance(this);

		DisplayImageOptions options = new DisplayImageOptions.Builder()
				.cacheInMemory(true)
				.cacheOnDisk(true)
						//TODO experiment with bitmap config
						//.bitmapConfig(Bitmap.Config.RGB_565)
				.build();

		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
				.memoryCacheExtraOptions(2048, 2048)
						//TODO use getFilesDir?
				.diskCache(new UnlimitedDiskCache(getCacheDir()))
				.diskCacheFileNameGenerator(new HashCodeFileNameGenerator())
				.defaultDisplayImageOptions(options)
				.writeDebugLogs()
				.build();

		ImageLoader.getInstance().init(config);
	}
}
