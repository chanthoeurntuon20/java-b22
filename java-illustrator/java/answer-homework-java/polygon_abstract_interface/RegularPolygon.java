package polygon_abstract_interface;
import java.util.List;

public interface RegularPolygon {
	int getNumSides();
	int getSideLength();
	static int getTotalSides(List<RegularPolygon> listPolygon) {
		int totalSide = 0;
		for(RegularPolygon regularPolygon : listPolygon) {
			totalSide += regularPolygon.getNumSides();
		}
		return totalSide;
	}
}
