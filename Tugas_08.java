import java.util.Scanner;

public class Tugas_08 {

    public static int totalRekursif(int[] angka, int index) {
        if (index < 0) {
            return 0;
        }
        return angka[index] + totalRekursif(angka, index - 1);
    }

    public static int totalIteratif(int[] angka) {
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();
        int[] angka = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        int totalRek = totalRekursif(angka, N - 1);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + totalRek);

    }
}
