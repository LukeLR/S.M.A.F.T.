package misc;

import blocks.Pixel;

public class Constellation {
	Pixel[] pixels;
	
	public Constellation(Pixel[] pixels){
		this.pixels = pixels;
	}
	
	public void setPixels(Pixel[] pixels){
		this.pixels = pixels;
	}
	
	public Pixel[] getPixels(){
		return pixels;
	}
}