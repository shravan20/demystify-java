package JavaAdvance.SerializationDesrialization;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private int age;
    private String name;

    private void setAge(int age) {
        this.age = age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return this.age;
    }

    private String getName() {
        return this.name;
    }

}