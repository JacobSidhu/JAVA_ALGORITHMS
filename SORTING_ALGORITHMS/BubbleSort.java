public class BubbleSort
{
    static void bubbleSort(int[] inputArray)
    {
        int arrayLenght = inputArray.length;
        for(int i=0; i<arrayLenght-1; i++)
        {
            for(int j=0; j<arrayLenght-i-1; j++)
            {
                if (inputArray[j]>inputArray[j+1])
                {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arrayToSort ={3,25,22,11,94,24,23,65,82,52,4,88};
        System.out.print("Before Sorting :");
        for(int elements : arrayToSort )System.out.print(elements+", ");
        bubbleSort(arrayToSort);
        System.out.print("After Sorting :");
        for(int elements : arrayToSort )System.out.print(elements+", ");
        
    }
}