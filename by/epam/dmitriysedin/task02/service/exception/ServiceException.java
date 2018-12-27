package by.epam.dmitriysedin.task02.service.exception;

/**
 * Created by Dmitriy Sedin on 25.12.2018.
 */
public class ServiceException extends Exception{

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
