import java.util.Scanner;

public class ContadorTexto {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese una palabra en minúsculas: ");
        String texto = lector.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (char letra : texto.toCharArray()) {

            if ("aeiou".contains(String.valueOf(letra))) {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);

        lector.close();
    }
}
