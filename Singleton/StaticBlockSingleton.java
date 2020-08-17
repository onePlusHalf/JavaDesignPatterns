package Singleton;

public class EagerSingleton {
    private static final EagerSingleton instance;

    private EagerSingleton() {

    }

    static {
        try {
            instance = new EagerSingleton();
        } catch (Exception e) {
            System.out.println("Exception while initializing object : " + e);
        }
    }

    public EagerSingleton getInstance() {
        return instance;
    }
}
