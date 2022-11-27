public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("--- Задание 1 ---");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // Разделитель
        System.out.println();

        // Задание 2
        System.out.println("--- Задание 2 ---");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        // Разделитель
        System.out.println();

        // Задание 3
        System.out.println("--- Задание 3 ---");
        for (int i = 0; i <= 17; i++){
            if (i % 2 == 0)
                System.out.println(i);
        }

        // Разделитель
        System.out.println();

        // Задание 4
        System.out.println("--- Задание 4 ---");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        // Разделитель
        System.out.println();

        // Задание 2.1
        System.out.println("--- Задание 2.1 ---");
        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосным");
        }

        // Разделитель
        System.out.println();

        // Задание 2.2
        System.out.println("--- Задание 2.2 ---");
        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }

        // Разделитель
        System.out.println();

        // Задание 2.3
        System.out.println("--- Задание 2.3 ---");
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }

        // Разделитель
        System.out.println();

        // Задание 3.1
        System.out.println("--- Задание 3.1 ---");
        int deposit = 29_000;
        int amount = 0;

        for (int i = 1; i <= 12; i++){
            amount += deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + amount + " рублей");
        }

        // Разделитель
        System.out.println();

        // Задание 3.2
        System.out.println("--- Задание 3.2 ---");

        float depositPercentage = 12.0f;

        // Обнуляем сумму вклада
        amount = 0;

        for (int i = 1; i <= 12; i++){
            amount += deposit + (amount * (depositPercentage / 2) / 100);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + amount + " рублей");
        }
    }
}