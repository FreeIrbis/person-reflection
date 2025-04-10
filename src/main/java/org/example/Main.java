package org.example;

import person.Person;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.printf("Before reflection %s\n", p);
        Class<? extends Person> pClass = p.getClass();
        try {
            Field nameField = pClass.getDeclaredField("name");
            Field ageField = pClass.getDeclaredField("age");
            nameField.setAccessible(true);
            ageField.setAccessible(true);
            nameField.set(p, "ReflectionName");
            ageField.set(p, 1000);
            nameField.setAccessible(false);
            ageField.setAccessible(false);
            System.out.printf("After reflection %s", p);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}