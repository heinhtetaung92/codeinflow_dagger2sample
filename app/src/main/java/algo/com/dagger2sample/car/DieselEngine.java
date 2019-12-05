package algo.com.dagger2sample.car;

import android.util.Log;

import javax.inject.Inject;


public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int hoursePower;

    @Inject
    public DieselEngine(int hoursePower) {
        this.hoursePower = hoursePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horse power : " + hoursePower);
    }

}
