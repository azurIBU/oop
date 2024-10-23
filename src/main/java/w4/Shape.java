package w4;

enum FillType {
    FILLED,
    NOT_FILLED
}


class Shape {
private String color;
private FillType filled;

public Shape(String color, FillType filled) {
    this.color = color;
    this.filled = filled;
}

    public String getColor() {
        return color;
    }

    public FillType getFilled() {
        return filled;
    }

    public void displayInfo() {
    System.out.print(this.color + ' ');
    if (this.filled == FillType.FILLED) {
        System.out.print("Filled");
    } else {
        System.out.print("Not Filled");
    }
}

}

class Circle extends Shape {
    private double radius;
    public Circle(String color, FillType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        System.out.print(this.getColor() + ' ');
        if (this.getFilled() == FillType.FILLED) {
            System.out.print("Filled");
        } else {
            System.out.print("Not Filled");
        }
        System.out.print(" " + this.radius);
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    public double calculateCircumference(double PI, double r) {
        return r * 2 * PI;
    }

    public double calculateCircumference(double r) {
        double PI = 3.14;
        return r * 2 * PI;
    }


}

class Rectangle extends Shape {
    private double width;
    private double height;


    public Rectangle(String color, FillType filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void displayInfo() {
        System.out.print(this.getColor() + ' ');
        if (this.getFilled() == FillType.FILLED) {
            System.out.print("Filled");
        } else {
            System.out.print("Not Filled");
        }

        System.out.print(" " + this.width);
        System.out.print(" " + this.height);
        System.out.print(" area: " + this.getArea());

    }
}
