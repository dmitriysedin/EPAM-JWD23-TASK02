package by.epam.dmitriysedin.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Criteria)) return false;

		Criteria<?> criteria1 = (Criteria<?>) o;

		return getCriteria() != null ? getCriteria().equals(criteria1.getCriteria()) : criteria1.getCriteria() == null;
	}

	@Override
	public int hashCode() {
		return getCriteria() != null ? getCriteria().hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Criteria{" +
				"criteria=" + criteria +
				'}';
	}

}
