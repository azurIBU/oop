package w4;


import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void printDepartment(List<Person> persons) {
        for(Person person : persons) {
            System.out.println(person);
        }
    }


    public static void main(String[] args) {
        Circle circle = new Circle("white", FillType.FILLED, 20);
        Rectangle rectangle = new Rectangle("black", FillType.NOT_FILLED, 20, 20);

        circle.displayInfo();
        System.out.println();
        rectangle.displayInfo();
    }


}

