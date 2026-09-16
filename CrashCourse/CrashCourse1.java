import java.util.ArrayList;

public class CrashCourse1 { //class header
 
    public static void main(String[] args) {
        
        // comments 

        /*
        MultiLine comments
        */

        // control forward slash
        // multiple lines
        // to comment

        System.out.print("WASSSAAAAA");
        System.out.println("Hello bello");
        System.out.println("goodmorning");

        //variable declarations:
        //Primitive VARIABLES

        int a; //integer
        double b; //decimal or float
        boolean c; //true or false;

        a = 4;
        b = 5.5;
        c = false; //lowercase

        // Arithmetic Operators
        // + - / *
        // += -= /= %=

        int d = 3;
        d += 7;

        System.out.println("d = " + d);

        // increment and decrement by one:
        // -- ++
        d--;
        d++;
        d++;
        System.out.println("d NOW = " + d);

        //Comparisons (always returns True or False)

        //  < >  <=  >=  ==  !=
        System.out.println(4 < 5);
        System.out.println(7 == 4);
        System.out.println(1 != 2);

        // LOGICAL OPERATORS
        // Order of precedence: NOT: !  AND: &&  OR: ||

        boolean f = false; boolean t = true;

        // Predict output: True or False?
        System.out.println(!f); //true
        System.out.println(f && t); //false
        System.out.println(f || t); //true
        System.out.println(f || t && !f); //true

        System.out.println(f && t); // short circuits to FALSE after checking f && -- java does not need to check t.
        System.out.println(t || (f && t)); //short circuits after checking the first t.

        //CASTING (converting)
        int g = (int)5.5;
        System.out.println(g);
        double h = (double)5/6;
        System.out.println(h);

        //STRINGS
        String s1 = "Goodnight";
        String s2 = " and ";
        String s3 = "Goodbye";
        String result = s1 + s2 + s3;
        result += ", Cowboy.";
        System.out.println(result + "\n");
        
        //ARRAYS
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

        arry1[0] = 11;
        arry1[1] = 2;
        
        System.out.println("Remainder: " + arry1[0] % arry1[1]);

        int[] arry2 = {34,52,3,64,32};
        System.out.println("arry2: " + arry2);

        //2D arrays (grid or a table)

        int[][] arryGrid1 = new int[4][3];
        // 0 0 0
        // 0 0 0
        // 0 0 0
        // 0 0 0

        System.out.println("Rows: " + arryGrid1.length);
        System.out.println("Columns: " + arryGrid1[0].length);

        int[][] arryGrid2 = { {7,8,9}, 
                              {4,5,6}, 
                              {1,2,3} };
        
        System.out.println(arryGrid2[0][1]); //access number 8
        System.out.println(arryGrid2[2][2]); //access number 3

        System.out.println(arryGrid2);

        //ARRAYLISTS
        // Can be any size. Lots of built in fucntions to help.
        // Avoid primitive data types. Special classes for Integer, Double, Boolean, String. Called "wrapper classes"

        ArrayList<String> arryLst = new ArrayList<>();

        arryLst.add("Word 1");
        arryLst.add("Word 2");
        arryLst.add("Word 3");
        arryLst.remove(0);
        arryLst.add(0,"Word 4");
        arryLst.set(2, "Word 5");

        System.out.println(arryLst);
        System.out.println(arryLst.size());
        System.out.println(arryLst.get(2));


        // Math class
        Math.max(5,9); // max value -> returns 9
        Math.min(7,3); // min value -> returns 3
        Math.sqrt(14); // square root
        Math.abs(-68); // absolute value

        // CONDITIONALS

        // if   else if    else
        
        boolean tru = true; boolean fal = false;

        if(fal) {
        System.out.println("reached first condition");
        }  else if (!fal) {
        System.out.println("reached second condition");
        }
        else {
            System.out.println("Reached else");
        }

        int x = 5;
        while (x<10) {
            System.out.println(x + " ");
            x++;
        }

        System.out.println();

        // for loop
        // initialize variable for an index; conditional; increment; decrement
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // enhanced for loop (only for reading values)
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Sheep");
        animals.add("Deer");
        animals.add("Moose");
        System.out.println("ArrayList: " + animals);

        for (String s : animals) {
          System.out.println("we saw" + s);
        }

        // printing values of an array with iteration

        double[] arry = {5.1,2.2,5.3,3.4,8.5};
        System.out.println("Memory address: " + arry);

        for (int i =  0; i <  arry.length; i++) {
            System.out.println(arry[3]);
        }

        int[][] arryMatrix = {  {0,32,12}, {7,13,22}, {6,77,100},};
        System.out.print(arryMatrix + "");

        for(int row = 0; row <arryMatrix.length; row ++) {
            for(int col = 0; col < arryMatrix[row].length;col++) {
                System.out.print(arryMatrix[row][col] + " ");
            }
        System.out.println();
        }

    }
}