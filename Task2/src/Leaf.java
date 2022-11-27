

public class Leaf implements Component{
	public Leaf(String name, int number_athletes, int number_medals) {
		super();
		this.name = name;
		this.number_athletes = number_athletes;
		this.number_medals = number_medals;
	}

	private String name;
	private int number_athletes;
	private int number_medals;

	public int getNumber_medals() {
		return number_medals;
	}

	public void setNumber_medals(int number_medals) {
		this.number_medals = number_medals;
	}

	public int getNumber_athletes() {
		return number_athletes;
	}

	public void setNumber_athletes(int number_athletes) {
		this.number_athletes = number_athletes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printName() {
		System.out.println(this.getName());
		
	}
	@Override
	public void printNameAndNumberAthletes() {
		System.out.println("Team:" + this.getName() + ", Number of Athletes:" + this.getNumber_athletes());
		
	}

	@Override
	public void printNameAndNumberMedals() {
		System.out.println("Team:" + this.getName() + ",Number of Gold Medals:" + this.getNumber_medals());
		
	}

}
