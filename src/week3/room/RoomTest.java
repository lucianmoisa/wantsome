package week3.room;

import week3.person.Person;

// class that tests the Room class and its functionality
public class RoomTest {

    public static void main(String[] args) {
        // we instantiate a new room
        Room room = new Room(2);
        room.printAll();
        // create two persons and add them to the room
        Person p1 = new Person("Daria", 1995);
        room.enter(p1);
        room.printAll();
        room.enter(new Person("Mihai", 1990));
        room.printAll();
        p1.setHairColor("yellow");
        room.printAll();

//        System.out.println("Trying to add 3rd..");
//        room.enter(new Person("Ion", 1997, "blonde"));
//        room.printAll();
//        System.out.println("Daria is in the room: " + room.isPresent("daria"));
//        System.out.println("Ion is in the room: " + room.isPresent("Ion"));
//
//        Person p3 = new Person("Daria", 1995);
//
//        System.out.println("p1 is == p3: " + (p1 == p3));
//        Person p4 = p1;
//        System.out.println("p1 is == p4: " + (p4 == p1));

        //testString();
        room.printOldest();

        Room r2 = new Room(10);
        r2.printOldest();
        System.out.println("THE END");
    }

    // method that demonstrates String immutability and how Strings behave for == operator and .equals method
    // 'literal' strings can be tested for equality using the == operator; however, if a String is allocated explicitely using the 'new' operator, then it will not be equal with the same 'literal value
    private static void testString() {
        String s1 = "abc"; // 'literal' or 'constant' string
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println("s1==s2 ? : " + (s1 == s2));
        System.out.println("s1==s3 ? : " + (s1 == s3));

        System.out.println("s1.eq(s2) ? : " + (s1.equals(s2)));
        System.out.println("s1.eq(s3) ? : " + (s1.equals(s3)));
        String s4 = null;

        System.out.println(s4 == null);
        System.out.println(s4 != null && s4.equals(s1));
    }
}
