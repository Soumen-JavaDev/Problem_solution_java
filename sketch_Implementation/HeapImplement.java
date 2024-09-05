import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HeapImplement {
    public static void main(String[] args) {
        Heap heap=new Heap();
        int[] arr={1,4,53,5,3,6,23};
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
           heap.MaxHeap(i);
        }
       heap.Print();
       System.out.println(Arrays.toString(arr));
    }
}
class Heap{
    ArrayList<Integer> arr;
    int n;
    Heap(){
        arr=new ArrayList<>();
        this.n=arr.size();
    }
   
    void  MaxHeap(int idx){
        int l=2*idx+1;
        int r=2*idx+2;
        int indext=idx;
        if(l<n && arr.get(l)>arr.get(indext))indext=l;
        if(r<n && arr.get(r)>arr.get(indext))indext=r;
        if(indext != idx){
            Collections.swap(arr,indext,idx);
            MaxHeap(indext);
        }else return;
    }
    void Print(){
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" "+"d");
        }
    }
}