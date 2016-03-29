package dp_composite_workplace_org;

public class WorkplaceEmployee extends WorkplaceAssetComponent {
	String name;
	String description;
	String ssn;
	double yearsSeinority;
	
	public WorkplaceEmployee(String name, String description, String ssn, double yearsSeinority){
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

	public String getSsn() {
		return ssn;
	}

	public double getYearsSeinority() {
		return yearsSeinority;
	}
	
	public String print(){
		return("Employee name: " + name + "\n" +
			   "Employee description " + description + "\n" +
			   "Employee ssn " + ssn + "\n" +
			   "Employee seinority " + yearsSeinority);
	}
}
