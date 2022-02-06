public static int[] implementMergeSort(int arr[], int start, int end){
    if (start < end) {
        int m =start+ (end-start)/2;

        implementMergeSort(arr, start, m);
        implementMergeSort(arr, m + 1, end);

        merge(arr, start, m, end);
       
    } 
    for (int i = 0; i < arr.length; ++i){
        if(i == arr.length){
            System.out.print(arr[i] + " ");
        }
    }
    return arr;   
}
private static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i){
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j){
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }