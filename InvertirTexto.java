import java.util.Scanner;

public class InvertirTexto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String texto = sc.nextLine();

        StringBuilder invertido = new StringBuilder(texto);
        invertido.reverse();

        System.out.println("Cadena invertida: " + invertido);

        sc.close();
    }
}
