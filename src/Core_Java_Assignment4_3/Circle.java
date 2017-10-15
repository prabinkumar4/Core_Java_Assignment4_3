package Core_Java_Assignment4_3;
									
public class Circle extends Shape {					
	float Radius;									
		Circle(float radius)	{					
			this.Radius = radius;}					

final float area() {                             	
      return Shape.pi * Radius *Radius;}			
}														