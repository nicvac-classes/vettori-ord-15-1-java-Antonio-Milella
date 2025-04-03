import java.util.Scanner;
import java.lang.Math;

public class Eseercizio {
    public static Random rand = new Random();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;
        
        do {
            System.out.println("Inserisci un valore intero per N");
            n = Integer.parseInt(in.nextLine());
        }
        while (n <= 1);
        String[] a = new String[n];
        int[] p = new int[n];
        
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Inserisci un nome per la macchina numero " + (i + 1));
            a[i] = in.nextLine();
        }
        impostaVettoreRandom(p, n);
        visualizzaVettore(a, p, n);
        bubbleSort(a, p, n);
        visualizzaVettore(a, p, n);
    }
    
    public static void visualizzaVettore(String[] v, int[] w, int nv) {
        int i;
        
        for (i = 0; i <= nv - 1; i++) {
            System.out.println("Automobile " + v[i] + " Posizione: " + w[i]);
        }
    }
    
    public static void impostaVettoreRandom(int[] v, int nv) {
        int i;
        
        for (i = 0; i <= nv - 1; i++) {
            v[i] = rand.nextInt(nv * 10);
        }
    }
    
    public static void bubbleSort(String[] v, int[] w, int nv) {
        boolean scambio;
        int i, j, t, confronti;
        String st;
        
        i = 0;
        confronti = 0;
        scambio = true;
        while (i <= nv - 1 && scambio == true) {
            j = 0;
            scambio = false;
            while (j <= nv - 2 - i) {
                if (w[j] > w[j + 1]) {
                    st = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = st;
                    t = w[j];
                    w[j] = w[j + 1];
                    w[j + 1] = t;
                    scambio = true;
                }
                confronti = confronti + 1;
                j = j + 1;
            }
            i = i + 1;
        }
        System.out.println("Versione utilizzata del bubble sort: SUPER Ottimizzato");
        System.out.println("Numero confronti: " + confronti);
    }
}
