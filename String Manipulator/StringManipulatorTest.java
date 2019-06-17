public class StringManipulatorTest{
    public static void main (String[] args){

        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat(" Hello ", " World ");
        System.out.println(str); 
    
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Hello", letter);
        Integer b = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); 
        System.out.println(b); 

        String word = "Hello";
        String subword = "llo";
        String subword2 = "ang";
        Integer one = manipulator.getIndexOrNull(word, subword); 
        Integer two = manipulator.getIndexOrNull(word,subword2);
        System.out.println(one); 
        System.out.println(two); 

        String test = manipulator.concatSubstring("Hello",1,2,"world");
        System.out.println(test);
    }   
}