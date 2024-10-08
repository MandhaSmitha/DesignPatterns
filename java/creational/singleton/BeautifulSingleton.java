/**
 * Beautiful Thread Safe and Efficient Singleton
 */
public final class BeautifulSingleton {

    // Private Constructor to prevent instance creation outside the class
    private BeautifulSingleton() {
    }

    // Instance is created only when this class is loaded by the classloader(when this class is referenced)
    private static class SingletonHolder {
        private static final BeautifulSingleton INSTANCE = new BeautifulSingleton();
    }

    public static BeautifulSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}