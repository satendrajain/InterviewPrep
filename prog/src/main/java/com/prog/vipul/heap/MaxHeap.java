package com.prog.vipul.heap;

public class MaxHeap {
	
	/*
	 * 
A Max Heap is a Complete Binary Tree. A Max heap is typically represented as an array. The root element will be at Arr[0]. Below table shows indexes of other nodes for the ith node, i.e., Arr[i]:
Arr[(i-1)/2] Returns the parent node.
Arr[(2*i)+1] Returns the left child node.
Arr[(2*i)+2] Returns the right child node.
	 * 
	 * 
	 * 
Operations on Max Heap:
1) getMax(): It returns the root element of Max Heap. Time Complexity of this operation is O(1).

2) extractMax(): Removes the maximum element from MaxHeap. Time Complexity of this Operation is O(Log n) as this operation needs to maintain the heap property (by calling heapify()) after removing root.

4) insert(): Inserting a new key takes O(Log n) time. We add a new key at the end of the tree. If new key is smaller than its parent, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property.

	 */

	private int[] Heap; 
    private int size; 
    private int maxsize; 
  
    
    // Constructor to initialize an 
    // empty max heap with given maximum 
    // capacity. 
    
    public MaxHeap(int maxsize) {
    	this.maxsize=maxsize;
    	this.size=0;
    	this.Heap=new int[this.maxsize+1];
    	Heap[0]=Integer.MAX_VALUE;
    }
    
    // Returns position of parent 
    private int getParent(int pos) {
    	return pos/2;
    }
    
    private int leftChild(int pos) {
    	return 2*pos;
    }
    
    private int rightChild(int pos) {
    	return 2*pos+1;
    }
    
    private boolean isLeaf(int pos) {
    	return true;
    }
    
	public static void main(String[] args) {
		
	}
}
