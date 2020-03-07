// Javier Rubio
public class sortOfSort {
    public static void sortOfSort(int[] nums) {
        int lowIndex= 0;
        int highIndex = nums.length-1;
        int maximum = Integer.MIN_VALUE;
        int indexCurrent = 0;
        int count = 0;
        int swap = 0;
        for(int i = 0; i < nums.length-1; i++){
            
            maximum = Integer.MIN_VALUE;
            
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
