package bankbeans;
public class Bank {
    private long acct_no;
    private String Name;
    private double withdraw;
    private final double balance=10000;
      public void setAcc(long a) {
        this.acct_no = a;
    }
    public long getAcc() {
        return acct_no;
    }
  public void setName(String n) {
        this.Name= n;
    }
    public String getName() {
        return Name;
    }
      public void setWithdraw(double w) {
        this.withdraw = w;
    }
    public double getA() {
        return withdraw;
    }
    public double withdrawal(double w)
    {
        double rem=0.0;
        if(w<=balance)
            rem = balance - w;
        else
            rem = balance;
        return rem;
    }
}
