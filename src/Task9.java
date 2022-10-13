public class Task9 {
    public static void main (String args[]){
        System.out.println(sumOfCubes(new int[]{1, 5, 9}));
        System.out.println(sumOfCubes(new int[]{2}));
        System.out.println(sumOfCubes(new int[]{}));
    }


    /*
    метод, который получает на вход массив чисел и возвращает сумму его кубов
     */
    public static int sumOfCubes(int[] x) {
        int sum = 0;
        for (int i=0; i<x.length; i++){
            sum += (x[i]*x[i]*x[i]);
        }
        return sum;
    }
}
