public class TnsJava_12_7_24
{
    public static void main(String[] args) {
        System.out.println("Today's Topic to be Covered:");
        for (int k = 5; k < 15; k++) {
            //odd number skipped
            if (k % 2 != 0) {
                continue;
            } else {
                break;
            }
        }
    }
}