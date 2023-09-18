import java.util.HashMap;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> contacts = new HashMap<>();

        addContact("Ivanov", "89038754154", contacts);
        addContact("Ivanov", "89038754155", contacts);
        addContact("Petrov", "89088754155", contacts);
        addContact("Petrov", "89088754158", contacts);
        addContact("Sidorov", "89023658974", contacts);
        addContact("Sidorov", "89023656774", contacts);
        addContact("Sidorov", "89023658000", contacts);
        addContact("Ivanov", "89038758955", contacts);
        addContact("Ivanov", "89098758955", contacts);
        ArrayList<Contact> contactsList = new ArrayList<>();
        for(var o: contacts.entrySet()){
            Contact contact;
            contact = new Contact(o.getKey(), o.getValue());
            contactsList.add(contact);
        }
        SizeComparator comparatorContacts = new SizeComparator();
        contactsList.sort(comparatorContacts);
        for(var o: contactsList) {
            System.out.println(o);
        }
    }
    public static void addContact(String name, String numTel, HashMap<String, ArrayList<String>> contacts){
        ArrayList<String> numbersTel = new ArrayList<>();
        if(contacts.containsKey(name)){
            contacts.get(name).add(numTel);
            // System.out.println(contacts.get(name));
            contacts.put(name, contacts.get(name));
        } else {
            numbersTel.add(numTel);
            contacts.put(name, numbersTel);
        }

    }

}