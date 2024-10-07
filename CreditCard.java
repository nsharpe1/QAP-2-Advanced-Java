public class CreditCard {
    private Money Balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Money creditLimit, Person owner) {
        this.creditLimit = creditLimit;
        this.owner = owner;
    }
    public void setBalance(Money balance) {
        Balance = balance;
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
        return Balance;
    }
    public Money getCreditLimit()
    {
        return creditLimit;
    }
    public String getPersonals()
    {
        return owner.toString();
    }
    public void charge(Money amount)
    {
        this.creditLimit.subtract(amount);
        this.Balance.add(amount);
    }
    public void payment(Money amount)
    {
        this.creditLimit.add(amount);
        this.Balance.subtract(amount);
    }   
}