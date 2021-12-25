package service1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Calculator {


    @Bean
    public PlusService plusService(){
        PlusService plusService = new PlusService();
        return plusService;
    }

    @Bean
    public MinusService minusService(){
        MinusService minusService = new MinusService();
        return minusService;
    }

    public void calculate(int a, int b){
        if (a > b){
            System.out.println(minusService().minus(a, b));
        }else System.out.println(plusService().sum(a, b));
    }

}
