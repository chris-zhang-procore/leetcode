public class Solution {
    public String convert(String s, int numRows) {
    	
    	if(numRows == 0) return "";
    	
        StringBuilder[] sbs = new StringBuilder[numRows];
        
        for(int i = 0; i < sbs.length; i++) sbs[i] = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
        	//Going down
        	for(int j = 0; j < numRows && i < s.length(); j++) {
        		sbs[j].append(s.charAt(i++));
        	}
        	//Going up
        	for(int j = numRows - 2; j >= 1 && i < s.length(); j--) {
        		sbs[j].append(s.charAt(i++));
        	}
        }
        
        for(int j = 1; j < sbs.length; j++) {
        	sbs[0].append(sbs[j]);
        }
        
        return sbs[0].toString();
    }
}