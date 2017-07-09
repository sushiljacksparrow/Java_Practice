
class Heap {

  static void sort(int[] arr) {
      int len = arr.length;
      for (int i = len/2 -1; i>=0; i--) {
        heapify(arr, len, i);
      }

      for (int i = len -1; i>=0; i--) {
        int temp = arr[i];
        arr[i] = arr[0];
        arr[0] = temp;

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

      int temp = arr[index];
      arr[index] = arr[largest];
      arr[largest] = temp;
      heapify(arr, len, largest);
    }

  }

  public static void main(String[] args) {
    int arr[] = {12, 11, 13, 5, 6, 7};
    int n = arr.length;
    sort(arr);
    for (int i = 0; i < n;i++)
    System.out.println(arr[i]);
  }
}
