package JavaFrq;
// Class that represents one student
class Student {
   // declare instance variables here
 	private String name;
	private int grade;
   // write the constructor here
 	public Student(String n, int g) {
		name = n;
		grade = g;
	}
   public void printInfo() {
      System.out.println(name + " — Grade " + grade);
   }
}
// Tester class that creates and displays students
public class StudentTester {
   public static void main(String[] args) {
      Student one = new Student("Jordan", 9);
      Student two = new Student("Taylor", 10);
      Student three = new Student("Morgan", 11);
 
      one.printInfo();
      two.printInfo();
      three.printInfo();
   }
}