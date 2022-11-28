package com.company.recursion;

public class RecursionExample {

    public static void main(String[] args) {
//        System.out.println(f(0));
//        f(5, "");

        System.out.println(2%2);
        System.out.println(5%2);
        System.out.println(5/2);
    }

    static int[] a = {1, 2, 3, 4, 5, 6};

    public static int f(int position) {

        if (position == a.length) {
            return 0;
        }

        return a[position] + f(position + 1);
    }

    static void f(final int N, String currentString /* State */) {
        /* Base or terminating case */
        /* If we already built the string of length N, just print it. */
        if (currentString.length() == N) {
            System.out.println(currentString);
            return;
        }

        /* Operations on state, and possible calls to f() function again */
        /* We are still building the string, so let's try adding 'A', 'B', and 'C' to it. */
        f(N, currentString + "G");
        f(N, currentString + "A");
        f(N, currentString + "Z");
        f(N, currentString + "I");
        f(N, currentString + "Z");
    }

}
