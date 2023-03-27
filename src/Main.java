public class Main {
    public static void main(String[] args) {


        int count  =1;
        while (count<=10) {

            System.out.println(count % 2 == 1 ? "*****" : "++++++++");
            count++;
        }


        int row = 9;
        while (row >= 1) {
            int column = 1;
            System.out.println(row);
            while (column <= 9) {
                System.out.println(row % 2 == 1 ? "<" : ">");
                for (int ctr = 1; ctr < column; ctr++) {
                    System.out.print("  ");
                }

            }
        }
    }
}
