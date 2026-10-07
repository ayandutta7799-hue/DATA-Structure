class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index={0,0};
        int i=0;
        int j=numbers.length-1;
        int sum=0;
        while(true){
            sum=numbers[i]+numbers[j];
            if(sum==target){
                index[0]=i+1;
                index[1]=j+1;
                break;
            }
            if(sum<target){
                i++;
            }
            if(sum>target){
                j--;
            }
            
        }
        return index;

    }
}