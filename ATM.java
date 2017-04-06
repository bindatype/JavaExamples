class ATM
{

  ATM()
  {
    savings_balance = 0.;
    checking_balance = 0.;
  }  

  ATM(double init_savings,double init_checking)
  {
    savings_balance = init_savings;
    checking_balance = init_checking;
  }

  /**
  Has a checking balance.
  Has a saving balance.
  */

  private double savings_balance ;
  private double checking_balance ;

  public double getCheckingBalance(){
    return checking_balance;
  }

  public double getSavingsBalance(){
    return savings_balance;
  }

  public void withdrawFromSavings(double amount)
  {
    if ( this.getSavingsBalance() >= Math.abs(amount)) {
      this.setSavingsBalance(getSavingsBalance() - Math.abs(amount));
    } else {
      /** Error Condition, balance exceeded */
    }
  }

  public void withdrawFromChecking(double amount)
  {
      if ( this.getCheckingBalance() >= Math.abs(amount)) {
      this.setCheckingBalance(getCheckingBalance() - Math.abs(amount)); 
    } else {
      /** Error Condition, balance exceeded */
    }

  }

  public void depositToSavings(double amount)
  {
    this.setSavingsBalance(getSavingsBalance() + Math.abs(amount));
  }

  public void depositToChecking(double amount)
  {
    this.setCheckingBalance(getCheckingBalance() + Math.abs(amount));
  }

  private void setCheckingBalance(double amount){
    checking_balance = amount;
  }

  private void setSavingsBalance(double amount){
    savings_balance = amount;
  }

  public void transferFromCheckingToSavings( double amount ){
    if ( this.getCheckingBalance() >= Math.abs(amount)) {
      this.setCheckingBalance(getCheckingBalance() - Math.abs(amount));
      this.setSavingsBalance(getSavingsBalance() + Math.abs(amount));
    } else {
      /** Error Condition, balance exceeded */
    }

  }

  public void transferFromSavingsToChecking( double amount ){
    if ( this.getSavingsBalance() >= Math.abs(amount)) {
      this.setCheckingBalance(getCheckingBalance() + Math.abs(amount));
      this.setSavingsBalance(getSavingsBalance() - Math.abs(amount));
    } else {
      /** Error Condition, balance exceeded */
    }

  }
}
