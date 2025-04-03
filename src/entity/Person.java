package entity;

public record Person(String name, String surname){
    public void print() {
        System.out.println("hi");
    }
}
