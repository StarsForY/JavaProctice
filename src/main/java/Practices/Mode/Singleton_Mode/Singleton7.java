package Practices.Mode.Singleton_Mode;

public class Singleton7 {
    private Singleton7() {}

    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
