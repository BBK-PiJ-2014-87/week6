
package person;

public class PersonLoop {

    public static void main(String[] args) {
        String[] names = { "Olga", "Vlad", "Juri", "Sam", "Jhon", "Lara",
                "Lora", "Mike", "Pete", "Rob" };
        int[] ages = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Person[] people = new Person[10];
        int i = 0;
        int j = 0;

        // while (i < 10) {
        // people[i] = new Person(names[i], ages[i]);
        // System.out.println(people[i].getName());
        // System.out.println(people[i].getAge());
        // System.out.println(people[i]);
        // i++;
        // }
        // *************** DOUBLE LOOP *****************
        while (i < 10) {
            while (j < 10) {
                people[j] = new Person(names[j], ages[i]);
                // System.out.println(people[i].getName());
                // System.out.println(people[i].getAge());
                // System.out.println(people[i]);
                break;
            }
            i++;
            j++;
        }

        for (Person l : people) {
            System.out.println(l.getAge());
            l.becomeOlder();
            System.out.println(l.getAge());
        }

//        i = 0;
//        while (i < 10) {
//            System.out.println(people[i].getAge());
//            i++;
//        }

    }

}
