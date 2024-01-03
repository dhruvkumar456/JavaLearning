import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName uses PascalNamingConvention
 * Function/Method, variable name used camelNamingConvention
 *
 * Class is container of methods/functions that groups methods/functions
 * A package is container classes that groups similar/related classes
 */
public class Main {
    public static void main(String[] args) {
        // Focuses on the intelli je autocomplete, it shows about class, interface, methods, field(variable in class/stream),
        // primitive type, reference type, which class belong to which package etc
        System.out.println("Hello World"); // String should be in double braces(" instead of ')

        // PRIMITIVE TYPES
        byte age = 30;
        short x = 10;
        int y = 1000;
        long viewsCount = 3_123_446_23; // For better reading, we can separate using '_'.
        long viewsCounts = 3_123_446_234L; // Editor sees the value as int & value is too long to stored in int,
            // therefore added 'L'(or can put 'l') to make it long type
        float price = 10.99F; // By default, java sees these number as double, therefore to explicitly make it float
            // we need to add 'F'(or can put 'f') to declare it float.
        final float PI = 3.14F; // 'final' will make the value constant throughout the code execution, also create
        // variable in capital letters for final variable
        double p = 10.12543;
        double d = 10 / 3;
        System.out.println(d);
        d = (double) 10 / (double) 3; // defines number as double
        System.out.println(d);
        char letter = 'A'; // character in single quote (') ,string in double quote (")
        boolean isOn = true;

        // REFERENCE TYPES - stores the reference(holds the address where the object is stored)
        String line = "A"; // default 'String' package(java.lang) is automatically imported in this file
        String line2 = new String("Line one,\nLine \"two\""); // Special character can be inserted by adding
            // prefix
        System.out.println(line2);

        Date now = new Date(); // this will import the date package in the top(import java.util.Date)
        System.out.println(now);

        int[] numbers = new int[3]; // Old way of defining array
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println(Arrays.toString(numbers)); // Arrays class will import the required package in the top

        int[] numberTwo = {'1', '2', '1'};
        System.out.println(Arrays.toString(numberTwo));
        /**
         * Difference between PRIMITIVE & REFERENCE types
         *  1. in PRIMITIVE types memory is given & released by java runtime env
         *  2. in REFERENCE types we always allocate the memory using new operator, but released by java runtime automatically
         */


        // CASTING
        // "implicit casting" -> byte > short > int > long > float > double
        short xx = 10; // 2 bytes
        int yy = x + 20; // (short + int) "implicit casting", ie xx(short -> int) will be copied to an int type variable then
            // '+' will be executed between (int + int)

        double xxx = 3.1;
        double yyy = xxx + 2; // (double + int), int(2) -> double(2.0) then '+' will be executed.
        System.out.println(yyy);

        // "explicit casting"
        double xxxx = 10.20;
        int yyyy = (int)xxxx + 1; // (int)xxxx -> Explicit casting, on our own we are converting double to int type
        System.out.println(yyyy);


        // MATH CLASS - in java.lang package
        double z = (int)(Math.random() * 100);
        System.out.println(z);


        // NumberFormat - in java.text, it is used in currency string, percentage string etc
            // NumberFormat currency = new NumberFormat() // cannot use this, it is an abstract class so we cannot create instance of abstract
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // getCurrencyInstance static method will return the instance of NumberFormat
        System.out.println(currency.format(1657.154));

            // Methods Chaining..
        System.out.println(NumberFormat.getCurrencyInstance().format(1669.154));
        System.out.println(NumberFormat.getPercentInstance().format(0.98));

        // Taking input from terminal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); // method channing
        System.out.println("My name: " + name);

    }
}

/**
 * Originally when I created the intellJ project only 2 files were created:
 *      1. src(folder)
 *      2. .gitignore file
 *      3. .idea
 *      4. HelloWorld.iml
 *
 *  When I first run(green icon) the program, there were 5 files/folder gets there:
 *      1. src
 *      2 .gitignore
 *      3. .idea
 *      4. out (Byte code is stored) - intelli je decompiled the bytecode(.class file) & given us source code
 *      5. HelloWorld.iml
 */

/**
 * When we play run(green) icon, 2 things happens:
 *      1. Main.java -> (compiled to bytecode, bytecode is platform independent) -> Main.class
 *      2. Main.class -> (Java virtual machine) -> Native binary code (java Main.class)
 */