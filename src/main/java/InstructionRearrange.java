public class InstructionRearrange {

    static int result;
    static int num = 0;
    static boolean flag = false;

    public static void foo1() {

        if (flag) {
            result = num + num;
        } else {
            result = 1;
        }

    }

    public static void foo2() {
        num = 2;
        flag = true;
    }

    /** Result 可能值为0 **/
    public static void main(String[] args) {
        new Thread(() -> foo2()).start();
        new Thread(() -> foo1()).start();
        System.out.println("Result = " + result);
    }

}
