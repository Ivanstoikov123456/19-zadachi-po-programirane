package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*




        7 kyu
        You Can't Code Under Pressure #2
        Java:

        public class Counter {
            private int num = 0;

            public void increment() {
                num++;
            }

            public int check() {
                return num;
            }
        }

        ////////////////////////////////////

        7 kyu
        Laxative Shot Roulette
        Java:

        public class Kata {

            public static double getChance(int n, int x, int a) {

                double prob = 1;
                for(int i = 0; i < a; i++){
                    prob *= (double)(n-x-i) / (n-i);
                }

                return Math.round(prob*100.0)/100.0;
            }
        }

       //////////////////////////////////////////

        7 kyu
        Guess the Sequence
        Java:

import java.util.stream.IntStream;

        class JomoPipi {
            static int[] sequence(int x) {
                return IntStream.rangeClosed(1, x).mapToObj(Integer::toString).sorted().mapToInt(Integer::parseInt).toArray();
            }
        }

      ////////////////////////////////////////////

        7 kyu
        Drying Potatoes
        Java:

        class Potatoes {

            public static int potatoes(int p0, int w0, int p1) {
                return w0 * (100 - p0) / (100 - p1);
            }
        }

       //////////////////////////////////////////////////////////

        7 kyu
        Green Glass Door
        Java:


        public class GreenGlassDoor {

            boolean stepThroughWith(String s) {
                return s.matches(".*(\\w)\\1.*");
            }

        }

      //////////////////////////////////////////////////////////
        7 kyu
        MOD 256 without the MOD operator
        Java:

        public class Kata
        {
            public static int mod256WithoutMod(int number) {
                return number - ((int) number / 256) * 256;
            }
        }

      /////////////////////////////////////////////////////////////



        7 kyu
        Suitcase packing
        Java:

        public class MrSquare {
            public static boolean fit_in(int a, int b, int m, int n) {
                return (a + b) <= Math.max(m, n)
                        && Math.max(a, b) <= Math.min(n, m);
            }
        }

      ///////////////////////////////////////////////////////////

        7 kyu
        Number of Rectangles in a Grid
        Java:


        public class Solution {

            public static int numberOfRectangles(int m, int n) {
                return n*m*(n+1)*(m+1)/4;
            }

        }

       /////////////////////////////////////////////////////////

        7 kyu
                Friends
        Java:

        public class Friends {
            public static int friends(int n) {
                int friend = 0;
                int max = 2;
                while (n > max) {
                    friend++;
                    max *= 2;
                }
                return friend;
            }
        }

       ///////////////////////////////

        7 kyu
        Nth power rules them all!
                Java:

import java.util.Arrays;

        public class Kata {
            public static int modifiedSum(int[] array, int power) {
                return Arrays.stream(array).map(x -> (int)Math.pow(x, power) - x).sum();
            }
        }

       ////////////////////////////////////////

        7 kyu
        Simple Fun #37: House Numbers Sum
        Java:

import static java.util.stream.IntStream.of;

        class Kata {
            static int houseNumbersSum(int[] arr) {
                return of(arr).takeWhile(i -> i > 0).sum();
            }
        }

      //////////////////////////////////////////////////////

        8 kyu
        Subtract the Sum
        Java:

        public class Kata {
            public static String subtractSum (int n) {
                return "apple";
            }
        }

       //////////////////////////////////////////////////

        8 kyu
        Simple Fun #1: Seats in Theater
        Java:

        public class Kata {

            public static int seatsInTheater(int nCols, int nRows, int col, int row) {

                return (nCols-col+1)*(nRows-row);

            }

        }

      ////////////////////////////////////////////////////

        8 kyu
        Circles in Polygons
        Java:

        public class Polygon {

            private final double diameter;

            public Polygon(int sides, int sideLength) {
                this.diameter = sideLength / Math.tan(Math.toRadians(180d/sides));
            }

            public double circleDiameter(){
                return this.diameter;
            }

        }

       ////////////////////////////////////////////////

        8 kyu
        Triple Trouble
        Java:

        public class Kata {
            public static String tripleTrouble(String s1, String s2, String s3) {
                StringBuilder sb = new StringBuilder(s1.length()*3);
                for (int i=0; i<s1.length(); i++) {
                    sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
                }
                return sb.toString();
            }
        }

       ////////////////////////////////////////////////

        8 kyu
        Get Nth Even Number
        Java:

        public class Num {
            public static int nthEven(int n) {
                return (n-1)*2;
            }
        }

       ////////////////////////////////////////////////

        8 kyu
        Count Odd Numbers below n
        Java:

        public class Kata {

            public static int oddCount(int n){

                return n/2;
            }

        }





       ////////////////////////////////////////////////////////////////

        8 kyu
        Area of a Square
        Java:

import java.math.BigDecimal;
        public class Geometry{
            public static double squareArea(double A){

                return new BigDecimal(Math.pow((A*2/Math.PI),2))
                        .setScale(2, BigDecimal.ROUND_DOWN)
                        .doubleValue();
            }
        }
        */





    }
}
