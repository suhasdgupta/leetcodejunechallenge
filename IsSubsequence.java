class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int is=0,it=0;
        while(it<t.length()){
            if(t.charAt(it)==s.charAt(is)){
                is++;
                if(is==s.length()) return true;
            }
            it++;          
        }
        return false;
    }
}
