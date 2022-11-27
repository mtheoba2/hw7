

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
	


	public Composite(String name) {
		this.name = name;
	}

	private String name;

	
	public List<Component> Children = new ArrayList<>();
	
	public void addComponent(Component com) {
		Children.add(com);
	}
	
	public void removeComponent(Component com) {
		Children.remove(com);
	}
	public String getName() {
		return name;
	}
	 

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void printName() {
		System.out.println(this.getName() + ":");
		for (Component c : Children) {
			c.printName();
		}
		
	}

	@Override
	public void printNameAndNumberAthletes() {
		System.out.println(this.getName() + ":");
		for (Component c : Children) {
			c.printNameAndNumberAthletes();
		}
		
	}

	@Override
	public void printNameAndNumberMedals() {
		System.out.println(this.getName() + ":");
		for (Component c : Children) {
			c.printNameAndNumberMedals();
		}
		
	}

}
