package Lesson9.Homework;

//Вычислите устно output-ы Test1/2/3, а затем проверьте в компиляторе.

public class Test2 {
    int a = 1;
    static int b = 2;
    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
        // 5 2
    }
}
