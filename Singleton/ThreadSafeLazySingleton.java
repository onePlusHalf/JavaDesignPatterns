package Singleton;

public class EagerSingleton {
    private static final EagerSingleton instance;

    private EagerSingleton() {

    }

    public synchronized EagerSingleton getInstance() {
        if (!instance) {
            instance = new EagerSingleton();
            return instance;
        }

        return instance;
    }
}
