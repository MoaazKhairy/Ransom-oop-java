import java.util.HashMap;

public class RansomNotes {
    public static boolean ransomNote(String magazine, String massage) {
        if (massage == null || massage.isEmpty()) {
            return true;
        }
        
        if (magazine == null || magazine.isEmpty()) {
            return false;
        }
        
        HashMap<Character, Integer> myHash = new HashMap<Character, Integer>();
        for(int i = 0; i < magazine.length(); i++) {
            if(myHash.containsKey(magazine.charAt(i))) {
                myHash.put(magazine.charAt(i), myHash.get(magazine.charAt(i)));
            } else {
                myHash.put(magazine.charAt(i), 1);
            }
        }
        
        for(int i = 0; i < massage.length(); i++) {
            Integer frequency = myHash.get(massage.charAt(i));
            if(frequency == null || frequency == 0) {
                return false;
            } else {
                myHash.put(massage.charAt(i), myHash.get(massage.charAt(i)) - 1);
            }   
        }
        return true;      
    }
		public static void main(String[] args) {
		// write your code here
	        boolean x= ransomNote("moaz" , "");
	        System.out.println("Output is : "+ x);
	    }
}
