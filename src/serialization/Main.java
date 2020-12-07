
package serialization;

import java.io.InvalidObjectException;

public class Main {
    

    public static void main(String[] args) {

//        Notebook notebook = new Notebook();
//        notebook.setName("Smythson");
//
//        Serializator serializator = new Serializator();
//       System.out.println(serializator.serialization(notebook));
        Serializator serializator = new Serializator();
        try {
            Notebook notebook = serializator.deserialization();
            System.out.println(notebook.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
