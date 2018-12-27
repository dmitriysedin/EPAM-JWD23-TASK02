package by.epam.dmitriysedin.task02.service.impl;

import by.epam.dmitriysedin.task02.dao.exception.DAOException;
import by.epam.dmitriysedin.task02.service.ApplianceService;
import by.epam.dmitriysedin.task02.service.exception.ServiceException;
import by.epam.dmitriysedin.task02.service.validation.Validator;
import by.epam.dmitriysedin.task02.dao.ApplianceDAO;
import by.epam.dmitriysedin.task02.dao.DAOFactory;
import by.epam.dmitriysedin.task02.entity.Appliance;
import by.epam.dmitriysedin.task02.entity.criteria.Criteria;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public <E> Appliance find(Criteria<E> criteria) throws ServiceException {

		if (!Validator.criteriaValidator(criteria)) {
			//throw new ValidationException
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		Appliance appliance;
		try {
			appliance = applianceDAO.find(criteria);
		} catch (DAOException e){
			throw new ServiceException(e);
		}
		return appliance;
	}
}
