/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion.sort;

import java.util.Arrays;

import static insertion.sort.Insertion.InsertionSort;
import static insertion.sort.Insertion.mergeSort;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

  public static void main(String[] args) {
    int[] arr = {8, 4, 23, 42, 16, 15};
    ///Code challenge 26
    System.out.println(Arrays.toString(InsertionSort(arr)));

    ///Code challenge 27
    System.out.println(Arrays.toString(mergeSort(arr)));
  }
}