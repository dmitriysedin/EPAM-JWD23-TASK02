package by.epam.dmitriysedin.task02.entity;

import java.util.Arrays;

public class Appliance {
	private Appliance[] arrayOfAppliance;

    public final Appliance[] getArrayOfAppliance() {
        return arrayOfAppliance;
    }

    public final void setArrayOfAppliance(Appliance[] arrayOfAppliance) {
        this.arrayOfAppliance = arrayOfAppliance;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "arrayOfAppliance=" + Arrays.toString(arrayOfAppliance) +
                '}';
    }
}
