package by.epam.dmitriysedin.task02.dao.chekinputdata;

import by.epam.dmitriysedin.task02.entity.criteria.Criteria;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dmitriy Sedin on 21.12.2018.
 */
public class CheckString {

    public static <E> boolean isContains(String str, Criteria<E> criteria){

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
