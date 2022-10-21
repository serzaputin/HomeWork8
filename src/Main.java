public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ8");

        System.out.println("Задание 1");

        int monthNumber = 1;
        int sum = 0;
        while (sum < 2_459_000) {
            sum += 15_000;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей \n", monthNumber, sum);
            monthNumber++;
        }
        System.out.println("Задание 2");

        int num = 1;
        while (num <= 10) {
            if (num == 10) {
                System.out.println(num);
                break;
            }
            System.out.print(num + " ");
            num++;
        }
        for (; num > 0; num--) {
            if (num == 1) {
                System.out.println(num);
                break;
            }
            System.out.print(num + " ");
        }
        System.out.println("задание 3");

        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deadRate = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population += birthRate;
            population -= deadRate;
            System.out.printf("Год %d , численность %d \n", i, population);
        }
        System.out.println("Задание 4");

        int sum1 = 15000;
        int monthNum = 1;
        while (sum1 <= 12_000_000) {
            sum1 *= 1.07;
            System.out.printf("Месяц %d , сумма %d \n", monthNum, sum1);
            monthNum++;
        }
        System.out.println("Задание 5");

        int sum2 = 15000;
        int monthNum1 = 1;
        while (sum2 <= 12_000_000) {
            sum2 *= 1.07;
            if (monthNum1 % 6 == 0) {
                System.out.printf("Месяц %d , сумма %d \n", monthNum1, sum2);
            }
            monthNum1++;

        }
        System.out.println("Задание 6");

        int sum3 = 15000;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = sum3;
            sum3 *= 1 + 0.07 * 6;
            System.out.printf("Месяц %d , сумма %d \n", i, sum3 - sumBefore);
        }
        System.out.println("Задание 7");

        int firstFriday = 5;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-ое число. " + "Необходимо подготовить отчет.");
        }
        System.out.println("Задание 8");

        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i < ending; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }

        }
        System.out.println("Задание 9");

        for (int i = 1; i < 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);

        }
    }
}