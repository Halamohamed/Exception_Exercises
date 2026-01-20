package se.lexicon;

import se.lexicon.Exceptions.DuplicateNameException;
import se.lexicon.Exceptions.NameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 7: Custom Exceptions for List Operations
 * NameManager class manages a list of names, allowing addition and searching of names.
 */
public class NameManager {

    private List<String> names= new ArrayList<>();

    public void addName(String name) throws DuplicateNameException {
        if(names.contains(name)){
            throw new DuplicateNameException("Name already exists: " + name);
        }
        names.add(name);
    }

    public void findName(String name) throws NameNotFoundException {
        if(!names.contains(name)){
            throw new NameNotFoundException("Name not found: " + name);
        }
        IO.println("Name found: " + name);
    }

    static void main() {
        NameManager nameManager = new NameManager();
        try {
            nameManager.addName("Alice");
            nameManager.addName("Bob");
            nameManager.addName("Alice"); // This will throw DuplicateNameException
        } catch (DuplicateNameException e) {
            IO.println(e.getMessage());
        }

        try {
            nameManager.findName("Charlie"); // This will throw NameNotFoundException
        } catch (NameNotFoundException e) {
            IO.println(e.getMessage());
        }

        try {
            nameManager.findName("Bob"); // This should succeed
        } catch (NameNotFoundException e) {
            IO.println(e.getMessage());
        }
    }
}
