package java1;

public class Main {

    public static int math (int a, int b, int c, int d) {
         int result = a * (b + (c / d));
        return result;
    }
    public static void main(String[] args) {
	    math(2,3,4,5);
        System.out.println("math = " + math(2,3,4,5));
    }
}
