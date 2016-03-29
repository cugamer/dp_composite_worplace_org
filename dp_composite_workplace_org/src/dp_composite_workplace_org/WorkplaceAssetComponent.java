package dp_composite_workplace_org;

import java.util.ArrayList;

public abstract class WorkplaceAssetComponent {
	public void add(WorkplaceAssetComponent component){
		throw new UnsupportedOperationException();
	}
	
	public void add(WorkplaceAssetComponent[] component){
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
	
	public int getSSN(){
		throw new UnsupportedOperationException();
	}
	
	public double getYearsSeinority(){
		throw new UnsupportedOperationException();
	}
	
	public String print(){
		throw new UnsupportedOperationException();
	}
	
	public ArrayList<WorkplaceAssetComponent> getComponents(){
		throw new UnsupportedOperationException();
	}
}
