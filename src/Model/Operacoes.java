
package Model;

import javax.swing.JOptionPane;

public class Operacoes {
      
    public static void OpLogin(){
        
    String log = View.Login_GUI.login.getText();
    String sen = View.Login_GUI.senha.getText();

        if(log.equals("fabio") && sen.equals("etec")){
            JOptionPane.showMessageDialog(null,"Bem vindo ao sistema");
        }else{
            JOptionPane.showMessageDialog(null,"Usuario ou senha incorreto \nSistema será fechado");
            System.exit(0);
    } 
    
    
    
    }
}
