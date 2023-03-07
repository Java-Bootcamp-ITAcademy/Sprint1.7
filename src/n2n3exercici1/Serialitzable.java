/*** S1.7 Nivell 2 i 3 exercici 1 ***/
package n2n3exercici1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  //It will apply during runtime
public @interface Serialitzable {  //Custom annotation
    String directori() default "serialitzable.json";
}
