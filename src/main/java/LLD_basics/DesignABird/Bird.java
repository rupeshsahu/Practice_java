package LLD_basics.DesignABird;

public class Bird {

    private int age;
    private double weight;
    private String type;
    private String colour;
    private String Name;

    public void setType(String type) {
        this.type = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    public double getWeight() {
        return weight;
    }

    public void eat(){
        System.out.println("I can eat");
    }
    public  void makeSound(){
        System.out.println("chuchu chuchu");
    }



}
