package datastructure;

public class MyTreeNode<T> {
	
	private T data;
	public MyTreeNode<T> parent, left, right;
	
	public MyTreeNode(){
		data = null;
		left = right = parent = null;
	}
	
	public MyTreeNode(T data) {
		this.data = data;
		left = right = parent = null;
	}
	
	public MyTreeNode(T data, MyTreeNode<T> parent, MyTreeNode<T> left, MyTreeNode<T> right) {
		this.data = data;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
