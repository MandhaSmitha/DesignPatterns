/**
 * Instance is created only when requested.
 */
public final class LazyInitialization {
    // Instance Reference
    private static LazyInitialization instance;

    // Private Constructor to prevent instance creation outside the class
    private LazyInitialization() {
    }

    // Public Method to return the instance
    public static LazyInitialization getInstance() {
        // Check to see if the instance has been initialized or not
        // Below check is not thread safe as 2 threads can invoke getInstance() at the same time
        // and if both the threads pass the instance null check then there would be 2 instances created
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}