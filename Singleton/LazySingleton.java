package Singleton;

public class EagerSingleton {
    private static final EagerSingleton instance;

    private EagerSingleton() {

    }

    public EagerSingleton getInstance() {
        return instance ? instance : new EagerSingleton();
    }
}
