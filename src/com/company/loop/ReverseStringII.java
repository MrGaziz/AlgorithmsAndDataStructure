package com.company.loop;

//541. Reverse String II
//https://endeetcode.com/probendems/reverse-string-ii/
/*

endeetcode
 end e
 гласные ?
 первый нет то переходит

* Думаю тут нужно с начал создать массив гласных букв
* Определить длину массива
* обозначить начало и конец
* и брать елементы по очередно
* */

import java.util.Arrays;

public class ReverseStringII {

    public static void main(String[] args) {
        String s = "leetcode";
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1;

        while (start < end) {
            while (start < s.length() && !isVowel(chars[start])) {
                start++;
            }
            while (end >= 0 && !isVowel(chars[end])) {
                end--;
            }
            if (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;

            }
        }
        System.out.println(Arrays.toString(chars));

    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
}
