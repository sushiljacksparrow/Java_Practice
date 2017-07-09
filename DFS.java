import java.io.*;
import java.util.*;

class DFS {

  int V;
  LinkedList<Integer> adjacencyList[];

  public DFS(int v) {
    this.V = v;
    adjacencyList = new LinkedList[v];
    for (int i = 0; i < v; i++) {
      adjacencyList[i] = new LinkedList<>();
    }
  }

    void DFS(int source) {
      boolean visited[] = new boolean[V];

      Stack<Integer> S = new Stack<>();
      S.push(source);
      visited[source] = true;

      while(!S.empty()) {
        int v = S.pop();
        Iterator<Integer> iterator = adjacencyList[v].listIterator();
        while(iterator.hasNext()) {
          int temp = iterator.next();
          if (!visited[temp]) {
            S.push(temp);
            visited[temp] = true;
          }
        }
      }

  }
}
