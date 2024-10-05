class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int length1=s1.length()-1;
        int length2=s2.length()-1;
        HashMap<Character,Integer> comp=new HashMap<>();
        for(int i =0;i<=length1;i++)
        {
             comp.put(s1.charAt(i),comp.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<=length2-length1;i++)
        {
           HashMap<Character,Integer> map = new HashMap<>(); 
           for(int j=i;j<=i+length1;j++)
           {
            map.put(s2.charAt(j),map.getOrDefault(s2.charAt(j),0)+1);
           }
           if(comp.equals(map))
           {
            return true;
           }
        }
        return false;
    }
}
/*class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        
        if (length1 > length2) {
            return false; // s1 cannot be a permutation of a shorter string
        }
        
        // Create frequency counts for s1 and the first window in s2
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        
        // Initialize the frequency counts for s1 and the first window of s2
        for (int i = 0; i < length1; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        
        // Compare the two frequency arrays for the first window
        if (matches(s1Count, s2Count)) {
            return true;
        }
        
        // Slide the window over s2
        for (int i = length1; i < length2; i++) {
            // Add the new character to the window
            s2Count[s2.charAt(i) - 'a']++;
            // Remove the old character from the window
            s2Count[s2.charAt(i - length1) - 'a']--;
            
            // Check if the current window matches s1's character frequencies
            if (matches(s1Count, s2Count)) {
                return true;
            }
        }
        
        return false;
    }
    
    // Helper method to compare two frequency arrays
    private boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) {
                return false;
            }
        }
        return true;
    }
}*/