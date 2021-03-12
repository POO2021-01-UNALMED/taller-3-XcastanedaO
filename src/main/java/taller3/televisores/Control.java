package taller3.televisores;

public class Control {
	TV tv;

	
	public void enlazar(TV televisor){
		this.tv = televisor;
		televisor.control = this;
	}
	
	public void setTv(TV televisor) {
		this.tv = televisor;
	}
	
	public TV getTv() {
		return tv;
	}
	
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}

	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {  
		this.tv.setCanal(canal);
	} 
	
}
