import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para capturar dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitação dos dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine(); // Limpeza do buffer
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo (use vírgula ou ponto):");
        String saldoString = scanner.next();
        
        // Substituir vírgula por ponto para garantir compatibilidade
        saldoString = saldoString.replace(",", ".");
        double saldo = Double.parseDouble(saldoString);
        
        // Exibição da mensagem final utilizando concatenação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
                          " já está disponível para saque.";
        
        System.out.println(mensagem);
        
        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}