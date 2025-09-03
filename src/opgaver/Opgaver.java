package opgaver;

import java.util.ArrayList;
import java.util.Scanner;

public class Opgaver {
    public static void main(String[] args) {
        //opgave2();
        //opgave3();
        //opgave3_1();
        //opgave4();
        //opgave5();
        //opgave6();
        //opgave7();
        //opgave8();
        //BrugAfNumericTypeConversions();
        //Opgave9();
        //System.out.println("Sum from 1 to 10 is " + sum(1, 10));
        //System.out.println("Sum from 20 to 37 is " + sum(20, 37));
        //System.out.println("Sum from 35 to 49 is " + sum(35, 49));
        int n = 100_000_0; // number of concatenations
        runTests(n);
    }

    static void opgave2() {
        System.out.println("Hello World!");
    }

    static void opgave3() {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void opgave3_1() {

        ArrayList<Integer> numbers = new ArrayList<>();
        int n1 = 0;
        for (int i = 1; i <= 10; ++i) {
            n1++;
            numbers.add(n1);
            System.out.println(n1);
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Summen er " + sum);


    }

    static void opgave4() {
        System.out.println(
                "*     *  *******   *****    *****   *           *     *******           *\n" +
                        "**    *     *     *     *  *     *  *          * *       *        *      *\n" +
                        "* *   *     *     *        *     *  *         *   *      *                *\n" +
                        "*  *  *     *     *        *     *  *        *******     *                 *\n" +
                        "*   * *     *     *        *     *  *        *     *     *        *       *\n" +
                        "*    **     *     *     *  *     *  *        *     *     *               *\n" +
                        "*     *  *******   *****    *****   *******  *     *  *******           * "
        );
    }

    static void opgave5() {
        System.out.println(
                "///////////\n" +
                        "|__    __|\n" +
                        "| **  ** |\n" +
                        "|    *   |\n" +
                        "| _____/ |\n" +
                        "|        |\n" +
                        "|********|\n"
        );
    }

    static void opgave5_1() {
        System.out.println(
                "/\\____/\\ \n" +
                        "|        | \n" +
                        "|  '   ' | \n" +
                        "|     *  | \n" +
                        "|  ^-_-^ | \n" +
                        "|        | \n" +
                        "(_________) \n"

        );
    }

    static void opgave6() {
        System.out.println((4 * 1.0) - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
    }

    static void opgave7() {
        double areal = (2 * 6.5 * Math.PI);
        double omkreds = (6.5 * 6.5 * Math.PI);

        System.out.println("arealet er " + areal);
        System.out.println("omkreds er " + omkreds);

    }

    static void opgave8() {
        // afstand 15 kilometer
        // tid 50,5 minutter
        Scanner input = new Scanner(System.in);
        // udregn hvad gennemsnitshastighed for miles pr time;

        // formel
        System.out.println("hvor mange kilometer?");
        double kilometer = input.nextDouble();
        double gennemsnitsfart = (kilometer / 1.6) / (50.5 / 60);
        System.out.println(gennemsnitsfart + "Mph");
    }

    static void BrugAfNumericTypeConversions() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
    }

    static void Opgave9() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int Number1 = (int) (Math.random() * 10);
            int Number2 = (int) (Math.random() * 10);

            if (Number1 < Number2) {
                // eksempel
                // 0 // 7 // 5
                // 7 // 7 // 5
                // 7 // 5 // 5
                // 7 // ""5"" // ""7""
                int HolderNumber = Number1;
                Number1 = Number2;
                Number2 = HolderNumber;
            }
            System.out.println("Hvad er " + Number1 + " - " + Number2 + "?");
            int answer = input.nextInt();

            if (Number1 - Number2 == answer) {
                System.out.println("Helt rigtigt, Good Boy!");
            } else {
                System.out.println("Nah buddy try again?");
                System.out.println(Number1 + " - " + Number2 + " skulle være " + (Number1 - Number2));
                break;
            }
        }
        input.close();
    }

    public static int sum(int i1, int i2){
        int result = 0;
        for (int i = i1; i <= i2; i++){
            result += i;
            System.out.println(result);
        }
        return result;
    }

    public static void runTests(int n) {
        long stringTime = testString(n);
        long stringBuilderTime = testStringBuilder(n);

        System.out.println("Time using String: " + stringTime + " ms");
        System.out.println("Time using StringBuilder: " + stringBuilderTime + " ms");
    }

    // Method to test String concatenation
    public static long testString(int n) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Method to test StringBuilder concatenation
    public static long testStringBuilder(int n) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}




//