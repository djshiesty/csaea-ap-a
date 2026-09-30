package JavaFrq;

class Movie {
   // declare instance variables here
 	private String title;
   private int rating;
   // write the constructor here
 	public Movie(String t, int r) {
		title = t;
		rating = r;
}
   public void printInfo() {
      System.out.println(title + " — Rating: " + rating);
   }
}
public class MovieTester {
   public static void main(String[] args) {
      Movie one = new Movie("Inception", 9);
      Movie two = new Movie("Interstellar", 8);
      Movie three = new Movie("Tenet", 7);
      one.printInfo();
      two.printInfo();
      three.printInfo();
   }
}