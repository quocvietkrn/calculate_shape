package view;

import java.util.Scanner;

import controller.Manage;
import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
    Triangle triangle = new Triangle();
       System.out.println("----Enter your choice ----");
       System.out.println("1. circle");
       System.out.println("2. rectangle");
       System.out.println("3. triangle");
      
       Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
       switch (choice) {
        case 1:
            manage.inputCircle(circle);
            break;
        case 2:
            manage.inputRectangle(rectangle);
            break;
            case 3:
            manage.inputTriangle(triangle);
            break;
        default:
            break;
       }
    }
}

