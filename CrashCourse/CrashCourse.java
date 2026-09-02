public class CrashCourse { //class header
 
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

        boolean e = false; boolean f =  true;

        // Predict output: True or False?
        System.out.println(!e); //true
        System.out.println(e && f); //false
        System.out.println(e || f); //true
        boolean qqq = e&&f;
        System.out.println(e || f && !e); //true

        System.out.println("this is:" + qqq); //short circuits after checking e: Java does not need to check f if e is already False

    }


}
