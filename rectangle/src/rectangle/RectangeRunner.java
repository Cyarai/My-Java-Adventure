package rectangle;

public class RectangeRunner {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(12, 23);
		System.out.println(rectangle);
		rectangle.setWidth(22);
		System.out.println(rectangle);
		rectangle.setLength(23);
		System.out.println(rectangle);
	}

}
