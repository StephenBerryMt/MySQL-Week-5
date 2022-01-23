package Week5;

import java.util.NoSuchElementException;
import java.util.Optional;

public class SnackOptional {
	
 public static void main(String[] args) {
	new SnackOptional().run();
	
 	}
 
 private void run() {
	 Snack snack = snackMethod(Optional.of(new Snack("Out of snacks! Sad face.")));
	 System.out.println(snack);
	 
	 try {
	 snackMethod(Optional.empty());
	 } catch (NoSuchElementException e) {
		 System.out.println(e.getMessage());
	 }
  }
 
 private Snack snackMethod(Optional<Snack> optionalSnack) {
 	return optionalSnack.orElseThrow(() -> new NoSuchElementException("There are no snacks! I know it sucks. . ."));
 
 }
}