public class Task5 {
    public static void main (String args[]){
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(3, 6, 2));
        System.out.println(operation(3, 1, 3));
        System.out.println(operation(24, 23236, 2));
    }


    //принимает три числа и возвращает что нужно сделать с a и b, чтобы получить N
    public static String operation(int n, int a, int b){
        if (a+b==n){
            return "сложить";
        } else if (a-b==n){
            return "вычитать";
        }
        else if (a*b==n) {
            return "умножить";
        }else if (a/b==n) {
            return "разделить";
        }
        else{
            return "ничего";
        }
    }
}
