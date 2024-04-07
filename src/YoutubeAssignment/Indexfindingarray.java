package YoutubeAssignment;

public class Indexfindingarray {

    public static void main(String[] args) {

        int[] pa = {2, 5, 1, 9, 6};
        int max = pa[0];  // Initialize max to the first element of the array
        int index = 0;    // Initialize index to store the index of the maximum value

        int currentIndex = 0;  // Initialize a variable to keep track of the current index

        // Iterate over each element 'a' in the array 'pa'
        for (int a : pa) {
            // Check if the current element 'a' is greater than the current maximum 'max'
            if (max < a) {
                max = a;            // If 'a' is greater, update 'max' to 'a'
                index = currentIndex;  // Update 'index' to the current index 'currentIndex'
            }
            // Print the current index and value
            //System.out.println("Index: " + currentIndex + ", Value: " + a);
            // Increment 'currentIndex' to move to the next index
            currentIndex++;
        }

        // Print the maximum value found and its corresponding index
        System.out.println("Maximum value: " + max + " at index: " + index);
    }
}
