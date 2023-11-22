package core;

public interface IStack {
	
	boolean isEmtpy();
	int getSize();
	
	void push(int i);
	int getTop();
	
	void pop();
	
	boolean isFull();
}
