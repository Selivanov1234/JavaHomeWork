package java1;

public class Main {
  // public static int excess (int a, int b) {
  //     int res = a/b;
  //     int c = a - (res * b);
  //     System.out.println(c);
  //     return c;
  //  }
   public static void leapYear (int year) {
       if (year % 400 == 0){
           System.out.println("Високосный год!");
       }else if ((year % 100 == 0) && (year % 4 == 0)) {
           System.out.println("Обычный год!");
       }else if (year % 4 ==0) {
           System.out.println("Високосный год!");
       }else System.out.println("Обычный год!");
   }

    public static void main(String[] args) {
        leapYear(356);
        //excess(300,4);
    }
}
