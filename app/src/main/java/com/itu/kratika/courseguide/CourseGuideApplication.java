package com.itu.kratika.courseguide;

import android.app.Application;

/**
 * Created by Megha on 5/18/2016.
 */
public class CourseGuideApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CourseGuide.appInit(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}


