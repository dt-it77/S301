import java.util.ArrayList;

public final class Undo {

    private static Undo instance;
    private ArrayList<String> comandes = new ArrayList<String>();

    private Undo() {
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }
    public void addCommand(String comand){
        comandes.add(comand);

    }
    public void deleteCommand(){
        System.out.println("Elimina comanda: " + (comandes.size()-1));
        comandes.remove(comandes.remove(comandes.size()-1));
    }
    public void history(){
        System.out.println("Historial de comandes: ");
        comandes.forEach(x->System.out.println(x));
    }
}