package oop;

public class Emp {
    int id;
    String name;
    int age;
    double salary;

    public double getAnnSalary(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
