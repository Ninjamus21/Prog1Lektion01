package opgaver;

import java.util.ArrayList;

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

        // udregn hvad gennemsnitshastighed for miles pr time;

        // formel
        double gennemsnitsfart = (15 / 1.6) / (50.5 / 60);
        System.out.println(gennemsnitsfart);
    }
}
//