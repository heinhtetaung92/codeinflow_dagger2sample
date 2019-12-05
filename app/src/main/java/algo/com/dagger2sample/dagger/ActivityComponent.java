package algo.com.dagger2sample.dagger;

import javax.inject.Named;

import algo.com.dagger2sample.MainActivity;
import algo.com.dagger2sample.car.Car;
import dagger.BindsInstance;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent (modules = { WheelsModule.class, PetrolEngineModule.class } )
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        ActivityComponent build();
    }

}
