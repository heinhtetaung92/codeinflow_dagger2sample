package algo.com.dagger2sample.dagger;

import javax.inject.Singleton;

import algo.com.dagger2sample.car.Driver;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}
