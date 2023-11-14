public class SelectionSort
{
    static void selectionSort(int[] arr,int arraySize)
    {
        for(int indx=0; indx<arraySize; indx++)
        {
            for(int i=indx+1; i<arraySize; i++)
            {
                if(arr[indx]>arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[indx];
                    arr[indx] = temp;
                }
            }//inner nested loop
        }//outer loop
    }//void func selectionSort
    public static void main(String[] args)
    {
    int[] array = {
    35, 17, 92, 48, 73, 56, 24, 81, 62, 10,
    5,  39, 67, 28, 53, 46, 89, 14, 70, 31,
    98, 42, 77, 20, 60, 13, 84, 50, 37, 78};
    System.out.print("Before implimenting selectionSort() :");
    for(int x : array){System.out.print(x+", ");}
    selectionSort(array,30);
    System.out.print("After SelectionSort() :");
    for(int x : array){System.out.print(x+", ");}
    }//main
}//class SelectionSort