package conexao;

import connect.ConnectFactory;

public class Conexao {

    public static void main(String[] args) {
        
        try {
            ConnectFactory a = new ConnectFactory();
            a.getConnection();
            System.out.println("Conectado com Sucesso");
            
        } catch (Exception e) {
            System.out.println("Sistema não Conectado");
        }
    }
    
}
