package HomeWork_2;

public class HomeWorkApp_2 {

    public static boolean task1 (int a, int b){
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return false;
        }else  return false;

    }
    public static void task2 (int a) {
        if (a >= 0) {
            System.out.println("Положитльное");
        }else {
            System.out.println("Число" + a + "Отрицательное");
        }




    }
    public static boolean task3 (int a) {
        if (a < 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("end");

    }
    public static void task5 (int year) {
        if (year % 4 == 0 && ((year % 100 != 0) || year % 400 == 0)){
            System.out.println(year + "год високосный");
        } else {
            System.out.println(year + "год високосный");
        }
    }
}
