package JavaAdvance.SerializationDesrialization;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private int userAge;
    private String name;

    private void setAge(int userAge) {
        this.userAge = userAge;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getUserAge() {
        return this.userAge;
    }

    private String getName() {
        return this.name;
    }

}