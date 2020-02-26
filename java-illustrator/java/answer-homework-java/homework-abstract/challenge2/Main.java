package homework_abstracts;

public class Main {
	public static void main(String[] args) {
		MiniVan miniVan1 = new MiniVan("XXXXXX", 145f, 10);
		String text =  "] speed is ";
		System.out.println(miniVan1 + text + miniVan1.getMaximalSpeed());
		
		TucTuc tuctuc = new TucTuc("YYYYYYY", 45f, 3);
		System.out.println(tuctuc + text + tuctuc.getMaximalSpeed());
		
		BatMobile batman = new BatMobile("ZZZZZZZ", 75f, false);
		System.out.println(batman + text + batman.getMaximalSpeed());
	}
}
