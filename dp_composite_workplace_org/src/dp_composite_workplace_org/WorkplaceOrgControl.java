package dp_composite_workplace_org;

public class WorkplaceOrgControl {

	public static void main(String[] args) {
		WorkplaceAssetComponent webDesign = new WorkplaceTeam("Web Design",
												"Centeral webDesign for all web products");
		WorkplaceAssetComponent webDevelopment = new WorkplaceTeam("Development",
												"Implementation of web products");
		WorkplaceAssetComponent emp1 = new WorkplaceEmployee("Huey", "Harvard grad", "555-55-55555", 3.7);
		WorkplaceAssetComponent emp2 = new WorkplaceEmployee("Dewie", "Yale grad", "555-55-55556", 3.9);
		WorkplaceAssetComponent emp3 = new WorkplaceEmployee("Huey", "Princton grad", "555-55-55557", 4.7);
		WorkplaceAssetComponent emp4 = new WorkplaceEmployee("Peter", "Harvard grad", "555-55-55559", 3.7);
		WorkplaceAssetComponent emp5 = new WorkplaceEmployee("Paul", "Yale grad", "555-55-55558", 3.9);
		WorkplaceAssetComponent emp6 = new WorkplaceEmployee("Mary", "Princton grad", "555-55-55550", 4.7);		
		webDesign.add(new WorkplaceAssetComponent[] {emp1, emp2, emp3});
		webDevelopment.add(new WorkplaceAssetComponent[] {emp4, emp5, emp6});
		
		WorkplaceAssetComponent webDept = new WorkplaceTeam("Web department",
												"Handles all web related products");
		webDept.add(new WorkplaceAssetComponent[] {webDesign, webDevelopment});
		
		WorkplaceAssetComponent marketing = new WorkplaceTeam("Marketing",
												"Marketing for all products");
		WorkplaceAssetComponent emp7 = new WorkplaceEmployee("Crosby", "Harvard grad", "555-55-55551", 3.7);
		WorkplaceAssetComponent emp8 = new WorkplaceEmployee("Stills", "Yale grad", "555-55-55552", 3.9);
		WorkplaceAssetComponent emp9 = new WorkplaceEmployee("nash", "Princton grad", "555-55-55553", 4.7);
		marketing.add(new WorkplaceAssetComponent[] {emp7, emp8, emp9});
		
		webDept.print();
		System.out.println("---------------------------------");
		marketing.print();
	}

}
