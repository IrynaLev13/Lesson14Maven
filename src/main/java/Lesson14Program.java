import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Lesson14Program {
    public static void main(String[] args) {
int [] array = {12, 15, 3, 6, 8};
System.out.println(Arrays.toString(array));
        ArrayUtils.reverse(array);
        System.out.println(Arrays.toString(array));


    }



}
