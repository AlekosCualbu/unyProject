package usage;

import forms.MainFrame;
import utilities.Librerie;

import javax.swing.*;
import java.util.Map;

public class LibreriaLibri extends Librerie {
    @Override
    public void inserisci(Map<Long, Libri> map, Libri libro, JTextField isbn) throws NumberFormatException,NullPointerException {
        String regex = "\\d";
        if(!libro.getAutore().matches(regex) && !libro.getTitle().matches(regex)
                && !libro.isEmpty(libro.getAutore()) && !libro.isEmpty(libro.getTitle()))
            map.put(Long.parseLong(isbn.getText()),libro);
        else
            throw new NullPointerException();
    }

    @Override
    public void rimuovi(Map<Long, Libri> map, Long id) throws NumberFormatException,NullPointerException{
        if(!map.isEmpty() && map.containsKey(id) && id > 0)
            map.remove(id);
        else
            throw new NullPointerException();
    }

    @Override
    public void visualizza_tutti(Map<Long, Libri> map, JTextArea txt_area) {
        /*con questo sto svuotando la txt area*/
        txt_area.setText("");
        for(Map.Entry entry : map.entrySet()) {
            /*stampo tutti i valori della mappa uno per uno
            * basandomi sull'entry e lo casto a stringa
            * per poterlo inserire nella txt_area*/
            txt_area.append(entry.getValue().toString() + "\n");
        }
    }

    @Override
    public void cerca(Map<Long, Libri> map, JTextArea txt_area, Long id) throws Exception {
        txt_area.setText("");
        if(map.containsKey(id) && id > 0)
             txt_area.append("" + map.get(id));
        else
            throw new Exception();

    }
}
