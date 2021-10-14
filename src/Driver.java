public class Driver {
    public static void main(String[] args) {
        for(int i = 101; i <= 999; i+=2) {
            String s = "" + i;
            int n1 = Integer.parseInt(s.substring(0, 1));
            int n2 = Integer.parseInt(s.substring(1, 2));
            int n3 = Integer.parseInt(s.substring(2, 3));

            int sum = n1 + n2 + n3;

            if (sum == 15) {
                //System.out.println("sum: " + i);
                if(n1 % 2 != 0 && n2 % 2 != 0 && n3 % 2 != 0) {
                    //System.out.println("odd digits: " + i);
                    if(n1 < n2 && n2 < n3) {
                        System.out.println("ascending: " + i);
                        if(i % 7 == 0)
                            System.out.println(i);
                    }
                }
            }

        }

    }
}
