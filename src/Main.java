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
    }
}