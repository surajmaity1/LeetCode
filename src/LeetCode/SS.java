package LeetCode;

public class SS {
    //https://leetcode.com/problems/stamping-the-sequence/
    public int[] movesToStamp(String stamp, String target) {
        int tl = target.length();
        int sl = stamp.length();

        if(tl < sl || tl == 0){
            return new int[]{};
        }

        int len = 10 * tl;
        String s = "";

        for(int i = 0; i<tl; i++){
            s += "?";
        }

        for (int i = 0; i < sl; i++) {

            for (int j = i+1; j < sl; j++) {
                s = replace(s, stamp, j, sl-1);
                if(s.equals(target)){

                }
            }
        }
        return new int[]{};
    }

    public String replace(String s, String stamp,int si, int sl){
        char[] arr = s.toCharArray();
        int j = 0;

        for(int i = si; i <= sl; i++){
            arr[i] = stamp.charAt(j++);
        }

        return new String(arr);

    }
}
