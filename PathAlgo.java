import java.util.ArrayList;
import java.util.List;

public class PathAlgo {
    public static List<ArrayList> allPathsS = new ArrayList();

    public static void main(String[] args) {
        int matrix[][] = new int[][]{{0, 1, 1, 1},
                                     {1, 1, 1, 1},
                                     {1, 1, 0, 1}
                                    };
        PathAlgo plg = new PathAlgo();
        List allPaths = new ArrayList();
        // calculate matrix last index
        int matrixLastRowIndex = matrix.length-1;
        int matrixColumnIndex = matrix[matrix.length-1].length-1;
        allPaths.add("(0,0)"); // add first element in path
        plg.getAvailablePaths(matrix, 0,0,allPaths, matrixLastRowIndex, matrixColumnIndex);
        List minPath = new ArrayList();
        for (List path : allPathsS){  // get Shortest path from the list
            if(minPath.size() > path.size() || minPath.isEmpty()){
                minPath = new ArrayList(path);
            }
        }
        System.out.println("Shortest path co-ordinates");
        System.out.println(minPath); // print shortest path

    }

    /**
     * This method will return all possible paths available to reach last element
     */
    public List getAvailablePaths(int[][] matrix, int m, int n, List paths, int matrixLastRowIndex, int matrixColumnIndex  ){
      if(m== matrixLastRowIndex && n == matrixColumnIndex){
          allPathsS.add((ArrayList)paths); // add full path into static variable
      }
      else{
          if((n+1) <= matrixColumnIndex && matrix[m][n+1] ==1 ){ // send Right element
              List newPath = new ArrayList(paths);
              int indx =n+1;
              newPath.add("("+m+","+indx+")");
              getAvailablePaths(matrix, m, n+1, newPath, matrixLastRowIndex, matrixColumnIndex );
          }
          if((m+1) <= matrixLastRowIndex && matrix[m+1][n] ==1 ){ // send bottom element
              List newPath = new ArrayList(paths);
              int indx =m+1;
              newPath.add("("+indx+","+n+")");
              getAvailablePaths(matrix, m+1, n, newPath, matrixLastRowIndex, matrixColumnIndex );
          }
          if((m-1) >= 0 && matrix[m-1][n] == 1 ){ // send top element
              int indx =m-1;
              String coOrdinates = "("+indx+","+n+")";
              if(!paths.contains(coOrdinates)){
                  List newPath = new ArrayList(paths);
                  newPath.add(coOrdinates);
                  getAvailablePaths(matrix, m-1, n, newPath, matrixLastRowIndex, matrixColumnIndex );
              }
          }
          if((n-1) >= 0 && matrix[m][n-1] == 1 ){ // send top element
              int indx =n-1;
              String coOrdinates = "("+m+","+indx+")";
              if(!paths.contains(coOrdinates)){
                  List newPath = new ArrayList(paths);
                  newPath.add(coOrdinates);
                  getAvailablePaths(matrix, m, n-1, newPath, matrixLastRowIndex, matrixColumnIndex );
              }
          }
      }
      return paths;
    }
}
