/**
 * Simplest Form of the Singleton Pattern
 * Instance is created at the time of class loading
 */
public final class EagerInitialization {
    // Eagerly create the instance when the class is loaded
    private static final EagerInitialization instance = new EagerInitialization();

    // Private Constructor to prevent instance creation outside this class
    private EagerInitialization() {
    }

    // Public Method to return the instance
    public static EagerInitialization getInstance() {
        return instance;
    }
}