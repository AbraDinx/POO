
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vic //String head;
 */
public class AccesoArchivo {
    public static ArrayList<Object> leerArchivo(String ruta) {
        /*
        String body = null;
        try {
            body = Files.readString(Path.of(ruta));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No pudo leer el archivo", "ERROR:", JOptionPane.ERROR_MESSAGE);
        }
        ArrayList<String> lineas = new ArrayList<>(Arrays.asList(body.split("\n")));
        return lineas;
        */
        
        ArrayList<Object> lista = new ArrayList<>();
        File archivo = new File(ruta);
        if (!archivo.exists()) return lista;
        
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(archivo));
            while (true) {
                lista.add(lector.readObject());
            }
        } catch (EOFException ignorable) {
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR EN LEER ARCHIVO!!!" + e.getMessage());
        }
        return lista;
    }
    
    
    public static void appendArchivo(String ruta, Object objeto) {
        /*
        try {
            BufferedWriter editor = new BufferedWriter(new FileWriter(ruta));
            for (String linea : texto) {
                editor.write(linea);
                editor.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No pudo modificar el archivo", "ERROR:", JOptionPane.ERROR_MESSAGE);
        }
        */
        
        ArrayList<Object> listaOld = leerArchivo(ruta);
        listaOld.add(objeto);
        try {
            ObjectOutputStream editor = new ObjectOutputStream(new FileOutputStream(ruta));
            for (Object o : listaOld) {
                editor.writeObject(o);
            }
        } catch (IOException e) {
            System.out.println("No pudo modificar el archivo" + e.getMessage());
        }
    }
}