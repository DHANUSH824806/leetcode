///leetcode sum :14 longest prefix sum
class longestprefix {
    public static  String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0) return "";
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;

    }

   public static void main(String args[]){
    String[] nums={"flower","flow","flight"};
    String ans=longestCommonPrefix(nums);
    System.out.println(ans);

}
}