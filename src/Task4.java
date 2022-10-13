public class Task4 {
    public static void main (String args[]){
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
    }

    //метод, который принимает три аргумента
    //возвращает true если a*b>c и false, если иначе
    public static boolean profitableGamble(double a, int b, int c){
        return a * b > c;
    }
}
