package dp_composite_workplace_org;

import java.util.ArrayList;

public class WorkplaceTeam extends WorkplaceAssetComponent {
	String name;
	String description;
	ArrayList<WorkplaceAssetComponent> components = new ArrayList<>();

	public WorkplaceTeam(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public void add(WorkplaceAssetComponent component){
		components.add(component);
	}
	
	public void remove(WorkplaceAssetComponent component){
		components.remove(component);
	}
	
	public WorkplaceAssetComponent getChild(int i){
		return components.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}
