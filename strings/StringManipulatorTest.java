public class StringManipulatorTest{
    public static void main (String[] args){

        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat(" Hello ", " World ");
        System.out.println(str); 
    
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); 
        System.out.println(b);
        System.out.println(c); 

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer one = manipulator.getIndexOrNull(word, subString); 
        Integer two = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(one); 
        System.out.println(two);

        String test = manipulator.concatSubstring("Hello",1,2,"world");
        System.out.println(test);
    }   
}