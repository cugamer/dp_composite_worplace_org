package dp_composite_workplace_org;

import java.util.ArrayList;

public abstract class WorkplaceAssetComponent {
//	String name;
//	String description;
//	ArrayList<WorkplaceAssetComponent> components = new ArrayList<>();
	
	public void add(WorkplaceAssetComponent component){
//		components.add(component);
		throw new UnsupportedOperationException();
	}
	
	public void remove(WorkplaceAssetComponent component){
		throw new UnsupportedOperationException();
	}
	
	public WorkplaceAssetComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	
	public String getName(){
		throw new UnsupportedOperationException();
	}
	
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
}
