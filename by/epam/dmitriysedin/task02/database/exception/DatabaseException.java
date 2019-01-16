package by.epam.dmitriysedin.task02.database.exception;

/**
 * Created by Dmitriy Sedin on 16.01.2019.
 */
public class DatabaseException extends Exception {

    public DatabaseException() {
    }

    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatabaseException(Throwable cause) {
        super(cause);
    }
}
