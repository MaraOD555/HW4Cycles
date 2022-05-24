public class Main {
    public static void main(String[] args) {
        //Задание 1
        //Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        //Задание 2
        //Нам нужно написать программу, которая считает дни месяца по датам,
        //определяет, какой день пятница, и выводит сообщение с напоминанием
        //о том, что нужно подготовить еженедельный отчет.
        //Пятница отчетный день.

        for (int dayNumber = 6; dayNumber <= 31; dayNumber = dayNumber + 7) {
            System.out.println("Сегодня пятница " + dayNumber + " число. Необходимо подготовить отчет");
        }
        System.out.println();
        //Задание 3
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
        //а также следующий год ее появления.

        int year1 = 2100;
        int yearForComet = 0;
        for (yearForComet = 0; yearForComet <= year1; yearForComet = yearForComet + 79) {
            if (yearForComet >= 1800) {
                System.out.println(yearForComet);

            }
        }
    }

}