///This is solution for LeetCode Problem 11
class ContainerWater {
    public static int maxArea(int[] height) {
        int maxarea=0,l=0,r=height.length-1;
        while(l<=r){
            int water=Math.min(height[l],height[r]);
            int width=r-l;
            int area=width*water;
            maxarea=Math.max(area,maxarea);
            if(height[l]<=height[r]){ 
                l++;
             }
             else{
                r--;
             }
        }
        return maxarea;
        
    }
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.print(maxArea(height));
    }
}