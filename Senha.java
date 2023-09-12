import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner entrada_dados = new Scanner(System.in);
        String senha, username;

        System.out.println("Informe o seu username: ");
        username = entrada_dados.nextLine();
        System.out.println("Olá "+username+"!");

        System.out.println("Infome sua senha: ");
        senha = entrada_dados.nextLine();

        //senha.matches serve para saber se a condição que vem a frente, funcionou, ou foi atendida.
        //no codigo abaixo, serve para determinar que uma senha deve ter obrigatoriamente 8 ou mais caracteres.

        if(senha.length()>= 8 && senha.matches("([a-z].+)([0-9].+)([A-Z].+)")){ //regex ou expressão regular
            System.out.println("Senha salva com sucesso!");
        }else{
            if(senha.length()<8){
                System.out.println("Senha invalida! Deve ter no minimo 8 caracteres.");
            }else{
                System.out.println("Senha invalida! Você deve digitar a palavra-chave com as letras: a, b, c, d.");
            }

            entrada_dados.close();
        }
    }
}
