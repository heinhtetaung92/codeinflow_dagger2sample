package algo.com.dagger2sample.dagger;

import algo.com.dagger2sample.car.DieselEngine;
import algo.com.dagger2sample.car.Engine;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideDieselEngine(DieselEngine engine) {
        return engine;
    }

}
