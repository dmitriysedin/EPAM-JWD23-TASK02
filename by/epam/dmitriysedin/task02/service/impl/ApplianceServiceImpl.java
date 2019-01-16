package by.epam.dmitriysedin.task02.service.impl;

import by.epam.dmitriysedin.task02.dao.exception.DAOException;
import by.epam.dmitriysedin.task02.service.ApplianceService;
import by.epam.dmitriysedin.task02.service.exception.ServiceException;
import by.epam.dmitriysedin.task02.dao.ApplianceDAO;
import by.epam.dmitriysedin.task02.dao.DAOFactory;
import by.epam.dmitriysedin.task02.entity.Appliance;
import by.epam.dmitriysedin.task02.entity.criteria.Criteria;

import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public <E> Appliance[] find(Criteria<E> criteria) throws ServiceException {

		if (!isPositiveValueOfCriteria(criteria)) {
			throw new ServiceException("Value of criteria must be positive");
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		Appliance[] appliance;
		try {
			appliance = applianceDAO.find(criteria);
		} catch (DAOException e){
			throw new ServiceException(e);
		}
		return appliance;
	}


	private  <E> boolean isPositiveValueOfCriteria(Criteria<E> criteria) {

		Iterator<Map.Entry<E, Object>> iter = criteria.getCriteria().entrySet().iterator();

		while (iter.hasNext()){
			Map.Entry<E, Object> entry = iter.next();

			Object valueOfSearchParam = entry.getValue();

			Matcher matcher = Pattern.compile("-*\\d+\\.*\\d*").matcher(valueOfSearchParam.toString());

			while (matcher.find()) {

				if (Double.parseDouble(matcher.group()) < 0) {
					return false;
				}
			}
		}
		return true;
	}
}
