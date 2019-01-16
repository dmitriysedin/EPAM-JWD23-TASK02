package by.epam.dmitriysedin.task02.dao.impl;

import by.epam.dmitriysedin.task02.dao.ApplianceDAO;
import by.epam.dmitriysedin.task02.dao.exception.DAOException;
import by.epam.dmitriysedin.task02.database.ApplianceDataBase;
import by.epam.dmitriysedin.task02.database.DataBaseFactory;
import by.epam.dmitriysedin.task02.database.exception.DatabaseException;
import by.epam.dmitriysedin.task02.entity.create.ApplianceCreate;
import by.epam.dmitriysedin.task02.entity.create.ApplianceCreateImpl;
import by.epam.dmitriysedin.task02.entity.init.ApplianceInitialize;
import by.epam.dmitriysedin.task02.entity.init.ApplianceInitializeImpl;
import by.epam.dmitriysedin.task02.entity.criteria.Criteria;
import by.epam.dmitriysedin.task02.entity.Appliance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public <E> Appliance[] find(Criteria<E> criteria) throws DAOException{
        
        String[] readDataBase;

        try {
            ApplianceDataBase dataBase = DataBaseFactory.getInstance().applianceDataBase();
            readDataBase = dataBase.readWithCriteria(criteria);
        }catch (DatabaseException e){
            throw new DAOException(e);
        }
        
        Appliance[] result = null;

        if(readDataBase.length == 0){
            return result;
        }

        String nameOfApplianceType = findTypeOfAppliance(criteria);
        List<Appliance> applianceList = new ArrayList<>();
        ApplianceCreate create = new ApplianceCreateImpl();
        ApplianceInitialize initialize = new ApplianceInitializeImpl();

        for (String s: readDataBase) {

            String[] fields = applianceParse(s);
            Appliance appliance = create.createAppliance(nameOfApplianceType);
            initialize.init(appliance, fields);
            applianceList.add(appliance);
        }

        result = new Appliance[applianceList.size()];

        return applianceList.toArray(result);
	}

	
	private <E> String findTypeOfAppliance(Criteria<E> criteria){

        Iterator<Map.Entry<E, Object>> iter = criteria.getCriteria().entrySet().iterator();

        return iter.next().getKey().getClass().getSimpleName();
    }


    private static final String FIELD_REGEX = "=[\\w\\-\\.]+";

    private String[] applianceParse(String str) {
        Matcher matcher = Pattern.compile(FIELD_REGEX).matcher(str);
        ArrayList<String> list = new ArrayList<>();
        while (matcher.find()){
            list.add(matcher.group().substring(1));

        }
        String[] arr = new String[list.size()];
        return list.toArray(arr);
    }
}

