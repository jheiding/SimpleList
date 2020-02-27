/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse360assign2;

/**
 *
 * @author Jeremy Heidinger
 * Assignment: Assignment 1
 * This program creates a object of a simple list. It Creates and array and can add elements to 
 * the array. Find elements in the array and can also remove elements in the array. As well as keeping 
 * count of the size of the array.
 * 
 */
public class SimpleListV2
{
    private int[] list; // the SimpleList Array
    private int count; // Count for the elements in List
    private int size = 10;
    //Default Constructor
    public SimpleListV2()
    {
        count = 0;//No elements are in the array
        list = new int[size]; //Sets the empty list to size of ten
    }
    //Add method
    /*
     * Takes the elements passed in and add them to the list
     */
    public void add(int number)
    {
        count++;// Adds One to the Count to keep track of the amount of elements that are in the array
        int[] TemporaryArray;//Declares a Temporary Array so if we need to change the size of list
          if(count > size)// Sees if the List if full of Elements
                {
                     size += (size/2); // increases the max size by 50%
                     TemporaryArray = new int [size];//creates a temporary array with the new size to hold the data
                     // so we can change the allowed memory for list;
                     for (int index = 0; index < list.length; index++)
                     {// moves the elements from list into 
                    	 //the TemporaryArray
                    	 TemporaryArray[index] = list[index];
                      }
                     list = TemporaryArray;// changes the max size of list and moves everything back into list
                     
                }
        if(count == 1) // if the elements is empty and is adding the first number into the list
        	list[0] = number;
        
        else // if the List has elements all ready in it 
        {
        	// Runs through the list till it hits the beginning moving every element over then putting
        	// the new element in the first position
            for(int index = count - 1; index > 0; index--)
            {
                      
                list[index] = list[index - 1]; // Moves all the elements down the list
                if(index == 1)//when i is 1 then the new number must be put in right before it
                	list[index - 1] = number;
            }
        }
    }
    /*
     * Adds a number to the end of the list
     */
    public void append(int number)
    {
    	 count++;// Adds One to the Count to keep track of the amount of elements that are in the array
         int[] TemporaryArray;//Declares a Temporary Array so if we need to change the size of list
           if(count > size)// Sees if the List if full of Elements
                 {
                      size += (size/2); // increases the max size by 50%
                      TemporaryArray = new int [size];//creates a temporary array with the new 
                      //size to hold the data so we can change the allowed memory for list;
                      for (int index = 0; index < list.length; index++)
                      {// moves the elements from list into 
                     	 //the TemporaryArray
                     	 TemporaryArray[index] = list[index];
                       }
                      list = TemporaryArray;// changes the max size of list and moves everything 
                      //back into list
                      
                 }
           list[count-1]=number;
    }
    /*
     * Removes an element from the list and moves the elements after down to cover that spot
     */
    public void remove(int number)
    {
        int position = this.search(number); // gets the position of the number
        // goes from the position it found in search to the end of the list and moves the elements down  
        //to remove the element 
        
        	for(int index = position;index < count-1;index++) // starts at the removed item 
        		//and move things down
        	{
        		list[index]=list[index+1]; // moving the elements down the list
            
        	}
        	count--;
        	// Subtracting 1 from the count to keep track of how many elements are in the list
        	if(size > count-size/4)
	    	{
	    		int[] TemporaryArray;// Declares a Temporary Array for moving data out of list;
	    		size -= size/4;
	    		TemporaryArray = new int [size];//creates a temporary array with the new size to hold the data
	    		// so we can change the allowed memory for list;
	            	for (int index = 0; index < size; index++)
	            	{// moves the elements from list into 
	           	 		//the TemporaryArray
	            		TemporaryArray[index] = list[index];
   	             	}
	            	list = TemporaryArray;// copies all elements back into the adjusted size list
	            
	    	}
    }
    /*
     * Searches though the list to find the position element past in
     */
    public int search(int number)
    {
    	int position = -1;
        // foes through the list  until the element is found
    	int index = -1;// to start at zero
    	do
		{
    		index++;
			if(list[index] == number)// Sees if the number is at that position in the list
			{
				position = index; // Saves that location into position
			}
			
			
		}while(list[index] != number && index < count-1);// runs till end of  list or number is found
        
        return position;
    }
    /*
     * returns the count so that we can received the amount of elements are in the list
     */
    public int count()
    {
        return count;
    }
    // returns the max size of the list
    public int size()
    {
    	return size;
    }
    // returns the first element of the list
    public int first()
    {
    	int firstspos = list[0];// gets the first position of list
    	if(count == 0)// if the list is empty
    	{
    		firstspos = -1;
    	}
    	return firstspos;
    }
    /*
     * Creates the String of the list
     */
    public String toString()
    {
        String Stringlist="";// Creates an empty String
        // Loops through the list to the last element
        for(int index = 0;index < count; index++)
        {
        	
                Stringlist += list[index];// Adds each element of the list with a space behind 
                if(index < count - 1)
                {
                	Stringlist += " ";
                }
        }
        
        return Stringlist;// returns the created string of the list
    }
    
}
