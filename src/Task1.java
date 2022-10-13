public class Task1 {
    public static void main (String args[]){
        System.out.println(remainder(5, 5));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
    }

    //метод, который возвращает остаток
    public static int remainder(int n1, int n2){
        return n1%n2;
    }
}
