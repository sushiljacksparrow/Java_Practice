

int kadane(int arr[]) {
  int size = sizeof(arr)/sizeof(int);

  int max_ending_here = 0;
  int max_so_far = 0;

  for (int i = 0; i < size; i++) {
    max_ending_here = max_ending_here + arr[i];
    if (max_ending_here < 0) {
      max_ending_here = 0;
    }

    if (max_so_far < max_ending_here) {
      max_so_far = max_ending_here;
    }
  }
}

int kadane_for_multiplication(int arr[]) {
  int size = sizeof(arr)/sizeof(int);
  int max_ending_here = 1;
  int min_ending_here = 1;
  int max_so_far = 1;

  for (int i = 0; i < size; i++) {

    if (arr[i] > 0) {
      max_ending_here = max_ending_here * arr[i];
      min_ending_here = min(min_ending_here*arr[i], 1);
    } else if (arr[i] == 0) {
      min_ending_here = 1;
      max_ending_here = 1;
    } else {
      int temp = max_ending_here;
      max_ending_here = max(min_ending_here*arr[i], 1);
      min_ending_here = temp * arr[i];
    }

    if(max_so_far < max_ending_here) {
      max_so_far = max_ending_here;
    }

    return max_so_far;
  }

}
