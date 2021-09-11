class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        boolean found = false;
        for(int ele: arr)
        {
            set.add(sum);
            sum += ele;
            if(set.contains(sum))
            {
                found = true;
                break;
            }
        }
        return found;
    }
}
