class KLargest {

  static void largestK(int arr[], int k) {
      int len = arr.length;
      for (int i = len/2-1;i>=0;i--) {
        heapify(arr, len, i);
      }

      for (int i = len-1;i>=len-k;i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        heapify(arr, i, 0);
      }
  }

  static void heapify(int arr[], int len, int index) {
      int largest = index;
      int left = 2*index + 1;
      int right = 2*index + 2;

      if (left < len && arr[left] > arr[largest]) {
        largest = left;
      }

      if (right < len && arr[right] > arr[largest]) {
        largest = right;
      }

      if (largest != index) {
        int temp = arr[largest];
        arr[largest] = arr[index];
        arr[index] = temp;
        heapify(arr, len, largest);
      }
  }

  public static void main(String[] args) {
    int arr[] = {1, 23, 12, 9, 30, 2, 50};
    int k = 7;
    largestK(arr, k);
    int len = arr.length;
    for (int i = len - 1; i>= len-k;i-- ) {
      System.out.println(arr[i]);
    }
  }

}
