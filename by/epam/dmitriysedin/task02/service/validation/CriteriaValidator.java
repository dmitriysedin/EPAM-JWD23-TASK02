package by.epam.dmitriysedin.task02.service.validation;

import by.epam.dmitriysedin.task02.entity.criteria.Criteria;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CriteriaValidator {
	
	public static <E> boolean isValidate(Criteria<E> criteria) {

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
