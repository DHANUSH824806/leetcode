// LeetCode Problem :371
//Add number without addition and subtraction operators
class Sumoftwo  {
    public static int getSum(int a, int b) {
        if(b>0){
            while(b-->0){
                a++;
            }
        }
        else{
            while(b++<0){
                a--;            }
        }
        return a;
    }
    public static void main(String[] args) {
        //You can give any number as a input
        int a=20;
        int b=11;
        System.out.println(getSum(a,b));

        
    }
}