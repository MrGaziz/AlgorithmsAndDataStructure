package com.company.loop;

//https://leetcode.com/problems/robot-return-to-origin/
//657. Robot Return to Origin
//Should create an variable which sums and subtract of element existence
public class RobotReturnToOrigin {

    public static void main(String[] args) {

        boolean result = judgeCircle("ULL");
        System.out.println(result);
    }

    public static boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int resultLR = 0;
        int resultUD = 0;
        for (char c : chars) {
            if (c == 'R') resultLR+=1;
            if (c == 'L') resultLR+=-1;
            if (c == 'U') resultUD+=2;
            if (c == 'D') resultUD+=-2;
        }

        return resultLR == 0 && resultUD == 0;
    }
}
