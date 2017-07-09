class PalindromePartitioning {

  int DP(String str) {
    int len = str.length;

    int C[len][len];
    int P[len][len];

    for (int i = 0; i< len;i++) {
      P[i][i] = true;
      C[i][i] = 0;
    }

    for (int k = 2; k <= len; k++) {
      for (int i = 0; i < len - k + 1; i++) {
        int j = i+k-1;

        if (k == 2) {
          P[i][j] = str[i] == str[j];
        } else {
          P[i][j] = (str[i] == str[j]) && P[i+1][j-1];
        }

        if (P[i][j] == true) {
          C[i][j] = 0;
        } else {
          C[i][j] = 9999999;
          for (int r = i; r < k-1; r++) {
            C[i][j] = min(C[i][j], C[i][r] + C[r+1][j] + 1);
          }
        }

      }
    }
    return C[0][len-1];
  }
}
