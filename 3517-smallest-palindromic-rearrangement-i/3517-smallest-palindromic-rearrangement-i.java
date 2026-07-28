class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length(); 
        char arr[] = s.toCharArray(); 
        List<Character> ls =new ArrayList<>(); 
        if(n==1){
            return s; 
        }
        Arrays.sort(arr , 0, n/2); 
        for(int i =0 ; i<n/2; i++){
            ls.add(arr[i]); 
        }
        if(n%2==0){
            Arrays.sort(arr,n/2,n); 
            for(int i =n-1; i>(n-1)/2; i--){
                ls.add(arr[i]); 
        } 
        }
        else{
            Arrays.sort(arr,(n+1)/2 , n); 
            ls.add(arr[n/2]); 
            for(int i =n-1; i>n/2; i--){
                ls.add(arr[i]); 
        }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : ls) {
            sb.append(c);
        }
        return sb.toString();
    }
}