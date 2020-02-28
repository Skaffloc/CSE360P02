package cse360assign2;

public class SimpleListVer2 {
	
	int[] intArr = new int[10]; //integer array with 10 indices
	int count = 0; //count is initialized to zero
	
	void add(int x) {
		
		if(count >= 10) { //if the array is full
			intArr = new int[(int) (count*1.5)]; //increas size by fifty percent.
		}
		
		for(int i = 0; i <count; i++) { //loops through array until count and shifts indices forward
			int temp = intArr[i];
			intArr[i+1] = temp;
		}
		
		intArr[0] = x; //assign
		
		count++; //increment count
	}//end add method
	
	void remove(int x) {
		
		if(count <= 0.75*intArr.length) { //if list has more than 25% empty spaces
			intArr = new int[--count]; //decrement size
		}
		
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
	
	int first() {
		if(count == 0) {//if list is empty return -1 else return first element
			return -1;
		}
		return intArr[0];
	}
	
	int last() {
		if(count == 0) { //empty array, return -1
			return -1;
		}
		return intArr[count]; //return last element in array
	}
	
	int Size() {
		return count;//??
	}
	
}
