package service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import service1.Calculator;

@Component
@Service
public class Calculator2 {
    private MinusService2 minusService2;
    private PlusService2 plusService2;

    public Calculator2(){
         minusService2 = new MinusService2();
         plusService2 = new PlusService2();
    }

    @Autowired
    public void setMinusService2(MinusService2 minusService2) {
        this.minusService2 = minusService2;
    }

    @Autowired
    public void setPlusService2(PlusService2 plusService2) {
        this.plusService2 = plusService2;
    }
    public void calculate(int a, int b){
        if (a > b){
            System.out.println(minusService2.minus(a,b));
        }else System.out.println(plusService2.sum(a, b));
    }

    public MinusService2 getMinusService2() {
        return minusService2;
    }

    public PlusService2 getPlusService2() {
        return plusService2;
    }
}
