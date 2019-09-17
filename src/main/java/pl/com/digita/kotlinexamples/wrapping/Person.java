package pl.com.digita.kotlinexamples.wrapping;

public class Person implements IPerson
{
    private String name;
    private String lastName;

    public Person()
    {
    }

    public Person(Person person)
    {
        this.name = person.name;
        this.lastName = person.lastName;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getLastName()
    {
        return lastName;
    }

    @Override
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
