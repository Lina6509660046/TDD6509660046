package core;

public class Stack implements IStack {

	
	int size,max;
	int[] arr;
	
	Stack(int size) {
	    this.size = 0;
		this.max=size;
		arr = new int[size];
	}
	
	@Override
	public boolean isEmtpy() {
		
		boolean emtpy = size == 0;
		return emtpy;
	}
	
	@Override
	public boolean isFull() {

		if(this.size<this.max)
		return false;
		
		else
		return true;
	}

	@Override
	public int getSize() {

		return size;
	}
	
	@Override
	public void push(int i) {
		
		if(this.isFull()!=true)
		
		arr[size]=i;
		this.size++;
	}
	
	@Override
	public int getTop() {	
		return arr[size-1];
	}
	
	@Override
	public void pop() {
		
		arr[size]=0;
		this.size--;
	}

}
