package by.epam.dmitriysedin.task02.main;

import by.epam.dmitriysedin.task02.entity.Appliance;

import java.util.Arrays;

public class PrintApplianceInfo implements Print {

    @Override
	public void print(Appliance[] appliance) {

        if(appliance == null) {
            System.out.println("There is no matches");
        } else {
            for (Appliance app : appliance) {
                System.out.println(Arrays.toString(appliance));
            }
        }
    }
}
