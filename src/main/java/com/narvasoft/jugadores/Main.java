package com.narvasoft.jugadores;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Jugadores> gamers = new ArrayList<>();

    public static void main(String[] args) {
        agregarJugador();
        listarJugadores();
        System.out.println("Digite el id del jugador a eliminar");
        int id = sc.nextInt();
        eliminarJugador(id);
        listarJugadores();
        System.out.println("Digite el id del jugador a encontrar");
        id = sc.nextInt();
        mostrarJugador(id);

    }

    static void agregarJugador() {

        char rpta = 'y';

        do {
            System.out.println("Dese adicionar un jugador [y]|[n]: ");
            rpta = sc.next().charAt(0);

            if (rpta == 'y') {
                Jugadores gamer = new Jugadores();
                System.out.println("Digite el nombre para el jugador: ");
                gamer.setNombre(sc.next());

                System.out.println("Digite el nivelpara el jugador: \n"
                        + "'P'principiante, 'I' intermedio, 'A' Avanzado");
                gamer.setNivel(sc.next().charAt(0));
                System.out.println("Digite el Juego favorito para el jugador: ");
                gamer.setJuegofavorito(sc.next());

                gamer.setId((int) (Math.random() * 1000 + 1));
                gamer.setMax_score((int) (Math.random() * 10000 + 1));
                gamers.add(gamer);//adicionamos el jugar
            }
        } while (rpta == 'y');//condición q control el ciclo

    }

    static void eliminarJugador(int id) {
        for (Jugadores jugador : gamers) {
            if (jugador.getId() == id) {
                gamers.remove(jugador);//elimina el objeto actual q coincide con el id
                break;//se sale del ciclo
            }//end if

        }//end for
        System.out.println("Se ha eliminado al Jugador con id: " + id);
    }

    static void editarJugador(int id) {
        for (Jugadores jugador : gamers) {
            System.out.println("Jugador: " + jugador.getNombre()
                    + " id: " + jugador.getId());
        }
    }

    static void mostrarJugador(int id) {
        for (Jugadores jugador : gamers) {
            if (jugador.getId() == id) {
                System.out.println("Se ha encontrado al Jugador: " + jugador.getNombre()
                        + " id: " + jugador.getId());
                break;//se sale del ciclo
            }//end if
        }//end for
    }//end method

    static void listarJugadores() {
        for (Jugadores jugador : gamers) {
            System.out.println("Jugador: " + jugador.getNombre()
                    + " id: " + jugador.getId());
        }

    }

}
