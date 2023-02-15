/**
 * Program to Sort array in wave form
 * Author : Rahul Yadav
 * 
 * Logic
 * ======
 * arr[0]>=arr[1]<=arr[2]>=arr[3]<=...
 * 
 * Implementation
 * ==============
 * for all even positions,
 * if left side is less than current element
 * then swap the two elements.
 * And if right side is less than the current element
 * then swap the two elements.
 * 
 */
public class SortWave{

    public static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args){
        int arr[] =  {10,90,50,20,10,13,44};
        int n = arr.length;
        for(int i=0; i<n ; i+=2){
            //traveser only even positions

            if(i>0 && arr[i-1] > arr[i]){
                //check left side
                swap(arr,i-1, i);
            }

            if(i<n-1 && arr[i] < arr[i+1]){
                //check right side
                swap(arr, i, i+1);
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+"\t");
        }
    }
}