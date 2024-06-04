package chapter17;

import java.util.Scanner;

class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("사각형의 모서리 길이를 입력하십시오:");
        double sideLength = scanner.nextDouble();

        Square square = new Square(sideLength);
        
        System.out.println("변장: " + sideLength);
        System.out.println("면적: " + square.calculateArea());
        System.out.println("둘레: " + square.calculatePerimeter());
    }
}