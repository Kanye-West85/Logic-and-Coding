public class ArrayList{
    private int[] data;
    private int last; //index of the last element
    /*index = position
    capacity = length the array could be
    size = length the array currently is
    last = the last position in the array
    element = the number/value in the array
    */
    //set initial capacity to 10
    public ArrayList(){
        data = new int[10];
        last = -1;  //fix
    }
    //returns the number of elements in the list (not the capacity)
    public int size(){
        return last+1;
    }
    //Precondition: 0 <= index <= last
    //return the element at that index
    public int get(int index){
        //int[] temp = new int[index];
        return data[index];
    }
    //Precondition:  0 <= index <= last
    //sets the value at index to the newValue
    public void set(int index, int newValue){
        data[index] = newValue;
    }
    //Precondition:  0 <= index <= last
    //value at index is removed from the list – all elements shift down
    //returns removed value
    public int remove(int index){
        int v = data[index];
        for(int i = data.length; i < v; i--){
            last = last - 1;
        }
        return v;
    }
    //Precondition:  0 <= index <= last+1
    //Inserts newValue at index.  Everything from index on gets shifted up
    public void add(int index, int newValue){
        //will need to call resize()
        if(last==data.length-1){
            resize();
            
        }
        //data[index] = newValue;
        for(int i = data.length; i > index; i--){
            last = last + 1;
        }
    }
    //adds newValue to the end of the list
    public void add(int newValue){
        data[data.length-1] = newValue;
        
    }
    //private method means "not accessible outside the class"
    //This is intentional.
    //This method should double the capacity
    private void resize(){
        int[] temp = new int[data.length*2];
        
        for(int i = 0; i < data.length; i++)
        temp[i] = data[i];
        data = temp;
    }
    //returns, for example, "[3, 6, 7, 9]"
    //This will be helpful for your debugging
    public String toString(){
        //String array;
        /*for(int i = 0; i <= data.length-1; i++){
            char n = data.charAt(i);
        }*/
        return java.util.Arrays.toString(data);
    }
    //returns true if two lists have exactly the same elements
    //in exactly the same order
    public boolean equals(ArrayList otherList){
        if(otherList.size() != this.size()){
            return false;
        }
        else if(otherList != this){
            return false;
        }
        return true;
    }
}