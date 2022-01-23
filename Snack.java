package Week5;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class Snack {
	
	private String Snacks;
	
	private static List<Snack> snackFoods = new ArrayList<>(List.of
	(new Snack("Chips"),
	new Snack("Peanuts"),
	new Snack("Trail mix"),
	new Snack("Popcorn")));

	public Snack(String snacks) {
		this.Snacks = snacks;
	}

	public String getSnacks() {
		return Snacks;
	}

	public void setSnacks(String snacks) {
		Snacks = snacks;
	}

	@Override
	public String toString() {
		return Snacks;
		
	}
	
	public static int compare(Snack s1, Snack s2 ) {
		return s1.Snacks.compareTo(s2.Snacks);
	}

	public static List<Snack> getSnackFoods() {
		return new ArrayList<>(snackFoods);
	}
	
	
	


	
}
