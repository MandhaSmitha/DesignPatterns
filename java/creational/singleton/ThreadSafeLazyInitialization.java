/**
 * Thread Safe version of Lazy Initialization of a singleton
 */
public final class ThreadSafeLazyInitialization {
    // Instance Reference
    private static volatile ThreadSafeLazyInitialization instance;

    // Private Constructor to prevent instance creation outside the class
    private ThreadSafeLazyInitialization() {
    }

    public static ThreadSafeLazyInitialization getInstance() {
        // This leads to poor performance
        synchronized (ThreadSafeLazyInitialization.class) {
            if (instance == null) {
                instance = new ThreadSafeLazyInitialization();
            }
        }
        // Double check locking mechanism ensuring only one thread instantiates
        // while improving performance
        if (instance == null) {
            synchronized (ThreadSafeLazyInitialization.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazyInitialization();
                }
            }
        }
        return instance;
    }
}