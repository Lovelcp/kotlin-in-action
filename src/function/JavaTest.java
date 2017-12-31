package function;

import java.util.Arrays;

public class JavaTest {
    public static void main(String[] args) {
        String str = JoinTestKt.joinToString(Arrays.asList(1, 2, 3));
        System.out.println(str);
    }
}
