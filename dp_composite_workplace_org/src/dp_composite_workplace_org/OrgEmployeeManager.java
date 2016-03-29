package dp_composite_workplace_org;

public class OrgEmployeeManager {
	WorkplaceAssetComponent marketingTeam;
	WorkplaceAssetComponent webTeams;
	
	public OrgEmployeeManager(WorkplaceAssetComponent marketingTeam, WorkplaceAssetComponent webTeams){
		this.marketingTeam = marketingTeam;
		this.webTeams = webTeams;
	}
	
	public void printMarketingTeam(){
		marketingTeam.print();
	}
	
	public void printAllWebTeams(){
		webTeams.print();
	}

}
