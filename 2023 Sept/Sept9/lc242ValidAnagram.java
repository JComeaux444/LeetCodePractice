package Sept9;

class Solution {
    public boolean isAnagram(String s, String t) {

        // make the strings into arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        // sort the arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        // compare if they are the same and retrun true or false
        return Arrays.equals(sChars, tChars);


        /* Works but is real slow
        if( s.length() != t.length() ){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            //System.out.println("before: "+t);
            if ( t.indexOf(s.charAt(i) ) >= 0 ){
                t = t.replaceFirst("(?:"+s.charAt(i)+")","");
            } else {
                return false;
            }
            //System.out.println("after: "+t+"\n");
        }
        return true;
        */
    }
}