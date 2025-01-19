package model;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate dob;

    public Pet(){

    }

    public Pet(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    protected void protectedMethod() {
        System.out.println("This is the protectedMethod of Pet");
    }

    void packageProtected() {
        System.out.println("This is the packageProtected method of Pet");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString(){
        return "Pet{" +
                "name='" + name + '\'' +
                ", dob" + dob +
                '}';
    }
}
