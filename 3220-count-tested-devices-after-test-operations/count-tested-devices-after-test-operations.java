class Solution {
    public int countTestedDevices(int[] batteryPercentages) 
    {
        int count = 0;
        for(int i=0;i<batteryPercentages.length;i++)
        {
            if(batteryPercentages[i] > 0)
            {
                count = count+1;
            }
            else
            {
                continue;
            }
            for(int j=i+1;j<batteryPercentages.length;j++)
            {
                if(batteryPercentages[j] > 0)
                {
                    batteryPercentages[j] = batteryPercentages[j] - 1;
                }
            }
        }

        return count;
    }
}