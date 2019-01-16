package by.epam.dmitriysedin.task02.database;

import by.epam.dmitriysedin.task02.database.exception.DatabaseException;
import by.epam.dmitriysedin.task02.entity.criteria.Criteria;

/**
 * Created by Dmitriy Sedin on 16.01.2019.
 */
public interface ApplianceDataBase  {

    <E> String[] readWithCriteria(Criteria<E> criteria) throws DatabaseException;
}
