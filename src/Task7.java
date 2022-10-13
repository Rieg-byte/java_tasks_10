public class Task7 {
    public static void main (String args[]){
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
    }

    /*
    метод, который берет последнее число из последовательного списка
    чисел и возвращает сумму всех чисел до него и включая его.
     */
    public static int addUpTo(int x) {
        int result=0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }
}
