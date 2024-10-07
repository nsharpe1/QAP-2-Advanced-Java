public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person(String lastName, String firstName, Address home)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }
    public String getlastName()
    {
        return lastName;
    }
    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public Address getHome()
    {
        return home;
    }
    public void setHome(Address home)
    {
        this.home = home;
    }
    public String toString()
    {
        return (this.firstName + " " + this.lastName + "," + this.home);
    };
}
