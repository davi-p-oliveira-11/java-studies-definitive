import java.time.OffsetDateTime;

public class Person {

    private final String name;

    private int age;

    private int lastYeatAgeInc = OffsetDateTime.now().getYear();

    public Person(String name) {
       this.name = name;
       this.age = 1;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void incAge() {
        if (this.lastYeatAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age +=1;
        this.lastYeatAgeInc = OffsetDateTime.now().getYear();
    }

}
