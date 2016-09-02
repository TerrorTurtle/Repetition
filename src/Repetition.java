/**
 * Created by leca14 on 2016-09-02.
 */
public class Repetition {
    public static void main(String[]args){
       int[] jazzArray;

        jazzArray = new int[3];

        jazzArray[0] = 80;
        jazzArray[1] = 85;
        jazzArray[2] = 90;
        jazzArray[3] = 100;

        System.out.println("Elements in Jazz");
        for (jazzArray = 0; jazzArray < jazzArray.length; jazzArray++){
            System.out.println(jazzArray[jazzArray]);
        }

    }
}
