package service3;

import org.apache.naming.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Appl3 {
    public static void main(String[] args) {
        System.out.println("Enter two numberss:");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean-factory.xml");

        Calculator3 calculator3 = context.getBean("calculator3", Calculator3.class);
        calculator3.calculate(k, n);

    }
}
