


public class Main {

    public static void main(String[] args) {
        String[] arr = new String[100];
        arr[0] = "1";
        arr[1] = "101";
        arr[2] = "1001";


        for (int i = 3; i < 2030; i++) {
            if(zero(arr) == 3){
//                arr[i-1] += "101";
                System.out.println(3);
            }
            else if(zero(arr) == 2) {
//                arr[i-1] += "100";
                System.out.println(2);
            }
            else if(zero(arr) == 1){
//                arr[i-1] += "10";
                System.out.println(1);
            }
        }

//        System.out.println(arr);

    }




    public static int zero(String[] arr) {
        if (arr[0].equals(arr[1]) && arr[1].equals(arr[2])){
            return 3;
        }
        else if(arr[1].equals(arr[2])){
            return 2;
        }
        else {
            return 1;
        }
    }

    public static int findNum(int a, int b, String[] arr){
        int sum = 0;
        for (int i = a-1; i < b; i++) {
            if (arr[i].equals("1") || arr[i].equals("101") || arr[i].equals("1001")){
                sum++;
            }
        }
        return sum;
    }

}
