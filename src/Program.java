import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
	HashMap<String, String> myHashMap=new HashMap<>();
	myHashMap.put("name", "Tabassum");
	myHashMap.put("job title", "Mobile QA Lead");
	
	System.out.println(myHashMap.get("name"));
	myHashMap.merge("name", " Tayyab");
	}
	
	public static void lesson5(){
		
		StackImplementationDynamic stack =new StackImplementationDynamic(5);
		//lesson3();
		//StackImplementation stack=new StackImplementation(5);
		stack.push(4);
		stack.push(5);
		stack.push(2);
		stack.push(1);
//		stack.count();
		stack.push(3);
		stack.push(10);
		stack.push(2);
		stack.push(4);
//		stack.count();
		stack.push(5);
		stack.push(2);
		stack.push(1);
		stack.push(3);
//		stack.count();
		stack.push(10);
		stack.push(2);
	}
	public static void lesson4(){
		
		StackImplementation stack=new StackImplementation(5);
		stack.push(4);
		stack.push(5);
		stack.push(2);
		stack.push(1);
		stack.push(3);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(10);
		stack.push(2);
		
	}
	public static void lesson3(){
		ThreeDimensionalRectangle tdr = new ThreeDimensionalRectangle(10,20,30);
		System.out.println(tdr.getHeight());
		System.out.println(tdr.getVolume());
		System.out.println(tdr.getArea());
		tdr.setName("Nick");
		printShapeName(tdr);
		lesson2();
		tdr.setColor("Red");
		printShapeColor(tdr);
		System.out.println(tdr.getSize());

	}

	public static void printShapeName(IShape shape){

		System.out.println(shape.getName()+ " has a total surface area of  "+ shape.getArea()+ " "+ shape.getSurfaceAreaUnitOfMeasure());


	}


	public static void printShapeColor(IColor color){
		System.out.println("The color is "+ color.getColor());

	}
	
	public static void lesson2(){

		Rectangle rectangle1 = new Rectangle(10, 5);
		Rectangle rectangle2 = new Rectangle(20, 8);
		rectangle1.setName("Tom");
		printShapeName(rectangle1);
		rectangle1.setColor("Yellow");
		printShapeColor(rectangle1);
		System.out.println(rectangle1.getSize());
		//rectangle1.getSize();

		//Rectangle rectangle1 = new Rectangle(10, 5);
		//System.out.println(rectangle1.getHeight());

		//rectangle1.setHeight(20);
		//System.out.println(rectangle1.getArea());

		//Rectangle rectangle2 = new Rectangle(20, 8);
		// rectangle1.getArea();
		// lesson1();
		rectangleComparison(rectangle1.getArea(), rectangle2.getArea());

	}
	public static void lesson1() {

		int value = 30;
		int comparison = 20;
		int value2 = 50;
		int comparison2 = 190;
		int value3 = 78;
		int comparison3 = 100;
		comparison(value2, comparison2);
		comparison(value3, comparison3);

		// TODO Auto-generated method stub
		// Print a second line that gives you a difference between comparison
		// and value
		// print a 3rd line that gives you the absolute values of the difference
		// create an array and iterate through it using for loops
		//

		if (value < comparison) {

			System.out.println(value + " is less then " + comparison);

		} else if (value > comparison) {
			System.out.println(value + " is greater then " + comparison);

		}

		System.out.println("Difference between value & comparison = " + (value - comparison));

		int abs = (comparison - value);
		if (abs < 0) {
			abs = abs * -1;
		}
		System.out.println("Absolute value = " + abs);

		// Create an array of integers and iterate through it using a for loop
		// to get the sum of the values

		// type[] name = new type[quantity]

		int[] looping = new int[10];

		looping[0] = 3;
		looping[1] = 14;
		looping[2] = 15;
		looping[3] = 9;
		looping[4] = 26;
		looping[5] = 25;
		looping[6] = 29;
		looping[7] = 42;
		looping[8] = 266;
		looping[9] = 1;

		// for (lowest bound; highest bound; amount to increase by)
		for (int i = 0; i < (looping.length); i++) {
			System.out.println("This value is  " + looping[i]);

		}

		for (int i = looping.length - 1; i >= 0; i--) {
			System.out.println("This value is  " + looping[i]);
		}
	}

	public static void comparison(int value, int comparison) {

		if (value < comparison) {

			System.out.println(value + " is less then " + comparison);

		} else if (value > comparison) {
			System.out.println(value + " is greater then " + comparison);

		}

		System.out.println("Difference between value & comparison = " + (value - comparison));

		int abs = (comparison - value);
		if (abs < 0) {
			abs = abs * -1;
		}
		System.out.println("Absolute value = " + abs);
	}

	public static void rectangleComparison(int value, int comparison) {

		if (value < comparison) {

			System.out.println("rectangle2 has larger area");

		} else if (value > comparison) {
			System.out.println("rectangle1 has larger area");

		}

	}
}
