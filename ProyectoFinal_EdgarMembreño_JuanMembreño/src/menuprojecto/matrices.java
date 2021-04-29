/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprojecto;

import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author usuario
 */
public class matrices {
    CaraFeliz c = new CaraFeliz();
    JFrame aplicacion = new JFrame();

    Random random = new Random();

    public int row1 = random.nextInt(5);
    public int columna1 = random.nextInt(5);
    public int row2 = random.nextInt(5);
    public int columna2 = random.nextInt(5);
    public int row3 = random.nextInt(5);
    public int columna3 = random.nextInt(5);
    public int rows1 = random.nextInt(5);
    public int columnas1 = random.nextInt(5);
    public int rows2 = random.nextInt(5);
    public int columnas2 = random.nextInt(5);
    public int rows3 = random.nextInt(5);
    public int columnas3 = random.nextInt(5);

    public void juego() {
        try {
            validar();
            char[][] player = new char[5][5];
            char[][] pc = new char[5][5];
            player = llenar();
            int cont = 0;
            pc = llenar_enemigo();
            int jug = 0;
            int jug2 = 0;
            JOptionPane.showMessageDialog(null, "La tabla del enemigo");
            imprimir(pc);
            while (jug < 3 & jug2 < 3) {
                int aux = 0;
                System.out.println(row1 + ":" + columna1 + "  " + row2 + ":" + columna2 + "    " + row3 + ":" + columna3);
                int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila: "));
                while (filas < 0 || filas > 4) {
                    filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una fila posible: "));
                }
                int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna: "));
                while (columnas < 0 || columnas > 4) {
                    columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una columna posible: "));
                }
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if ((pc[i][j] == 'O' || pc[i][j] == 'X') & ((row1 == i & columna1 == j & filas == row1 & columna1 == columnas) || (row2 == i & columna2 == j & filas == row2 & columna2 == columnas) || (row3 == i & columna3 == j & filas == row3 & columna3 == columnas))) {
                            aux = 2;
                        } else if (row1 == i & columna1 == j & filas == row1 & columna1 == columnas) {
                            pc[i][j] = 'X';
                            aux = 1;
                        } else if (row2 == i & columna2 == j & filas == row2 & columna2 == columnas) {
                            pc[i][j] = 'X';
                            aux = 1;
                        } else if (row3 == i & columna3 == j & filas == row3 & columna3 == columnas) {
                            pc[i][j] = 'X';
                            aux = 1;
                        } else if (filas == i & columnas == j) {
                            pc[i][j] = 'O';
                        }
                    }
                }
                if (aux == 1) {
                    JOptionPane.showMessageDialog(null, "Le pego");
                    imprimir(pc);
                    jug = jug + 1;
                } else if (aux == 2) {
                    JOptionPane.showMessageDialog(null, "Ya ataco ahi, pierde turno");
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo");
                    imprimir(pc);
                }
                if (jug == 3) {
                    break;
                }
                // ataque del sistema
                aux = 0;

                /*if (cont == 0) {
                filas = rows1;
                columnas = columnas1;
                cont++;

            } else if (cont == 1) {
                filas = rows2;
                columnas = columnas2;
                cont++;
            } else if (cont == 2) {
                filas = rows3;
                columnas = columnas3;
            }*/
                filas = random.nextInt(5);
                columnas = random.nextInt(5);
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if ((player[i][j] == 'O' || player[i][j] == 'X') & ((rows1 == i & columnas1 == j & filas == rows1 & columnas1 == columnas) || (rows2 == i & columnas2 == j & filas == rows2 & columnas2 == columnas) || (rows3 == i & columnas3 == j & filas == rows3 & columnas3 == columnas))) {
                            aux = 2;
                        } else if (rows1 == i & columnas1 == j & filas == rows1 & columnas1 == columnas) {
                            player[i][j] = 'X';
                            aux = 1;
                        } else if (rows2 == i & columnas2 == j & filas == rows2 & columnas2 == columnas) {
                            player[i][j] = 'X';
                            aux = 1;
                        } else if (rows3 == i & columnas3 == j & filas == rows3 & columnas3 == columnas) {
                            player[i][j] = 'X';
                            aux = 1;
                        } else if (filas == i & columnas == j) {
                            player[i][j] = 'O';
                        }
                    }
                }
                if (aux == 1) {
                    JOptionPane.showMessageDialog(null, "La computadora le pego");
                    imprimir(player);
                    jug2 = jug2 + 1;
                } else if (aux == 2) {
                    JOptionPane.showMessageDialog(null, "La compuatdora disparo al mismo lugar, pierde turno");
                } else {
                    JOptionPane.showMessageDialog(null, "La computadora ha fallado");
                    imprimir(player);
                }
                
            }
            if (jug == 3) {
            JOptionPane.showMessageDialog(null, "Ha Ganado");
            aplicacion.add(c);
            aplicacion.setSize(250, 250);
            aplicacion.setLocationRelativeTo(null);
            aplicacion.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Perdio, la computadora gano");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }

    }

    public char[][] llenar() {
        char[][] temporal = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                temporal[i][j] = '~';
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 5; v++) {
                for (int j = 0; j < 5; j++) {
                    if (rows1 == v & columnas1 == j) {
                        temporal[v][j] = '^';
                    } else if (rows2 == v & columnas2 == j) {
                        temporal[v][j] = '^';
                    } else if (rows3 == v & columnas3 == j) {
                        temporal[v][j] = '^';
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Tus botes son:");
        imprimir(temporal);
        return temporal;
    }

    public char[][] llenar_enemigo() {
        char[][] temporal = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                temporal[i][j] = '~';
            }
        }
        return temporal;
    }

    public void imprimir(char[][] matrix) {
        String acum = "";
        acum += "     0    1    2    3    4" + "\n";
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            acum += cont + "   ";
            cont++;
            for (int j = 0; j < 5; j++) {
                acum += matrix[i][j] + "    ";
            }
            acum += "\n";
        }
        JOptionPane.showMessageDialog(null, acum);
    }

    public void validar() {
        while (row2 == row1 || row2 == row3) {
            row2 = random.nextInt(5);
        }
        while (row3 == row1 || row2 == row3) {
            row3 = random.nextInt(5);
        }
        while (rows2 == rows1 || rows2 == rows3) {
            rows2 = random.nextInt(5);
        }
        while (rows3 == rows1 || rows2 == rows3) {
            rows3 = random.nextInt(5);
        }
    }

}
