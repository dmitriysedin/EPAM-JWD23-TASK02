package by.epam.dmitriysedin.task02.entity.init;

import by.epam.dmitriysedin.task02.entity.*;

/**
 * Created by Dmitriy Sedin on 23.12.2018.
 */
public class ApplianceInitializeImpl implements ApplianceInitialize{

    public void init(Appliance appliance, String[] valueOfField){
        String nameOfClass = appliance.getClass().getSimpleName();

        switch (nameOfClass){
            case "Oven":
                ovenInit((Oven)appliance, valueOfField);
                break;
            case "Laptop":
                laptopInit((Laptop)appliance, valueOfField);
                break;
            case "Refrigerator":
                refrigeratorInit((Refrigerator)appliance, valueOfField);
                break;
            case "Speakers":
                speakersInit((Speakers)appliance, valueOfField);
                break;
            case "TabletPC":
                tabletPCInit((TabletPC)appliance, valueOfField);
                break;
            case "VacuumCleaner":
                vacuumCleanerInit((VacuumCleaner)appliance, valueOfField);
                break;
        }
    }

    private void ovenInit(Oven oven, String[] valueOfField){

        int indexOfPowerConsumption = 0;
        int indexOfWeight = 1;
        int indexOfCapacity = 2;
        int indexOfDepth = 3;
        int indexOfHeight = 4;
        int indexOfWidth = 5;

        oven.setPowerConsumption(Double.parseDouble(valueOfField[indexOfPowerConsumption]));
        oven.setWeight(Double.parseDouble(valueOfField[indexOfWeight]));
        oven.setCapacity(Double.parseDouble(valueOfField[indexOfCapacity]));
        oven.setDepth(Double.parseDouble(valueOfField[indexOfDepth]));
        oven.setHeight(Double.parseDouble(valueOfField[indexOfHeight]));
        oven.setWidth(Double.parseDouble(valueOfField[indexOfWidth]));
    }

    private void laptopInit(Laptop laptop, String[] valueOfField){

        int indexOfBatteryCapacity = 0;
        int indexOfOperationSystem = 1;
        int indexOfMemoryRom = 2;
        int indexOfsystemMemory = 3;
        int indexOfProcessor = 4;
        int indexOfDisplayInches = 5;

        laptop.setBatteryCapacity(Double.parseDouble(valueOfField[indexOfBatteryCapacity]));
        laptop.setOperationSystem(valueOfField[indexOfOperationSystem]);
        laptop.setMemoryRom(Double.parseDouble(valueOfField[indexOfMemoryRom]));
        laptop.setSystemMemory(Double.parseDouble(valueOfField[indexOfsystemMemory]));
        laptop.setProcessor(Double.parseDouble(valueOfField[indexOfProcessor]));
        laptop.setDisplayInches(Double.parseDouble(valueOfField[indexOfDisplayInches]));
    }

    private void refrigeratorInit(Refrigerator refrigerator, String[] valueOfField){

        int indexOfPowerConcumption = 0;
        int indexOfWeight = 1;
        int indexOfFreezerCapacity = 2;
        int indexOverallCapacity = 3;
        int indexOfHeight = 4;
        int indexOfWidth = 5;

        refrigerator.setPowerConcumption(Double.parseDouble(valueOfField[indexOfPowerConcumption]));
        refrigerator.setWeight(Double.parseDouble(valueOfField[indexOfWeight]));
        refrigerator.setFreezerCapacity(Double.parseDouble(valueOfField[indexOfFreezerCapacity]));
        refrigerator.setOverallCapacity(Double.parseDouble(valueOfField[indexOverallCapacity]));
        refrigerator.setHeight(Double.parseDouble(valueOfField[indexOfHeight]));
        refrigerator.setWidth(Double.parseDouble(valueOfField[indexOfWidth]));
    }

    private void speakersInit(Speakers speakers, String[] valueOfField){

        int indexOfPowerConsumption = 0;
        int indexOfNumberOfSpeakers = 1;
        int indexOfFrequencyRange = 2;
        int indexOfCordLength = 3;

        speakers.setPowerConsumption(Double.parseDouble(valueOfField[indexOfPowerConsumption]));
        speakers.setNumberOfSpeakers(Double.parseDouble(valueOfField[indexOfNumberOfSpeakers]));
        speakers.setFrequencyRange(Double.parseDouble(valueOfField[indexOfFrequencyRange]));
        speakers.setCordLength(Double.parseDouble(valueOfField[indexOfCordLength]));
    }

    private void tabletPCInit(TabletPC tabletPC, String[] valueOfField){

        int indexOfBatteryCapacity = 0;
        int indexOfDisplayInches = 1;
        int indexOfMemoryRom = 2;
        int indexOfFlashMemoryCapacity = 3;
        int indexOfcolor = 4;

        tabletPC.setBatteryCapacity(Double.parseDouble(valueOfField[indexOfBatteryCapacity]));
        tabletPC.setDisplayInches(Double.parseDouble(valueOfField[indexOfDisplayInches]));
        tabletPC.setMemoryRom(Double.parseDouble(valueOfField[indexOfMemoryRom]));
        tabletPC.setFlashMemoryCapacity(Double.parseDouble(valueOfField[indexOfFlashMemoryCapacity]));
        tabletPC.setColor(valueOfField[indexOfcolor]);
    }

    private void vacuumCleanerInit(VacuumCleaner vacuumCleaner, String[] valueOfField){

        int indexOfPowerConsumption = 0;
        int indexOfFilterType = 1;
        int indexOfBagType = 2;
        int indexOfWandType = 3;
        int indexOfMotorSpeedRegulation = 4;
        int indexOfCleaningWidth = 5;

        vacuumCleaner.setPowerConsumption(Double.parseDouble(valueOfField[indexOfPowerConsumption]));
        vacuumCleaner.setFilterType(valueOfField[indexOfFilterType]);
        vacuumCleaner.setBagType(valueOfField[indexOfBagType]);
        vacuumCleaner.setWandType(valueOfField[indexOfWandType]);
        vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(valueOfField[indexOfMotorSpeedRegulation]));
        vacuumCleaner.setCleaningWidth(Double.parseDouble(valueOfField[indexOfCleaningWidth]));
    }
}
