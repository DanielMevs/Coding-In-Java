import model.Dog;
import model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, nice to meet you!");

        Person tom = new Person("Tom", "Smith", LocalDate.of(1984, 6, 15));
        Person janet = new Person("Janet", "Jackson", LocalDate.of(1985, 12, 3));

        tom.setSpouse(janet);

        Dog fido = new Dog("Fido", LocalDate.of(2018, 1, 1));
        fido.bark();
        tom.setPet(fido);

        System.out.println(tom);
    }
}

