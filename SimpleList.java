package cse360assign2;

public class SimpleList {
	
	int[] intArr = new int[10]; //integer array with 10 indices
	int count = 0; //count is initialized to zero
	
	void add(int x) {
		
		for(int i = 0; i <count; i++) { //loops through array until count and shifts indices forward
			int temp = intArr[i];
			intArr[i+1] = temp;
		}
		
		intArr[0] = x; //assign
		
		count++; //increment count
	}//end add method
	
	void remove(int x) {
		
		for(int i = 0; i < count; i++) {
			if(intArr[i] ==	x) {//if the current index matches input param
				intArr[i] = 0; 
				int temp = i;
				for(int j = temp; j < count; j++) {
					int aTemp= intArr[j];
					intArr[j-1] = aTemp;
				}
				count--; //decrement count 
			}
		}
		
	}//end remove method

	int count() {
		return count; //return current count.
	}
	
	String tostring(){
		return intArr.toString();
	}
	
	int search(int x) {
		for(int i = 0; i<count;i++) {
			if(intArr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
}
