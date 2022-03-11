public class ExArray {
    public static void main(String [] args) {
        int [] numere = new int[5];
        numere[1] = 40;
        //numere[6] = 50; => ArrayIndexOutOfBoundsException
        System.out.println(numere[0]+" "+numere[1]);
        
        for(int i = 0; i < numere.length; i++) {
            numere[i] = i+1; //populez array-ul cu valori de la 1 la 5
        }
        
        for(int elem:numere) {
            System.out.println(elem);
        }
        
        /* Python
         * for elem in numere:
         *  print(elem)
         * Java
         * lista.forEach(lamba de tip consumator)
         */
        
        //Sa se calculeze media varstelor angajatilor
        Angajat [] angajati = new Angajat[3];
        angajati[0] = new Angajat("Mihai",34);
        angajati[1] = new Angajat("Ionut",23);
        angajati[2] = new Angajat("Dana",40);
        
        double suma = 0;
        for(int i = 0; i < angajati.length; i++) {
            suma += angajati[i].varsta;
        }
        /*for(int angajat : angajati) {
            suma += angajat.varsta;
        }*/
        double media = suma / angajati.length;
        System.out.println(media);
        
        //EX MATRICE
        int [][] matrice = new int[3][];
        matrice[0] = new int[4];
        matrice[1] = new int[2];
        matrice[2] = new int[3];
        
        //populam matricea cu elem egale cu suma indecsilor/coordonatelor
        for(int i = 0; i < matrice.length; i++) {
            for(int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = i + j;
            }
        }
        
        for(int [] arr : matrice) {
            for(int elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        
        int [] vector = {34,23,10,57};
        int [] vector2 = new int[]{34,23,10,57};
        //int [] vector3 = new int[4]{34,23,10,57}; !!!
        int [][] matrice2 = {{56,23,12},{34},{78,45}};
        
         for(int [] arr : matrice2) {
            for(int elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}