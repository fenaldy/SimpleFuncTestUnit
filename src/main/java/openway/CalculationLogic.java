package openway;

public class CalculationLogic extends Calculation {

    private Double result;

    public CalculationLogic(){

    }

    //set parameter and divider
    public CalculationLogic(int inputParameter, int divider){
        super(inputParameter, divider);
    }

    //main logic of calculation function
    public Double Calculating(){
        result = (getDivider().doubleValue() / getInputParameter().doubleValue());
        return result;
    }
    
}
