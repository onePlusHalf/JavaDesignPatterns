package Singleton;

public class EagerSingleton {
    private static final EagerSingleton instance;

    private EagerSingleton() {

    }

    public synchronized EagerSingleton getInstance() {
        return instance ? instance : new EagerSingleton();
    }
}
