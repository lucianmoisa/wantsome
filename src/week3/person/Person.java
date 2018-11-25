package week3.person;

/* Person class - remake from week 3 practice session */
public class Person {

    // class members - all private, invisible to other classes
    private String name;
    private int year;
    private String hairColor;

    // public constructor, initializes all the instance fields with the corresponding values
    public Person(String name, int year, String hairColor) {
        this.name = name;
        this.year = year;
        this.hairColor = hairColor;
    }

    // another overloaded constructor, sets with default value for hair color - 'brown'
    public Person(String name, int year) {
        this(name, year, "brown");
    }

    /* getters for all three instance properties */
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    String getHairColor() {
        return hairColor;
    }

    /* setter for hair color */
    public void setHairColor(String hairColor) {
        System.out.println("Chaging hair color: " +
                " current color: " + this.hairColor +
                ", new color: " + hairColor);
        this.hairColor = hairColor;
    }

    /* method that evaluates if the current Person instance is older than another person */
    boolean isOlderThan(Person other) {
        return (year < other.getYear());
    }

    // overriden toString method - whenever we will try to print a Person object (using System.out) the toString method will be automatically called and the person
    // will be printed as described
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + "'" +
                ", year=" + year +
                ", hairColor='" + hairColor + "'" +
                '}';
    }
}
