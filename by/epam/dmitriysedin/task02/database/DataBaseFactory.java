package by.epam.dmitriysedin.task02.database;

/**
 * Created by Dmitriy Sedin on 16.01.2019.
 */
public final class DataBaseFactory {

    private static final DataBaseFactory instance = new DataBaseFactory();

    private final ApplianceDataBase applianceDataBase = new ApplianceDataBaseImpl();

    private DataBaseFactory() {}

    public ApplianceDataBase applianceDataBase() {
        return applianceDataBase;
    }

    public static DataBaseFactory getInstance() {
        return instance;
    }
}
