package bank;

public class FixedDepositAccount extends BankAccount{
    private float interest;
    private int duration;

    // Constructor
    public FixedDepositAccount(String name, float balance){
        this(name, balance, 3);
    }
    
    public FixedDepositAccount(String name, float balance, float interest){
        this(name, balance, interest, 6);
    }

    public FixedDepositAccount(String name, float balance, float interest, int duration){
        super(name,balance);
        this.interest =interest;
        this.duration = duration;
    }

    // Getter
    public float getInterest() {
        return interest;
    }

    public int getDuration() {
        return duration;
    }

    // Methods
    @Override
    public float getBalance(){
        return super.getBalance()*(100+interest)/100;
    }

    @Override
    public void setBalance(float amount){
        System.out.println("Balance cannot be changed");
    }

    @Override
    public void deposit(float amount){
        System.out.println("No deposits may be made to fixed deposit account");
    }


    @Override
    public void withdraw(float amount){
        System.out.println("No withdrawals may be made from fixed deposit account");
    }
}
