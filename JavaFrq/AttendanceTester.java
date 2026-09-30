package JavaFrq;
// Class that represents a student’s attendance record
class AttendanceRecord {
   private String name;
   private int daysPresent;
 
   public AttendanceRecord(String n, int d) {
      name = n;
      daysPresent = d;
   }
 
   public void markPresent() {
      daysPresent++;
   }
 
   public void printAttendance() {
      System.out.println(name + " — Days Present: " + daysPresent);
   }
}
// Tester class that updates attendance
public class AttendanceTester {
   public static void main(String[] args) {
      // write code to create two AttendanceRecord objects:
      // one named "Jordan" with 4 days present
      // one named "Riley" with 7 days present
 	AttendanceRecord jordan = new AttendanceRecord("Jordan", 4);
   AttendanceRecord riley = new AttendanceRecord("Riley", 7);
      // mark Jordan present once more
 	jordan.markPresent();
      // print attendance for both students
	jordan.printAttendance();
	riley.printAttendance();
   }
}