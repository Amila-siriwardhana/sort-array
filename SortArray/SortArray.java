class SortArray {
    void sortArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String args[])
    {
        SortArray ob = new SortArray();
        int arr[] = { 5, 1, 20, 8 , 10 };
        ob.sortArray(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

        var a = arr[(arr.length)/2];
        System.out.println("Median Value is " + a);

        var b = arr[(arr.length-1)];
        System.out.println("Highest Value is " + b);

        var c = arr[(arr.length-1)];
        System.out.println("Mode Value is " + c);

    }
}