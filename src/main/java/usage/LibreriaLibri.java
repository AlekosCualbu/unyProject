package usage;

import utilities.Librerie;

import javax.swing.*;
import java.util.Map;

public class LibreriaLibri extends Librerie {
    @Override
    public void inserisci(Map<Long, Libri> map, Libri libro, JTextField isbn) {
        try {
               map.put(Long.parseLong(isbn.getText()),libro);
        }catch (NumberFormatException ex) {
            /*questo print viene eseguito
            * solamente se viene lanciata l'eccezzione*/
            System.out.println(ex);
            /*create the popup*/
        }
    }

    @Override
    public void rimuovi(Map<Long, Libri> map, Long id) {
        try {
                map.remove(id);
        }catch (NumberFormatException ex) {
            /*questo print viene eseguito
             * solamente se viene lanciata l'eccezzione*/
            System.out.println(ex);
            /*create the popup*/
        }
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
    public void cerca(Map<Long, Libri> map, JTextArea txt_area, Long id) {
        txt_area.setText("");
        txt_area.append("" + map.get(id));
    }
}
