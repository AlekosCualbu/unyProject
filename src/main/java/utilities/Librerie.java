package utilities;

import usage.Libri;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public abstract class Librerie {

    Map<Long, Libri> map = new HashMap<>();

    public abstract void inserisci(Map<Long, Libri> map, Libri libro, JTextField isbn) throws NumberFormatException;
    public abstract void rimuovi(Map<Long, Libri> map, Long id) throws NumberFormatException;
    public abstract void visualizza_tutti(Map<Long, Libri> map, JTextArea txt_area);
    public abstract void cerca(Map<Long, Libri> map, JTextArea txt_area, Long id);

    //getter and setters
    public Map<Long, Libri> getMap() {
        return map;
    }
}
