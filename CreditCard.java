public class CreditCard {
    private Money Balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Money creditLimit, Person owner) {
        this.creditLimit = new Money(creditLimit);
        this.Balance = new Money(0);
        this.owner = owner;
    }
    public void setBalance(Money balance) {
        this.Balance = balance;
    }
    public void setCreditLimit(Money creditLimit) {
        this.creditLimit = creditLimit;
    }
    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Money getBalance() {
        return new Money (this.Balance);
    }
    public Money getCreditLimit()
    {
        return new Money(this.creditLimit);
    }
    public String getPersonals()
    {
        return owner.toString();
    }
    public void charge(Money amount)
    {
        if(Balance.add(amount).compareTo(creditLimit)==1){
            Money newBalance = this.Balance.add(amount);
            this.Balance = newBalance;
        } else{
            System.out.println("Exceeds credit limit");
        }   
    }
    public void payment(Money amount)
    {
       this.Balance = this.Balance.subtract(amount);
    }   
}