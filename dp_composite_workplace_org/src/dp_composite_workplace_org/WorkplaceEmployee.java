package dp_composite_workplace_org;

public class WorkplaceEmployee extends WorkplaceAssetComponent {
	String name;
	String description;
	int ssn;
	double yearsSeinority;
	
	public WorkplaceEmployee(String name, String description, int ssn, float yearsSeinority){
		this.name = name;
		this.description = description;
		this.ssn = ssn;
		this.yearsSeinority = yearsSeinority;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getSsn() {
		return ssn;
	}

	public double getYearsSeinority() {
		return yearsSeinority;
	}
}
