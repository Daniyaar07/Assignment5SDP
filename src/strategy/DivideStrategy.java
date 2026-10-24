package strategy;

public class DivideStrategy implements OperationStrategy{
    public double execute(double a , double b){
        if (b==0){
            throw new IllegalArgumentException(("Can't divide by zero"));
        }
        return a / b;
    }
}
