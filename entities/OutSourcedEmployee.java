package entities;

public class OutSourcedEmployee extends Employee2 {
    private double additionalCharge;

    public OutSourcedEmployee(){
        super();
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }

}
