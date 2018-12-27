package by.epam.dmitriysedin.task02.main;

import by.epam.dmitriysedin.task02.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {

		Appliance[] appliancesArray = appliance.getArrayOfAppliance();

        if(appliancesArray == null) {
            System.out.println("There is no matches");
        } else {
            for (Appliance app : appliancesArray) {
                System.out.println(appliance);
            }
        }
    }
}
