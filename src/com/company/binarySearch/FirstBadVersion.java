package com.company.binarySearch;

//https://leetcode.com/problems/first-bad-version/discuss/2575109/Java-or-4-lines-code-or-Log(n)-time-or-space-O(1)-or-Binary-Search
//https://leetcode.com/problems/first-bad-version/
//278. First Bad Version
public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        int l = 1;
        int r = n;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    static boolean isBadVersion(int n) {
        return (n == 4 || n == 5) ? true : false;
    }
}
