package Lesson7;

//Урок 7 - Понятие «package». Модификаторы видимости (access modifiers)

public class Lesson_7_Package_Access_Modifiers {
    double id;
    public String surname;
    int age;
    private int salary;
    int department;

    public void getId(){
        System.out.println("ID = " + id);
    }
    public void getSurname(){
        System.out.println("SURNAME = " + surname);
    }
    public void getSalary(){
        System.out.println("SALARY = " + salary);
    }

    public Lesson_7_Package_Access_Modifiers(String surname){
        this.surname = surname;
    }
    Lesson_7_Package_Access_Modifiers(double id){
        this.id = id;
    }
    private Lesson_7_Package_Access_Modifiers(int salary){
        this.salary = salary;
    }
}

class Employee2 {
    public static void main(String[] args) {
        Lesson_7_Package_Access_Modifiers employee2 = new Lesson_7_Package_Access_Modifiers(34.4);
        System.out.println(employee2.id);
    }
}
