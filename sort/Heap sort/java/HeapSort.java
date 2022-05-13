public class HeapSort {
    public Object[] data;
    public int size;

    public HeapSort(int size){
        data = new Object[size];
    }

    public HeapSort(){
        data = new Object[50];
    }

    public int getParent(int index){
        return index/2;
    }

    public int getLeftChild(int index){
        return index*2;
    }

    public int getRightChild(int index){
        return (index*2)+1;
    }

    public boolean hasLeftChild(int index){
        return data[index*2]==null;
    }

    public boolean hasRightChild(int index){
        return data[(index*2)+1] ==null;
    }

    public boolean greaterThan(Object firstData, Object secondData){
        return ((Comparable) firstData).compareTo(secondData) > 0;
    }

    public boolean lessThan(Object firstData, Object secondData){
        return ((Comparable) firstData).compareTo(secondData) < 0;
    }

    public boolean equal(Object firstData , Object secondData){
        return ((Comparable)firstData).compareTo(secondData) == 0;
    }
    public boolean hasParent(int index){
        return index/2>0;
    }

    public void addData(Object value){
        //FIXME
        data[size+1] = value;
        size=size+1;
        heapifyUp(size);
        
        
    }

    public void swap(int firstIndex,int secondIndex){
        Object temp = data[firstIndex];
        data[firstIndex] = data[secondIndex];
        data[secondIndex] = temp; 
    }

    public void heapifyUp(int index){
        while(hasParent(index)  &&  greaterThan(data[index], data[index/2]) ){
            swap(index,index/2);
            index = getParent(index);
        }
    }

    public void printData(){
        for(int index = 0;index<data.length;index++){
            System.out.print(data[index]+" ");
        }
        System.out.println();
    }
    
}
