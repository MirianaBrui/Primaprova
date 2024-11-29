package NumeroDuplicati;

public class duplicati {

	public static void main(String[] args) {
		 // Dichiarazione dell'array di numeri interi
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1, 8};

        System.out.print("duplicati: ");
        

        
        for (int i = 0; i < array.length; i++) { //utilizzo il ciclo for per confrontare ogni elemento dell'arrey con gli altri
           
            for (int j = i + 1; j < array.length; j++) { //scorro ogni elemento dell'array
                if (array[i] == array[j]) { //controllo se gli elementi sono uguali
                    System.out.print(array[i] + " ");
                    
                    break; // stampo il numero duplicato una sola volta
                }
            }
        }

      
        }
		
	}


