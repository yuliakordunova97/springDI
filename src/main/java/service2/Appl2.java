package service2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Appl2 {
    public static void main(String[] args) {
        System.out.println("Enter two numberss:");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        ApplicationContext context =
                new AnnotationConfigApplicationContext("/service2");
        Calculator2 calculator = new Calculator2();

        calculator.calculate(b,c);

    }


}
