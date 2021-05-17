package com.company;

import java.util.Scanner;

class SimpleDotComTestDrive {

     static int[] locationCells = new int[3];
     static int numOfHits = 0;

    public static void main(String[] args) {
        test();

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (!"Sink".equals(checkYourself(in.next())));
    }

    private static void test() {

        // check for hit
        SimpleDotComTestDrive dot1 = new SimpleDotComTestDrive();
        int[] location = {2,3,4};
        dot1.setLocationCells(location);
        String userGuess = "2";
        String result = dot1.checkYourself(userGuess);
        String testResult = "Fail";
        if(result.equals("Hit")) {
            testResult = "Passed";
        }
        System.out.println(testResult);

        // check for sink
        SimpleDotComTestDrive dot2 = new SimpleDotComTestDrive();
        int[] location2 = {2,3,4};
        dot2.setLocationCells(location2);
        dot2.checkYourself("2");
        dot2.checkYourself("3");
        String result2 = dot2.checkYourself("4");
        String testResult2 = "Fail";
        if(result2.equals("Sink")) {
            testResult2 = "Passed";
        }
        System.out.println(testResult2);

        // check for miss
        SimpleDotComTestDrive dot3 = new SimpleDotComTestDrive();
        int[] location3 = {2,3,4};
        dot3.setLocationCells(location3);
        String userGuess3 = "1";
        String result3 = dot3.checkYourself(userGuess3);
        String testResult3 = "Fail";
        if(result3.equals("By")) {
            testResult3 = "Passed";
        }
        System.out.println(testResult3);

        SimpleDotComTestDrive dot4 = new SimpleDotComTestDrive();
        int[] location4 = {2,3,4};
        dot4.setLocationCells(location4);
        String userGuess4 = "2";
        dot4.checkYourself(userGuess4);
        dot4.checkYourself(userGuess4);
        String result4 = dot4.checkYourself(userGuess4);
        String testResult4 = "Fail";
        if(result4.equals("Hit")) {
            testResult4 = "Passed";
        }
        System.out.println(testResult4);
    }

    public static String checkYourself(String stingGuess) {
        int guess = Integer.parseInt(stingGuess);
        String result = "By";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits >= locationCells.length) {
            result = "Sink";
        }
//        System.out.println(result);
        return result;
    }

    void setLocationCells(int[] cellLocations) {
        locationCells = cellLocations;
    }
}
