class Solution {
    public static String longestCommonPrefix(String[] strs) {

        String Temp =  strs[0];


        char[] c = new char[Temp.length()];

        for (int i = 0; i < Temp.length(); i++){

            for (int j = 1; j < strs.length; j++){
                if (i == strs[j].length()) return new String(c).trim();
                if(Temp.charAt(i) != strs[j].charAt(i)) {
                    return new String(c).trim();
                }

            }
            c[i] = Temp.charAt(i) ;
        }



        return new String(c).trim();


    }
}