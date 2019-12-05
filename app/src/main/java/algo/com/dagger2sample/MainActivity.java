package algo.com.dagger2sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import algo.com.dagger2sample.car.Car;
import algo.com.dagger2sample.dagger.ActivityComponent;
import algo.com.dagger2sample.dagger.DieselEngineModule;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent carComponent = ((App) getApplication()).getAppComponent()
                .getActivityComponentBuilder()
                .horsePower(120)
                .engineCapacity(1400)
                .build();
        carComponent.inject(this);

        car1.drive();
        car2.drive();

    }
}
