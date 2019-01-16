package by.epam.dmitriysedin.task02.database;

import by.epam.dmitriysedin.task02.database.exception.DatabaseException;
import by.epam.dmitriysedin.task02.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dmitriy Sedin on 16.01.2019.
 */
public class ApplianceDataBaseImpl implements ApplianceDataBase {

    private static final String DATA_FILE_NAME = "main\\resources\\appliances_db.txt";

    @Override
    public <E> String[] readWithCriteria(Criteria<E> criteria) throws DatabaseException {

        List<String> readResult = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(DATA_FILE_NAME))) {

            String s;

            while ((s = br.readLine()) != null) {

                addCheckedStringToList(s, criteria, readResult);
            }
        } catch (IOException e) {
            throw new DatabaseException(e);
        }
        String[] resultArr = new String[readResult.size()];
        return readResult.toArray(resultArr);
    }

    private <E> void addCheckedStringToList(String str, Criteria<E> criteria, List<String> result){

        if (isCriteriaContainsInLine(str, criteria)) {
            result.add(str);
        }
    }

    private  <E> boolean isCriteriaContainsInLine(String str, Criteria<E> criteria){

        Iterator<Map.Entry<E, Object>> iter = criteria.getCriteria().entrySet().iterator();

        while (iter.hasNext()){
            Map.Entry<E, Object> entry = iter.next();

            String typeOfAppliance = entry.getKey().getClass().getSimpleName();
            String nameOfSearchParam = entry.getKey().toString();
            Object valueOfSearchParam = entry.getValue();

            Matcher matcher = Pattern.compile(nameOfSearchParam + "=" + valueOfSearchParam +
                    "[\\s,;]+").matcher(str);

            if(!str.contains(typeOfAppliance) || (str.contains(typeOfAppliance) &&
                    !matcher.find())){
                return false;
            }
        }
        return true;
    }
}
