public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            total = total + total / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 1; i < 11; i++) {
            int a = 2 * i;
            System.out.println("2 * " + i + " = " + a);
        }
    }

    public static void task11() {
        System.out.println("Задача 11");
        int salary = 15000;
        int total = 0;
        int a = 0;
        while (total < 2_459_000) {
            total = total + salary;
            total = total + total / 100;
            a = a + 1;
            System.out.println("Месяц " + a + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task12() {
        System.out.println("Задача 12");
        int a = 1;
        while (a < 11) {
            System.out.print(" " + a + " ");
            a = a + 1;
        }
        System.out.println();
        for (int s = 10; s > 0; s--) {
            System.out.print(" " + s + " ");
        }
    }

    public static void task13() {
        System.out.println();
        System.out.println("Задача 13");
        int naselenie = 12000000;
        int PokazRozhd = 17;
        int PokazSmer = 8;
        int a = PokazRozhd - PokazSmer;
        for (int i = 1; i <= 10; i++) {
            naselenie += naselenie * a / 1000;
            System.out.println("Год " + i + " численность населения составляет " + naselenie);
        }
    }

    public static void task14() {
        System.out.println("Задача 14");
        int salary = 15000;
        int total = 0;
        int a = 0;
        while (total < 12_000_000) {
            total = total + salary;
            total = total + total / 100 * 7;
            a = a + 1;
            System.out.println("Месяц " + a + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task15() {
        System.out.println("Задача 15");
        int salary = 15000;
        int total = 0;
        int a = 0;
        while (total < 12_000_000) {
            total = total + salary;
            total = total + total / 100 * 7;
            a = a + 1;
            if (a % 6 == 0) {
                System.out.println("Месяц " + a + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task16() {
        System.out.println("Задача 16");
        int salary = 15000;
        int total = 0;
        for (int i = 1; i <= 108; i++) {
            total = total + salary;
            total = total + total / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task17() {
        System.out.println("Задача 17");
        for (int a = 0; a <= 31; a++) {
            if (a % 7 == 5)
                System.out.println("Сегодня пятница " + a + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task18() {
        System.out.println("Задача 18");
        int i = 0;
        do {i+=79;}
        while (i<1823);
        while (i<=2123) {
                System.out.println(i);
                i+=79;
            }
        }
    }
