package org.example;

import person.MarkerAnnotation;
import person.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAnnotation {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        Class pClass = person.getClass();
        Method[] methods = pClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MarkerAnnotation.class)) {
                method.invoke(person);
            }
        }
    }
}
