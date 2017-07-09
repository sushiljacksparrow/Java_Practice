import java.io.*;
import java.util.*;

class BFS {
  int V;
  LinkedList<Integer> adjacencyList[];

  public BFS(int v) {
    this.V = v;
    adjacencyList = new LinkedList[v];
    for (int i = 0; i <v; i++) {
      adjacencyList[i] = new LinkedList();
    }
  }

  void BFS(Integer root) {
    boolean visited[] = new boolean[V];

    LinkedList<Integer> Q = new LinkedList<>();
    Q.add(root);

    while(Q.size() != 0) {
      Integer v = Q.poll();

      Iterator<Integer> it = adjacencyList[v].listIterator();
      while(it.hasNext()) {
        int n = it.next();
        if (!visited[n]) {
          visited[n] = true;
          Q.add(n);
        }
      }
    }
  }
}
