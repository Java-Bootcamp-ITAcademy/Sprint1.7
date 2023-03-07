/*** S1.7 Nivell 2 i 3 exercici 1 ***/
package n2n3exercici1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchMethodException {
        ObjecteSerialitzable objecteSerialitzable=new ObjecteSerialitzable("Toni","Llombart");
        objecteSerialitzable.serialitzador(objecteSerialitzable);



    }
}
