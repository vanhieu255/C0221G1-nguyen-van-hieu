package thuc_hanh_bai1_animal;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import thuc_hanh_bai1_animal.*;

import java.util.Arrays;
import thuc_hanh_bai1_edible.*;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}



