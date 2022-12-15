import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        //Task №1
        System.out.println(" ");
        System.out.println("Задание №1");
        int monthlyExpenses = 0;
        for (int i : arr) {
            monthlyExpenses += i;
        }
        System.out.println("Сумма трат за месяц составила " + monthlyExpenses + "рублей");

        //Task №2
        System.out.println(" ");
        System.out.println("Задание №2");
        int minimumAmount = arr[0];
        int maximumAmount = arr[0];
        for (int i : arr) {
            if (i < minimumAmount) {
                minimumAmount = i;
            } else if (i > maximumAmount) {
                maximumAmount = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumAmount + " рублей. Максимальная сумма трат за день составила " + maximumAmount + " рублей");

        //Task №3
        System.out.println(" ");
        System.out.println("Задание №3");
        double averageAmount = monthlyExpenses / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        //Task №4
        System.out.println(" ");
        System.out.println("Задание №4");
        char[] reverseFullName = {'h', 'c', 'i', 'v', 'o', 'n', 'a', 'v', 'I', ' ', 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}