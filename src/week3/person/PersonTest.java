package week3.person;

// class that tests the Person class
public class PersonTest {

    // we create two persons then access their various fields using getters and setters
    public static void main(String[] args) {
        Person p1 = new Person("David", 1994, "red");
        Person p2 = new Person("Elena", 1995);
        System.out.println("Name: " + p1.getName() + ", " + "Born: " +
                p1.getYear());
        p1.setHairColor("black");
        System.out.println("Color after: " + p1.getHairColor());
        System.out.println("\nP1 is older: " + p1.isOlderThan(p2));
        System.out.println("P2 is older: " + p2.isOlderThan(p1));
        System.out.println("\nP1 : " + p1);
        System.out.println("P2 description : " + p2.toString());
    }
}
