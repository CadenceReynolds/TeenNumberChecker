public class main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        if(num1 >= 12 && num1 <= 19){
            return true;
        } else if(num2 >= 12 && num2 <= 19){
            return true;
        } else return num3 >= 12 && num3 <= 19;
    }
}
