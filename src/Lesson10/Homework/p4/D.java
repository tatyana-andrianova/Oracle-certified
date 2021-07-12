package Lesson10.Homework.p4;

import Lesson10.Homework.p1.A;
import Lesson10.Homework.p1.p2.B;
import Lesson10.Homework.p1.p2.p3.C;
import Lesson10.Homework.p4.p5.*;

import static Lesson10.Homework.p1.p2.B.*;


/*Внутри класса D напишите код, который будет задействовать любые элементы классов A, C, E,
а также static элементы класса B. Используя выражения import и import static, работайте с не полными именами классов.*/

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.str1);

        B b = new B();
        b.showBoolean();

        C c = new C();
        c.showMessage();

        E e = new E();
        System.out.println(e.xyz);

        System.out.println(b1);
    }
}
