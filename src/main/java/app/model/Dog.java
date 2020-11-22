package app.model;


import org.springframework.stereotype.Component;
@Component
public class Dog implements Animal{

    @Override
    public String toString() {
        return "I'm a Dog";
    }
}
