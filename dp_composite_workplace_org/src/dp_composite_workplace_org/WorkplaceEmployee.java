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
	
	public void print(){
		System.out.println("Employee name: " + name);
		System.out.println("Employee description " + description);
		System.out.println("Employee ssn " + ssn);
		System.out.println("Employee seinority " + yearsSeinority + "\n");
	}
}
