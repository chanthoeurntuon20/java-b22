package polygon_abstract_interface;

public class EquilateralTriangle extends Rid implements RegularPolygon {
	static final int SIZE_NUMBER = 3;
	EquilateralTriangle(int sizeLength) {
		super(sizeLength);
	}
	@Override
	public int getNumSides() {
		return SIZE_NUMBER;
	}

	@Override
	public int getSideLength() {
		return sizeLength;
	}
	


}
