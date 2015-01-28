package person;

public class Person {
    private String name;
    private int age;
    public int dob;

    Person() {
        age = 20;
        dob = 1995;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }

    void becomeOlder(){
        this.age++;
    }

    String getName(){
        return name;
    }

}

