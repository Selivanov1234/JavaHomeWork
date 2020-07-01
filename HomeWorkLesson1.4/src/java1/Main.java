package java1;

public class Main {
    public static boolean bool (int a,int b) {
        int sum = a+b;
        if ((10 <= sum) && (sum <= 20)) {
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        System.out.println(bool(5,2));
    }
}
