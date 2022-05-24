package HWCycles;

public class Main1 {
    public static void main(String[] args) {
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
