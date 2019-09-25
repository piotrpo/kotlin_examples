package pl.com.sandbox.kotlinexamples.telescope;

public class Person {
    private final String name;
    private final String lastName;
    private Integer age;
    private Integer children;
    public Person(String name, String lastName) {
        if (name == null || lastName == null) {
            throw new NullPointerException("Name nor surname cannot be null");
        }

        this.name = name;
        this.lastName = lastName;
    }
    public Person(String name, String lastName, Integer age) {
        this(name, lastName);
        this.age = age;
    }
    public Person(String name, String lastName, Integer age, Integer children) {
        this(name, lastName, age);
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getChildren() {
        return children;
    }
}
