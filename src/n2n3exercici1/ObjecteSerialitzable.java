/*** S1.7 Nivell 2 i 3 exercici 1 ***/
package n2n3exercici1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ObjecteSerialitzable {
    private String nom;
    private String cognom;

    public ObjecteSerialitzable(String nom, String cognom) {  //Constructor
        this.nom=nom;
        this.cognom=cognom;
    }

    public String getNom() {
        return nom;
    }  //Getters and Setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    @Serialitzable  //
    public void serialitzador(ObjecteSerialitzable objecteSerialitzable) throws IOException, NoSuchMethodException {  //This method serializes an instance and copies it to a given file
        String annotationValue=getClass().getMethod("serialitzador",ObjecteSerialitzable.class).getAnnotation(Serialitzable.class).directori();  //Getting annotation value through Reflector
        System.out.println(annotationValue);  //Printing annotation value so we are proving we are able to read annotation during runtime

        ObjectMapper objectMapper=new ObjectMapper();  //Allows writing/reading JSON
        String json=objectMapper.writeValueAsString(objecteSerialitzable);  //Generating json
        File f=new File(annotationValue);
        FileWriter fileWriter= new FileWriter(f);
        fileWriter.write(json);  //Copying json to file
        fileWriter.close();
    }
}
