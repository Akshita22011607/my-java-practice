package predefindclass_StringClass;
public class SplitReverseString {
//program to splite reverse of of word in String(1st word my,2nd name,3rd id 4th akshita) 
    public String splitReverse(String s1) {//creat method with String parameter n return type
        String[] words = s1.split(" "); //step 2 split sentence into words on basis of space "_"
  
//for loop to prints each word.//means ek ek word print karna hai jo split hua uske liye(my,name,is,akshita)
        String result = ""; // result,final reversed word//empty string variable to store split reverse value
        for (int i = 0; i < words.length; i++) {//outer for loop to print Splited words
            String word = words[i];//each word 1st i = my,2nd name,3rd is,4th akshita
     
// for loop to reverse each word (1st word my,2nd name,3rd id 4th akshita)//so it will reverse each word only
            String reverse = "";//store value of reverse String or reverse each word like my reverse to ym
            for (int j = word.length() - 1; j >= 0; j--) {//inner for loop to reverse each splited words
                reverse = reverse + word.charAt(j);//word ka last char + second last char-->last,secondlast+thirdlast
            }
            result = result + reverse + " "; //final result =  add reversed word to result
  //_+ym--> ym+eman-->ym eman+si--> ym eman si+atihska-->ym eman si atihska -->loop complente n print this value
        }
        return result; // because we gave method return type thats why need to give return statement.
    }
    public static void main(String[] args) {
        SplitReverseString obj = new SplitReverseString();//objectcreat to call method
        String sentence = "All Is Well";//step 1
        System.out.println("Original String: " + sentence);//print orignal String
        String reversed = obj.splitReverse(sentence);//call method
        System.out.println("Reversed Words of String: " + reversed);//print result
    }
}
