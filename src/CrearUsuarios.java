/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LMC I- Alumno
 */
public class CrearUsuarios {
    public static void main(String[] args) {
        Usuario u = new Usuario("Abraham Abila Antena", "Abraham", "pedrosanchez1");
        AccesoArchivo.appendArchivo("usuarios.txt", u);
        u = new Usuario("Ruben Amorin Reyes Meza", "Piripipi", "Abraham123");
        AccesoArchivo.appendArchivo("usuarios.txt", u);
        u = new Usuario("BOTASO DE FUEGO", "test", "test1234");
        AccesoArchivo.appendArchivo("usuarios.txt", u);
    }
}
