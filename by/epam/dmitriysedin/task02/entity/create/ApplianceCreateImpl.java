package by.epam.dmitriysedin.task02.entity.create;

import by.epam.dmitriysedin.task02.entity.*;


/**
 * Created by Dmitriy Sedin on 22.12.2018.
 */
public class ApplianceCreateImpl implements ApplianceCreate{

    @Override
    public Appliance createAppliance(String typeOfAppliance){

        Appliance appliance = null;

        switch (typeOfAppliance){

            case "Oven":
                appliance = new Oven();
                break;
            case "Laptop":
                appliance = new Laptop();
                break;
            case "Refrigerator":
                appliance = new Refrigerator();
                break;
            case "VacuumCleaner":
                appliance = new VacuumCleaner();
                break;
            case "TabletPC":
                appliance = new TabletPC();
                break;
            case "Speakers":
                appliance = new Speakers();
                break;
        }
        return appliance;
    }
}
