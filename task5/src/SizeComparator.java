import java.util.Comparator;

public class SizeComparator implements Comparator<Contact> {
    public int compare(Contact c1, Contact c2) {
        if(c1.telNumbs.size() == c2.telNumbs.size()){
            return 0;
        } else if(c1.telNumbs.size() < c2.telNumbs.size()){
            return 1;
        }else {
            return -1;
        }
    }
}
