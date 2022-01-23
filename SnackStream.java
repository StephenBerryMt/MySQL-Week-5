package Week5;

import java.util.stream.Collectors;

public class SnackStream {

	public static void main(String[] args) {
		new SnackStream().run();
	}

	private void run() {
		String snacks = Snack.getSnackFoods().stream()
		.map((Snack) -> Snack.toString())
		.sorted()
		.collect(Collectors.joining(", "));
		System.out.println(snacks);
	}
	
}
