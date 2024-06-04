package chapter17;

import java.util.Scanner;

class Shape {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.print("반지름을 입력하십시오：");
        double radius = input.nextDouble();
        circle.setRadius(radius);

        input.nextLine(); // Consume the newline character

        System.out.print("색상을 입력하십시오：");
        String color = input.nextLine();
        circle.setColor(color);

        System.out.println("원의 반지름：" + circle.getRadius());
        System.out.println("원의 색상：" + circle.getColor());
        System.out.println("원의 면적：" + circle.calculateArea());
        System.out.println("원의 둘레：" + circle.calculatePerimeter());

        input.close();
    }
}