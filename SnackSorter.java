package Week5;

import java.util.List;

public class SnackSorter {

	public static void main(String[] args) {
		new SnackSorter().run();
	}
	
	private void run() {
		List<Snack> lambdaSnacks = sortByLambda();
		System.out.println(lambdaSnacks);
	
	List<Snack> snackMethod = methReference();
	System.out.println(snackMethod);
	}
	
private List<Snack> methReference() {
	List<Snack> snacks = Snack.getSnackFoods();
	snacks.sort(Snack::compare);
	return snacks;
}
	
	private List<Snack> sortByLambda() {
		List<Snack> lambdaSnacks = Snack.getSnackFoods();
		lambdaSnacks.sort((s1, s2) -> Snack.compare(s1, s2));
		return lambdaSnacks;
	}
	
}
