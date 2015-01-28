
package person;

public class PersonDriver {
    public static void main(String[] args) {
        Person Vlad = new Person();
        //System.out.println(Vlad.age); age is not visible because field is private
        System.out.println(Vlad.getAge());
        System.out.println(Vlad.dob);
        //Vlad.age = 30; private field
        Vlad.setAge(30);
        Vlad.dob = 2000;
        //System.out.println(Vlad.age); private field
        System.out.println(Vlad.dob);
        System.out.println(Vlad.getAge());

    }

}

