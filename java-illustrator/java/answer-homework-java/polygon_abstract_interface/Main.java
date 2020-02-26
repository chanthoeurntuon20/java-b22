package polygon_abstract_interface;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		EquilateralTriangle  equilateralTriangle= new EquilateralTriangle(2);
		Square square = new Square(3);
		System.out.println(equilateralTriangle.sizeLength);
		System.out.println();
		List<RegularPolygon> polygon = new ArrayList<>();
		polygon.add(equilateralTriangle);
		polygon.add(square);
		System.out.println(RegularPolygon.getTotalSides(polygon));
		
	}

}
