package ejemplodecorator;

import java.io.IOException;

/**
 *
 * @author azul_
 */
public class EjemploDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble();
    System.out.println("\n*****");

    Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
    sportsLuxuryCar.assemble();
        System.out.println("Fin");
    }
}
