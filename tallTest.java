public class tallTest {
    public static void main(String []args) {
        int x = 5;
        String m = null;
        int[] intArr = {1, 2, 3, 4};

        for (int i = 0; i < intArr.length; i++){
            x += 1;
        };

        if (x > 5) {
            m = "Jeg var liten ass";
        } else if (x == 5){
            m = "Det var bra ass";
        } else {
            m = "Jeg er svær ass";
        }
        System.out.println(m);
    }
}
