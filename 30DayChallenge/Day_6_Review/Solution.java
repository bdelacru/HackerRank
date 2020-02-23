import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //String myString = scanner.next();
        StringBuilder str = new StringBuilder();
        StringBuilder oddStr = new StringBuilder();
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int j = 0; j < N; j++) {
            String myString = scanner.nextLine();
            for (int i = 0; i < myString.length(); i++) {
                if (i % 2 == 0) {
                    str.append(myString.charAt(i));

                } else {
                    oddStr.append(myString.charAt(i));
                }
            }
            System.out.print(str + " " + oddStr);
            System.out.println();
        }
        scanner.close();
    }
}

