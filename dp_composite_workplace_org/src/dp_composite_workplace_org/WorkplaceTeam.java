package dp_composite_workplace_org;

import java.util.ArrayList;
import java.util.Iterator;

public class WorkplaceTeam extends WorkplaceAssetComponent {
	String name;
	String description;
	public ArrayList<WorkplaceAssetComponent> components = new ArrayList<>();

	public WorkplaceTeam(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public void add(WorkplaceAssetComponent component){
		components.add(component);
	}
	
	public void add(WorkplaceAssetComponent[] component){
		for(int i = 0; i < component.length; i++){
			add(component[i]);
		}
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
	
	public void print(){
		System.out.println(getName() + "\n" +
				getDescription() + "\n");
		Iterator<WorkplaceAssetComponent> iterator = components.iterator();
		while(iterator.hasNext()){
			WorkplaceAssetComponent component = iterator.next();
			component.print();
		}
	}
	
	public ArrayList<WorkplaceAssetComponent> getComponents(){
		return components;
	}
}
