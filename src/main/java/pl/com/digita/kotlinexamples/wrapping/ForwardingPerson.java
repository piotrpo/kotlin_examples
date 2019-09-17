package pl.com.digita.kotlinexamples.wrapping;

public class ForwardingPerson implements IPerson
{
    private final IPerson wrappedPerson;

    public ForwardingPerson(IPerson person)
    {
        this.wrappedPerson = person;
    }

    @Override
    public String getName()
    {
        return wrappedPerson.getName();
    }

    @Override
    public void setName(String name)
    {
        wrappedPerson.setName(name);
    }

    @Override
    public String getLastName()
    {
        return wrappedPerson.getLastName();
    }

    @Override
    public void setLastName(String lastName)
    {
        wrappedPerson.setLastName(lastName);
    }
}
