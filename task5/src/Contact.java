import java.util.ArrayList;

public class Contact{

    String name;
    ArrayList<String> telNumbs;
    public Contact(String name, ArrayList<String> telNumbs){
        this.name = name;
        this.telNumbs = telNumbs;
    }
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(name).append(" : ");
        sb.append(telNumbs);
        return sb.toString();
    }

}
