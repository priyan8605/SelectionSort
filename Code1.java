class Demo {

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // i represent the current index
            int min_index = i;
            // compares min_index with j
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            // swap current element at i and minimum element-->current index i will have
            // correct
            // element now
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 5, 1, 2 };
        Demo.selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}