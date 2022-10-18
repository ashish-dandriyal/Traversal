import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Traverse2DArray program implements an application
 * that show number pattern which is represented in a matrix
 * form. It is a 2D array of m*n which traverses in clockwise
 * manner.
 *
 * Time Complexity : O(mn)
 *
 * @author  Ashish
 * @version 1.0
 * @since   2022-10-18
 */
public class Traverse2DArray {

    public static void main(String args[]) {
        int row = 4;
        int col = 4;
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        String spiral = spiralPrint(row, col, arr);
        System.out.println(spiral);
    }

    public static String spiralPrint(int row, int column, int arr[][]) {
        List<String> orderedItem = new ArrayList();

        /*
         * top - starting row index
         * bottom - ending row index
         * left - starting column index
         * right - ending column index
         * itr - iterator
         */
        int itr, top = 0, left = 0, bottom = row, right = column;

        assert row > 0 : "Row must be greater than zero.";
        assert column > 0 : "Column must be greater than zero.";
        assert arr != null : "2D array must not be null.";

        // condition to make sure that there are elements in array to be added
        while (top < bottom && left < right) {
            // adds the first row from the remaining rows
            for (itr = left; itr < right; ++itr) {
                orderedItem.add(arr[top][itr] + "");
            }
            top++;

            // adds the last column from the remaining columns
            for (itr = top; itr < bottom; ++itr) {
                orderedItem.add(arr[itr][right - 1] + "");
            }
            right--;
            // adds the last row from the remaining rows
            if (top < bottom) {
                for (itr = right - 1; itr >= left; --itr) {
                    orderedItem.add(arr[bottom - 1][itr] + "");
                }
                bottom--;
            }
            // adds the first column from the remaining columns
            if (left < right) {
                for (itr = bottom - 1; itr >= top; --itr) {
                    orderedItem.add(arr[itr][left] + "");
                }
                left++;
            }
        }
        // converting the list of string into string which contains clockwise traverse order
        return orderedItem.stream().collect(Collectors.joining(","));
    }
}
