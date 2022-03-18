package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable {
    private static final Model instance = new Model();

    private final Map<Integer, User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new HashMap<>();

        model.put(1, new User("Nikita", "Sobolev", 50000));
        model.put(2, new User("Anton", "Osipov", 60000));
        model.put(3, new User("Zoya","Andreeva",70000));
        model.put(4, new User("Elena","Vorobey", 80000));
    }

    public void add(User user, int id) {
        model.put(id, user);
    }

    public void remove(int id) {
        model.remove(id);
    }

    public void put(User user, int id) {
        model.put(id, user);
    }

    public Map<Integer, User> getFromList() {
        return model;
    }
}
