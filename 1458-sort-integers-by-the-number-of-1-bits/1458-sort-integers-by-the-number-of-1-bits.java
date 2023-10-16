class Solution {
    public int[] sortByBits(int[] arr) 
    {
        int[] ones = new int[arr.length];
        for(int i=0;i<ones.length;i++)
        {
            int n = arr[i];
            int counting = 0;
            while(n!=0)
            {
                if((n&1) == 1)
                {
                    counting+=1;
                }
                n=n>>1;
            }
            ones[i] =counting;
        }
       // System.out.println(Arrays.toString(ones));
        for(int j=ones.length-1;j>0;j--)
        {
            for (int i = 0; i < j; i++)
            {
                if (ones[i] == ones[i + 1])
                {
                    if (arr[i] > arr[i + 1])
                    {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;

                        int temp2 = ones[i];
                        ones[i] = ones[i+1];
                        ones[i+1] = temp2;
                    }
                }
                if (ones[i] > ones[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    int temp2 = ones[i];
                    ones[i] = ones[i+1];
                    ones[i+1] = temp2;
                }
            }
        }
        return arr;
    }
}