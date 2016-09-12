/**
 * Created by cfang on 9/10/16.
 */
public class Driver {
    public static void main(String args[]){
        System.out.println("hello");
        int arr[]={6,2,9,3,1};
        printArr(arr);
        System.out.println(findMinDist(arr));
        bubbleSort(arr);
        printArr(arr);
        int minDist=findMinDist(arr);
        printMinDistPairs(arr,minDist);
    }

    public static int findMinDist(int arr[]){
        int minDist=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])<minDist){
                    minDist=Math.abs(arr[i]-arr[j]);
                }
            }
        }
        return minDist;
    }
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printMinDistPairs(int sortedArr[],int minDist){
        for(int i=0;i<sortedArr.length-1;i++){
            if(sortedArr[i]+minDist==sortedArr[i+1]){
                System.out.println(sortedArr[i]+" "+sortedArr[i+1]);
            }
        }
    }
}
