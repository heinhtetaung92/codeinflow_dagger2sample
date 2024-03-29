package algo.com.dagger2sample.dagger;

import algo.com.dagger2sample.car.Rims;
import algo.com.dagger2sample.car.Tires;
import algo.com.dagger2sample.car.Wheels;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
