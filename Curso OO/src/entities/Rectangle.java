package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double Area() {
		return width*height;
}
	public double Perimeter() {
		return (width+width) + (height+height);
	}
	public double Diagonal() {
	double form = (width*width)+(height*height);
	return Math.sqrt(form);
	}
	public String toString() {
		return "AREA = "+ String.format("%.2f",Area())+"\n"
			+"PERIMETER = "+String.format("%.2f",Perimeter())+"\n"
		    +"DIAGONAL = "+String.format("%.2f",Diagonal())+"\n";
		
	}
}