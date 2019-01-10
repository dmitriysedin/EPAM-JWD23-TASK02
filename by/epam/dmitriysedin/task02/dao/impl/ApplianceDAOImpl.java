package by.epam.dmitriysedin.task02.dao.impl;

import by.epam.dmitriysedin.task02.dao.ApplianceDAO;
import by.epam.dmitriysedin.task02.dao.exception.DAOException;
import by.epam.dmitriysedin.task02.dao.parse.ApplianceParse;
import by.epam.dmitriysedin.task02.entity.factory.ApplianceFactory;
import by.epam.dmitriysedin.task02.entity.init.Initialize;
import by.epam.dmitriysedin.task02.dao.read.ReadFromFile;
import by.epam.dmitriysedin.task02.entity.criteria.Criteria;
import by.epam.dmitriysedin.task02.entity.Appliance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {

    private static final String FILE_NAME = "main\\resources\\appliances_db.txt";

	@Override
	public <E> Appliance[] find(Criteria<E> criteria) throws DAOException{

		String[] readResult = ReadFromFile.readFromFile(FILE_NAME, criteria);

        Appliance[] result = null;

        if(readResult.length == 0){
            return result;
        }

        String nameOfApplianceType = getTypeOfAppliance(criteria);

        List<Appliance> applianceList = new ArrayList<>();

        for (String s: readResult) {

            String[] fields = ApplianceParse.applianceValueOfFieldParse(s);
            Appliance appliances = ApplianceFactory.getAppliance(nameOfApplianceType);
            Initialize.init(appliances, fields);
            applianceList.add(appliances);
        }

        result = new Appliance[applianceList.size()];

        return applianceList.toArray(result);
	}

	private <E> String getTypeOfAppliance(Criteria<E> criteria){

        Iterator<Map.Entry<E, Object>> iter = criteria.getCriteria().entrySet().iterator();

        return iter.next().getKey().getClass().getSimpleName();
    }
}

