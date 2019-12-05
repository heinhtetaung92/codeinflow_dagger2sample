package algo.com.dagger2sample.dagger;

import algo.com.dagger2sample.car.Engine;
import algo.com.dagger2sample.car.PetrolEngine;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine provideEngine(PetrolEngine engine);

}
