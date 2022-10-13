public class Task10 {
    public static void main (String args[]){
        System.out.println(abcmath(5, 2, 1));

    }

    //метод который добавляет a b раз и возвращает true, если сумма a делится на c
    public static boolean abcmath(int a, int b, int c) {
        for (int i=0; i<b; i++){
            a += a;
        }
        return a % c == 0;
    }
}
