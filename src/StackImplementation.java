
public class StackImplementation {

	int mArraySize;
	int [] mArray;
	int mTop;


	public StackImplementation(int size){

		mArraySize=size;
		mArray=new int[mArraySize];
		mTop=-1;


	}
	
	public void push(int value){
		if(isFull()){
			System.out.println("Array is full");
			return;
		}

		mTop++;
		mArray[mTop]=value;
		System.out.println("The following value has been added "+ mArray[mTop]);

	}
	
	public void pop(){
		if(isEmpty()){
			System.out.println("Array is empty");
			return;
		}
		mTop--;
		System.out.println("The following value has been removed "+ mArray[mTop+1]);
	}
	
	public int peek(){
		return mArray[mTop];
	}
	
	public boolean isFull(){
		return mTop==(mArraySize-1);
	}
	
	public boolean isEmpty(){
		if (mTop==-1){
		return true;
		}
		else {
			return false;
		}
	}
}

//



