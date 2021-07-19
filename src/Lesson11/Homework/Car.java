package Lesson11.Homework;

/*Создайте класс Cat с тремя переменными; цвет, мотор и количество дверей. Затем создайте класс CarTest, в котором должны быть 2 метода.
1-ый изменяет количество дверей объекта класса Car на количество, прописанное в параметре метода.
2-ой принимает в параметры 2 объекта класса Car и меняет их цвета местами. Примените оба метода в main и выведите на экран атрибуты всех объектов.*/

public class Car {
        String color;
        String engine;
        int doors;
}

class CarTest {

    public int changeDoors(int doors) {
        this.doors = doors;
        return doors++;
    }

    public int  changeColor() {
        Car car1 = new Car("blue");
        Car car2 = new Car("red");
        return changeColor();
    }

    public static void main(String[] args) {

    }
}


