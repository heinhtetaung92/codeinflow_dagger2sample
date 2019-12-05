package algo.com.dagger2sample;

import android.app.Application;

import algo.com.dagger2sample.dagger.AppComponent;
import algo.com.dagger2sample.dagger.DaggerAppComponent;

public class App extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }

}
