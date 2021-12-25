package service3;

public class Calculator3 {
    private PlusService3 plusService3;
    private MinusService3 minusService3;

    public void calculate(int a, int b){
        if (a > b){
            System.out.println(minusService3.minus(a, b));
        }else System.out.println(plusService3.sum(a, b));
    }


    public PlusService3 getPlusService3() {
        return plusService3;
    }

    public void setPlusService3(PlusService3 plusService3) {
        this.plusService3 = plusService3;
    }

    public MinusService3 getMinusService3() {
        return minusService3;
    }

    public void setMinusService3(MinusService3 minusService3) {
        this.minusService3 = minusService3;
    }
}
