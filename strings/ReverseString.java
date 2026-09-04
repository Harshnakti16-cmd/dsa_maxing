public class ReverseString {
    
    public static void reverse(char[] ch){

        int left = 0;
        int right = ch.length -1;

        while(left < right){

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        for( char c : ch ){
            System.out.print(c + " ");
        }
    }
    
    public static void main(String[] args){

        char[] ch = {'h','a','r','s','h'};
        reverse(ch);
    }
}
