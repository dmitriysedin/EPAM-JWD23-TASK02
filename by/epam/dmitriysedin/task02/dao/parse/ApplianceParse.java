package by.epam.dmitriysedin.task02.dao.parse;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dmitriy Sedin on 22.12.2018.
 */
public class ApplianceParse {

    private static final String FIELD_REGEX = "=[\\w\\-\\.]+";

    public static String[] applianceValueOfFieldParse(String str) {
        Matcher matcher = Pattern.compile(FIELD_REGEX).matcher(str);
        ArrayList<String> list = new ArrayList<>();
        while (matcher.find()){
            list.add(matcher.group().substring(1));
        }

        String[] arr = new String[list.size()];
        return list.toArray(arr);
    }
}
