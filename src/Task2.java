public class Task2 {
    public static void main (String args[]){
        System.out.println(triArea(3, 2));
        System.out.println(triArea(10, 10));
    }
    //метод, который возвращает площадь треугольника
    public static int triArea(int a, int h){
        return (a*h)/2;
    }
}
