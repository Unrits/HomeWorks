package HomeWork_3;

public class HomeWorkApp_3 {

    public static void main(String[] args) {

    }

    public static void Task1(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                data[i] = 1;
            } else {
                data[i] = 0;
            }
            System.out.print(data[i] + " ");
        }

    }
    public static void Task2(int size) {
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
            System.out.print(data[i] + " ");
        }
    }
    public static void Task3(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 6) {
                data[i] = data[i] * 2;
            }
            System.out.print(data[i] + " ");
        }
    }
    public static void Task4() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    data[i][j] = 1;
                }
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Task5(int len, int initialValue){
        int[] data = new int[len];
        for (int i = 0; i < len; i++) {
            data[i] = initialValue;
            System.out.print("[" + i + "]" + data[i] + " ");
        }
    }
    public static void Task6( int[] data){
        int max = data[0];
        int min = data[0];

        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static boolean doTask7 ( int[] data){
        int rSum = 0;
        int lSum = 0;
        for (int i = 0; i < data.length; i++) {
            rSum += data[i];
        }
        for (int i = 0; i < data.length; i++) {
            lSum += data[i];
            if (lSum == rSum - lSum) {
                return true;
            }
        }
        return false;
    }

}


