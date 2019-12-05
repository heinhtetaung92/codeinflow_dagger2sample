package algo.com.dagger2sample.car;

import android.util.Log;

import javax.inject.Inject;

import algo.com.dagger2sample.dagger.ActivityScope;

@ActivityScope
public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
    
    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drives " + this);
        Log.d(TAG, "driving...");
    }
    
}
