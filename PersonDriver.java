class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative!");
        } else {
            this.age = age;
        }
    }
}

public class PersonDriver {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(25);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");

        Person person2 = new Person();
        person2.setName("Jane");
        person2.setAge(-5); // This should print "Age cannot be negative!"
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
    }
}
