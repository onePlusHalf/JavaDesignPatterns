package Singleton;

public class EagerSingleton {
    private static final EagerSingleton instance;

    private EagerSingleton() {

    }

    public EagerSingleton getInstance() {
        if (!instance) {
            instance = new EagerSingleton();
            return instance;
        }

        return instance;
    }
}
