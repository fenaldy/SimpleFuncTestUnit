package openway;

public class CalculationLogic extends Calculation {

    private Double result;

    public CalculationLogic(){

    }

    public CalculationLogic(int inputParameter, int divider){
        super(inputParameter, divider);
    }

    public Double Calculating(){
        result = (getDivider().doubleValue() / getInputParameter().doubleValue());
        return result;
    }
    
}
