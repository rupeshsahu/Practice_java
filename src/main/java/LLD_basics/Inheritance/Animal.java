package LLD_basics.Inheritance;

public class Animal {

    private int age;
    private String name;
    private String colour;
    private String type;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    private void bite(){
        System.out.println("bite");
    }

    private void bark(){
        System.out.println("Bark");
    }

}
