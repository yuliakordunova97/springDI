package service1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

public class Appl1 {

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ApplicationContext context =
                new AnnotationConfigApplicationContext("/service1");
        Calculator calculator = new Calculator();

        calculator.calculate(a,b);


    }
}