import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

import com.apple.eawt.AppEvent.QuitEvent;

public class App {
    public static void main(String[] args) throws Exception {

        Undo undo = Undo.getInstance();
        System.out.println("Entrar comandes (.quit=>sortir | .delete => elimina ultima acció | .historic => historic de dades )\n");
        Scanner sc = new Scanner(System.in);
        String currentValue = null;
        String quit = null;
        while(quit == null){
            currentValue = sc.nextLine();
            if(currentValue.toString().equals(".quit")){
                System.out.println("Adeu!");
                quit = "quit";
                break;
            }else if(currentValue.toString().equals(".delete")){
                undo.deleteCommand();
            }else if(currentValue.toString().equals(".historic")){
                undo.history();
            }else{
                undo.addCommand(currentValue);
            }

        }
    }
}
