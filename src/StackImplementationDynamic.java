
public class StackImplementationDynamic {



	int mArraySize;
	int [] mArray;
	int mTop;


	public StackImplementationDynamic(int size){

		mArraySize=size;
		mArray=new int[mArraySize];
		mTop=-1;


	}

	public void push(int value){
		if(isFull()){
			int tempArraySize=mArraySize*2;
			int [] tempArray=new int[tempArraySize];


			for(int i=0; i<mArray.length; i++){

				tempArray[i]=mArray[i];
			}

			mArray=tempArray;
			mArraySize=tempArraySize;



			System.out.println("Array is full,i expanded that for you");

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

//write a function for stackimplementationdynamic calls count
//it will print a line saying the value of the array
//it will use a for loop to add up all the numbers in the array.





