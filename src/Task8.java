public class Task8 {
    public static void main (String args[]){
        System.out.println(nextEdge(9, 2));
        System.out.println(nextEdge(3, 6));
    }

    /*
    метод, который находит максимальное значение третьего ребра
    треугольника, где длины сторон являются целыми числами.
     */
    public static int nextEdge(int n1, int n2) {
        int maxC = 0;
        for (int i=1; i<=n1+n2; i++){
            if ((n1+n2>i)&&(n1+i>n2)&&(i+n2>n1)){
                if (i>maxC){
                    maxC = i;
                }
            }
        }
    return maxC;
    }
}
