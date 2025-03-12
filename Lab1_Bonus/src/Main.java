import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 6;  // Numărul de noduri
        int k = 3;  // Lungimea clicii
        int[][] a = new int[n + 1][n + 1];  // Matricea de adiacență
        int[][] a_complementara = new int[n + 1][n + 1];  // Matricea complementarea
        int[] ok = new int[1];  // Flag pentru a semnala dacă am găsit o clică
        int[] clica = new int[k + 1];  // Vectorul care va conține nodurile clicii
        int[] set_stabil = new int[k + 1];  // Vectorul care va conține nodurile setului stabil

        // Crează matricea de adiacență random
        Matrice_Random(n, a);

        if(k>n)
        {
            System.out.print("k-ul este mai mare decat n, deci nu exista clica sau set stabil de lungime k");
        }
        else {// Căutăm clică de lungime k
            clica_k(a, k, clica, 1, n, ok);

            // Afișăm rezultatul
            if (ok[0] == 1) {
                System.out.print("Clica de lungime " + k + " este ");
                for (int i = 1; i <= k; i++) {
                    System.out.print(" " + clica[i]);
                }
                ok[0]=0;
            } else {
                System.out.println("Nu exista clica de lungime " + k);
            }
            System.out.println();
            complementar(a,a_complementara,n);
            clica_k(a_complementara, k, set_stabil, 1, n, ok);

            // Afișăm rezultatul
            if (ok[0] == 1) {
                System.out.print("Setul stabil de lungime " + k + " este ");
                for (int i = 1; i <= k; i++) {
                    System.out.print(" " + set_stabil[i]);
                }
            } else {
                System.out.println("Nu exista set stabil de lungime " + k);
            }
        }
    }

    // Generăm matricea de adiacență random
    static void Matrice_Random(int n, int[][] a) {
        Random rand = new Random();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    a[i][j] = 1;  // Pe diagonala principală punem 1
                } else if (j > i) {
                    a[i][j] = rand.nextInt(2); // Altele vor fi 0 sau 1
                    a[j][i] = a[i][j];  // Simetrie pentru matricea de adiacență
                }
            }
        }

        // Afișează matricea de adiacență
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Funcția care caută o clică de lungime k
    static void clica_k(int[][] a, int k, int[] clica, int count, int n, int[] ok) {
        if (ok[0] == 1) return;  // Dacă am găsit deja o clică, ieșim
        for (int i = clica[count - 1] + 1; i <= n; i++) {
            clica[count] = i;

            // Dacă am completat clică de lungime k
            if (count == k) {
                // Verificăm dacă toate nodurile din clică sunt conectate între ele
                boolean esteClica = true;
                for (int j = 1; j < k; j++) {
                    for (int l = j + 1; l <= k; l++) {
                        if (a[clica[j]][clica[l]] == 0) {  // Dacă nu există muchie între j și l
                            esteClica = false;
                            break;
                        }
                    }
                    if (!esteClica) break;
                }

                if (esteClica) {
                    ok[0] = 1;  // Am găsit o clică validă
                }

            }
            else {
                clica_k(a, k, clica, count + 1, n, ok);  // Continuăm căutarea recursivă
            }

            if (ok[0] == 1) return;  // Dacă am găsit o clică, ieșim din funcție
        }
    }

    static void complementar(int[][] a, int[][] a_complementara, int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i!=j) {
                    if (a[i][j] == 1)
                        a_complementara[i][j] = 0;
                    else
                        a_complementara[i][j] = 1;
                }
            }
        }
    }
}
