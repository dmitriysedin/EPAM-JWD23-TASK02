package by.epam.dmitriysedin.task02.service;

import by.epam.dmitriysedin.task02.entity.Appliance;
import by.epam.dmitriysedin.task02.entity.criteria.Criteria;
import by.epam.dmitriysedin.task02.service.exception.ServiceException;

public interface ApplianceService {	
	
	<E> Appliance find(Criteria<E> criteria) throws ServiceException;
	
}
