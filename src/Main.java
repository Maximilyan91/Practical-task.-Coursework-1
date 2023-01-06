public class Main {

    public static void squaring(int num) {
        if (num != 0) {
            num = num * num;
            System.out.println("num в квадрате = " + num);
        }else{
            System.out.println("Ноль в квадрат не возводится!!!");
        }

    }
    public static void main(String[] args) {
     squaring(5);
    }
}