import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};

        for(int i = 0; i < array.length / 2; i++) {
            var temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));

        List<Integer> listForReverse  = Arrays.asList(array);
        Collections.reverse(listForReverse);
        System.out.println(listForReverse.toString());
    }
}