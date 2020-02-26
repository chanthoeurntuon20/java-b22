package polygon_abstract_interface;

import java.util.List;

public class Square extends Rid implements RegularPolygon {
	static final int SIZE_NUMBER = 4;
	Square(int sizeLength) {
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
