package romanWithTreeMap;

import java.util.Scanner;

public class testRomanConversion {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Give us an integer between 1 and 4000: ");

        String roman = RomanNumber.toRoman(number.nextInt());
        System.out.println(roman);
    }
}