package by.epam.dmitriysedin.task02.dao.read;

import by.epam.dmitriysedin.task02.dao.chekinputdata.CheckString;
import by.epam.dmitriysedin.task02.dao.exception.DAOException;
import by.epam.dmitriysedin.task02.entity.criteria.Criteria;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitriy Sedin on 21.12.2018.
 */
public class ReadFromFile {

    public static <E> String[] readFromFile(String fileName, Criteria<E> criteria) throws DAOException {

        List<String> readResult = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String s;

            while ((s = br.readLine()) != null) {
                if (CheckString.isContains(s, criteria)) {
                    readResult.add(s);
                }
            }
        } catch (IOException e) {
            throw new DAOException(e);
        }
        String[] resultArr = new String[readResult.size()];
        return readResult.toArray(resultArr);
    }
}

