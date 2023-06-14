package prueba_chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Hola! Soy un chat bot. ¿En qué puedo ayudarte?");

        while (true) {
            String userInput = scanner.nextLine();
            String response = generateResponse(userInput);
            System.out.println(response);
        }
    }

    public static String generateResponse(String userInput) {
        String response;

        if (userInput.contains("hola master") || userInput.contains("Hola master")) {
            response = "¡Hola carnalillo! ¿que tranza en que puedo ayudarte papu?";
        }
        else if (userInput.contains("C") || userInput.contains("necesito que me menciones 5 musicas de los 80")) {
            response = "de que grupo de los 80' te gustaria sus musicas";
        }
        else if (userInput.contains("hay un grupo que no me acuerdo su nombre pero la musica hay una parte que dicen brother louie")
                || userInput.contains("hay un grupo que no me acuerdo su nombre pero la musica hay una parte que dicen brother louie")) {
            response = "oh no hermanooo " + "escuchas a cada rato es musica pero ya se cual es";
        }
        else if (userInput.contains("cual es ")
                || userInput.contains("cual es:")) {
            response = "el grupo que canta eso se llama Modern Talking";
        }
        else if (userInput.contains("a ese es el grupo muchas gracias")
                || userInput.contains("a ese es el grupo muchas gracias")) {
            response = "de nada carnalillo";
        }
        else if (userInput.contains("pero te olividaste algo")
                || userInput.contains("pero te olividaste algo")) {
            response = "a si me olvide de las lista de musicas de tu grupo de los 80'";
        }
        else if (userInput.contains("tu cuales crees que son las mejores")
                || userInput.contains("tu cuales crees que son las mejores")) {

            response = "mmmm" +
                    "- Modern Talking - Brother louie" +
                    "- Modern Talking - Chery chery" +
                    "- modern Talking - Hey you" +
                    "- modern Talking - Atlantis is calling" +
                    "- Modern Talking - Just me two";
        }
        else {
            response = "de nada vuelve la proxima o cuando gustes";
        }
        return response;
    }
}

