package pl.raziel.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by dlok on 25/05/2017.
 */
public class SomeBean {
	private List<String> stringsList;
	private Set<Integer> integersSet;
	private Long[] longsArray;

	public SomeBean(List<String> stringsList, Set<Integer> integersSet, Long[] longsArray) {
		this.stringsList = stringsList;
		this.integersSet = integersSet;
		this.longsArray = longsArray;
	}

	public List<String> getStringsList() {
		return stringsList;
	}

	public void setStringsList(List<String> stringsList) {
		this.stringsList = stringsList;
	}

	public Set<Integer> getIntegersSet() {
		return integersSet;
	}

	public void setIntegersSet(Set<Integer> integersSet) {
		this.integersSet = integersSet;
	}

	public Long[] getLongsArray() {
		return longsArray;
	}

	public void setLongsArray(Long[] longsArray) {
		this.longsArray = longsArray;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SomeBean{");
		sb.append("stringsList=").append(stringsList);
		sb.append(", integersSet=").append(integersSet);
		sb.append(", longsArray=").append(Arrays.toString(longsArray));
		sb.append('}');
		return sb.toString();
	}
}
