public class Main {
    public static void main(String[] args) {
        int original[] = {5,4,-7,-2,-1};
        int reversed[] = new int [original.length];

        for (int n=0;n<5;n++)
            reversed[0+n] = original[4-n];

        System.out.print("Reversed:");

        for (int i=0;i<original.length;i++)
        System.out.print(reversed[i] + " ");
    }
}