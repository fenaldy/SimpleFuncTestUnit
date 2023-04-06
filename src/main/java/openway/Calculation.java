package openway;

public class Calculation {
    
    private int inputParameter;
    private int divider;

    public Calculation(){

    }

    public Calculation(int inputParameter, int divider) {
        this.inputParameter = inputParameter;
        this.divider = divider;
    }

    public void setInputParameter(int inputParameter){
        this.inputParameter = inputParameter;
    }

    public void setInputDivider(int divider){
        this.divider = divider;
    }

    public Integer getInputParameter(){
        return inputParameter;
    }

    public Integer getDivider(){
        return divider;
    }

}
