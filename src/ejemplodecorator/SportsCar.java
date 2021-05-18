/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodecorator;

/**
 *
 * @author azul_
 */
public class SportsCar extends CarDecorator{
    public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Añadiendo características de carro deportivo.");
	}
}
