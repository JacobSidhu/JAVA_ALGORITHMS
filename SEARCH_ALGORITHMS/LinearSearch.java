public class LinearSearch
{
    int linearSearch(int[] array, int arraySize, int key)
    {
        for(int indx=0; indx<arraySize; indx++)
        {
            if(array[indx]==key)return indx;
        }
        return -1;
    };
    static public void main(String[] args)
   {
       int[] arr = {12,43,5,57,4,5,467,86,3,4,578,4};
       System.out.print(arr.length);
   }
}
