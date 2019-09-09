public class ContainerWithMostWater 
{
    public static int maxArea(int[] height) 
    {
        int i = 0;
        int j = height.length - 1;
        int water = 0;
        
        //The loop will proceed untill the value of i is smaller than j
        while(i < j)
        {
            //water is used to store the maximum value of the water that can be stored inside the container
            //j - i is used to find the width of the container
            //Math.min(height[i],height[j]) is used to find the max amount of water that the given container can hold
            water = Math.max(water,(j - i) * Math.min(height[i],height[j]));
            
            //Height[i] < height[j] then the value of i ie front side of the container is incremented
            if(height[i] < height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        
        return water;
    }

    public static void main(String[] args) 
    {
        //Array represents the height of the multiple containers
        int arr[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));
    }
}