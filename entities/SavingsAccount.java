package entities;

public final class SavingsAccount extends Account2{

    private Double interestRate;

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(){
        super();
    }
    
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    //sobrescrever
    @Override
    public final void withDraw(double amount){
        balance -= amount;
    }

}
