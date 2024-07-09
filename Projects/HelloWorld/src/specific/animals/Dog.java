package specific.animals;

import model.Pet;

import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(){

    }
    public Dog(String name, LocalDate dob){
        super(name, dob);
    }
    public void bark() {
        System.out.println("Ruff ruff!!!");
    }
}
