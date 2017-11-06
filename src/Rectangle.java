
public class Rectangle implements IShape,IColor,ISize {

	protected int mLength;
	protected int mWidth;
	protected static String mName;
	protected String mColor;
	

	public Rectangle(int length, int width){

		mLength = length;
		mWidth = width;

	}

	public int getLength()
	{
		return mLength;
	}

	public void setLength(int length){
		mLength = length;
	}

	public int getArea(){
		return mLength*mWidth;
	}

	public void setName(String name){
		mName = name;
	}

	public String getName(){
		return mName;
	}

	@Override
	public String getSurfaceAreaUnitOfMeasure() {
		// TODO Auto-generated method stub
		return "Square inches";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return mColor;
	}
	
	public void setColor(String color){
		mColor=color;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		
		
		return mLength*mWidth;
		
	
	}
	
	
	
	

}

/*
 * private int mHeight; private int mWidth;
 * 
 * 
 * 
 * public Rectangle(int height, int width){ mHeight=height; mWidth=width;
 * 
 * 
 * }
 * 
 * public int getHeight(){
 * 
 * return mHeight; }
 * 
 * public void setHeight(int height){
 * 
 * mHeight=height;
 * 
 * 
 * } public int getArea(){ return mHeight*mWidth; }
 */


