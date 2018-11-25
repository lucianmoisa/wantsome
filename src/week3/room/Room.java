package week3.room;

import week3.person.Person;

/* a representation of a room that can contain a number of persons */
public class Room {

    // instance variables - room capacity and the actual 'collection' of people represented by an array
    private int capacity;
    private Person[] people;

    // a default (!) constructor - not visible outside its package; the initial capacity is set from the and the room is initialized based on that capacity
    Room(int capacity) {
        this.capacity = capacity;
        this.people = new Person[capacity];
    }

    // getter for capacity
    public int getCapacity() {
        return capacity;
    }

    // default method that counts the number of existing persons in the room - initally, all the elements of 'people' are null
    int currentNumberOfPersonInTheRoom() {
        int count = 0;
        for (Person p : people) {
            if (p != null) {
                count++;
            }
        }
        return count;
    }

    // default method that prints the capacity, the number of persons in the room and all the persons in the room (toString is automatically invoked)
    void printAll() {
        System.out.println("Capacity is: " + capacity);
        System.out.println("The number of person in room is: " + currentNumberOfPersonInTheRoom());

        for (Person p : people) {
            if (p != null)
                System.out.println(p);
        }
        System.out.println();
    }

    // a method that adds a new person to the room only if the room is not yet full
    void enter(Person person) {
        if (currentNumberOfPersonInTheRoom() >= capacity) {
            System.out.println("Room is full!");
            return;
        }
        int newPersonPosition = currentNumberOfPersonInTheRoom();
        people[newPersonPosition] = person;

    }

    // method that checks if a person is present in the room based on its name
    boolean isPresent(String name) {
        for (Person p : people) {
            if (p != null) {
                if (p.getName().equalsIgnoreCase(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    // method that computes and prints the oldest person in the room
    void printOldest() {
        System.out.println("Computing oldest...");
        Person oldest = null;
        for (Person p : people) {
            if (p != null)
                if (oldest == null || oldest.getYear() > p.getYear()) {
                    oldest = p;
                }
        }
        System.out.println("The oldest is: " +
                (oldest == null ? "Nobody in room! " : oldest));
    }
}
