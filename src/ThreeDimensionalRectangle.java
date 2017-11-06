
public class ThreeDimensionalRectangle extends Rectangle implements IShape,IColor,ISize{

	private int mHeight;


	public ThreeDimensionalRectangle(int length, int width, int height) {
		super(length, width);

		setHeight(height);
		// TODO Auto-generated constructor stub
	}

	public int getHeight() {
		return mHeight;
	}

	public void setHeight(int height) {
		this.mHeight = height;
	}

	public int getVolume () {
		return mLength*mWidth*mHeight;
	}
@Override
	public int getArea(){
		//int x=(mLength*mWidth);
		int x=super.getArea();
		int y=(mWidth*mHeight);
		int z=(mLength*mHeight);


		return (2*x+2*y+2*z);
	}
@Override
	public String getSurfaceAreaUnitOfMeasure(){
		return "Cubic inches";
	}
}
//write a function called getSurfaceArea that will figure out the total surface area of three dimensional rectangle.