

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {

		// Initialise some household
		List<HouseholdItem> householdItmes = new ArrayList<>();
		PriceCalculator price = new PriceCalculator();
		PackingInstructions packing = new PackingInstructions();

		Electronic microwaveOven = new Electronic("Microwave Oven", 37, 48, 27, 13, false);
		Electronic tv = new Electronic("TV", 122, 73, 15, 18, true);

		Glass wineGlass = new Glass("Wine glasses", 33, 28, 23, 1);
		Glass coffeeTable = new Glass("Glass Coffee Table ", 80, 80, 45, 3);

		Furniture bed = new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard = new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);

		List<HouseholdItem> namesList = Arrays.asList(microwaveOven, tv, wineGlass, coffeeTable, bed, cupboard);
		householdItmes.addAll(namesList);
		
		System.out.println("Total Cost for TV is:" + " " + tv.accept(price));
		System.out.println("Total Cost for Microwave Oven is:" + " " + microwaveOven.accept(price));
		System.out.println("Total Cost for Wine Glasses is:" + " " + wineGlass.accept(price));
		System.out.println("Total Cost for Glass Coffee Table is:" + " " + coffeeTable.accept(price));
		System.out.println("Total Cost for Bed is:" + " " + bed.accept(price));
		System.out.println("Total Cost for Bookshel is:" + " " + cupboard.accept(price));
		System.out.println("\n");
		System.out.println("Microwave Oven:" + "\n"  + microwaveOven.accept2(packing));
		System.out.println("TV" + "\n" + tv.accept2(packing));
		System.out.println("Wine Glasses" + "\n" + wineGlass.accept2(packing));
		System.out.println("Glass Coffee Table"+ "\n" + coffeeTable.accept2(packing));
		System.out.println("Bed" + "\n" + bed.accept2(packing));
		System.out.println("Bookshelf:" + "\n" + cupboard.accept2(packing));
		
		
		
		

	}

}
