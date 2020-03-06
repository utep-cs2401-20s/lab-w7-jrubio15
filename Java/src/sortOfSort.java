// Javier Rubio
public class sortOfSort {
    public static void sortOfSort(int[] nums) {
        //The smallest variable
        int lowIndex= 0;
        //The highest variable
        int highIndex = nums.length-1;
        //This variable hold the highest value
        int maximum = Integer.MIN_VALUE;
        //Index of the current highest
        int indexCurrent = 0;
        //the variable's position
        int count = 0;
        //swapping the variables
        int swap = 0;

        for(int i = 0; i < nums.length-1; i++){
            //Resetting the max
            maximum = Integer.MIN_VALUE;
            //Updating
            indexCurrent = i;

            //Finding the max variable
            for(int j = lowIndex ; j <= highIndex; j++){
                if(nums[j] > maximum){
                    maximum = nums[j];
                    indexCurrent = j;
                }
            }
            if(lowIndex < highIndex) {
                //Moving the largest variable at the end
                if (count < 2) {
                    swap = nums[highIndex];
                    nums[highIndex] = maximum;
                    nums[indexCurrent] = swap;
                    count++;
                    highIndex--;
                }
                //Moving the largest variable at the beginning
                else if (count < 4) {
                    swap = nums[lowIndex];
                    nums[lowIndex] = maximum;
                    nums[indexCurrent] = swap;
                    count++;
                    lowIndex++;
                }
            }
            //Resetting the counter
            if(count == 4){
                count = 0;
            }
        }
    }
}
