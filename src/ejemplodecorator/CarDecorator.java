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
public class CarDecorator implements Car{
    protected Car car;
	
	public CarDecorator(Car c){
		this.car=c;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
	}
}
