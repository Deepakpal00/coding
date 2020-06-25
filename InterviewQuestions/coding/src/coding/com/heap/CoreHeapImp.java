package coding.com.heap;

import java.util.Arrays;

class HeapImp{ // {10,7,11,30,20,38,2,45}  45 38 30 20 11 10 7 2
	 int size;
	 int array[]=new int[30];
	
	  void insertNewValue(int value) {
		 array[size]=value;
		 int index = size;
		 int parent = (index-1)/2;
		 
		 while(parent>=0 && array[parent]<array[index]) {
			 int temp = array[parent];
			 array[parent]=array[index];
			 array[index]=temp;
			 
			 temp = parent;
			 index= parent;
			 parent = (temp-1)/2;
		 }
		 size++;
		
	}

	public void print() {
		System.out.println(Arrays.toString(array));
	}
	 	  

}


public class CoreHeapImp {

	public static void main(String[] args) {
		HeapImp heap=new HeapImp();
		int array[]= {10,7,11,30,20,38,2,45};
		for(int i : array) {
			heap.insertNewValue(i);
		}
		heap.print();
	}
}
