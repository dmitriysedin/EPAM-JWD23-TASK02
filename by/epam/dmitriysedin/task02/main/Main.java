package by.epam.dmitriysedin.task02.main;

import by.epam.dmitriysedin.task02.entity.criteria.Criteria;
import by.epam.dmitriysedin.task02.entity.criteria.SearchCriteria;
import by.epam.dmitriysedin.task02.service.ApplianceService;
import by.epam.dmitriysedin.task02.service.ServiceFactory;
import by.epam.dmitriysedin.task02.entity.Appliance;

public class Main {

	public static void main(String[] args) throws Exception {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<SearchCriteria.Oven> criteriaOven = new Criteria<SearchCriteria.Oven>();
		criteriaOven.add(SearchCriteria.Oven.CAPACITY, -32.025);

		appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<SearchCriteria.Oven>();
		criteriaOven.add(SearchCriteria.Oven.HEIGHT, 200);
		criteriaOven.add(SearchCriteria.Oven.DEPTH, 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria<SearchCriteria.TabletPC> criteriaTabletPC = new Criteria<SearchCriteria.TabletPC>();
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR, "blue");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM, 8000);

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

	}

}
