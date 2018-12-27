package by.epam.dmitriysedin.task02.dao;

import by.epam.dmitriysedin.task02.dao.exception.DAOException;
import by.epam.dmitriysedin.task02.entity.criteria.Criteria;
import by.epam.dmitriysedin.task02.entity.Appliance;

public interface ApplianceDAO {
	<E> Appliance find(Criteria<E> criteria) throws DAOException;
}
