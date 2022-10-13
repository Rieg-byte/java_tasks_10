public class Task3 {
    public static void main (String args[]){
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
    }

    //метод, который возвращает общее количество ног всех животных
    public static int animals(int a, int b, int c){
        return a*2+b*4+c*4;
    }
}

