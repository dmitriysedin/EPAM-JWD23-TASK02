package by.epam.dmitriysedin.task02.dao.exception;

/**
 * Created by Dmitriy Sedin on 25.12.2018.
 */
public class DAOException extends Exception {

    public DAOException() {
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }
}
