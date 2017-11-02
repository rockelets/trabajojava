package trabajojava;

import java.util.Scanner;

public class Trabajojava {

    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("BIENVENIDO AL CREADOR DE PLANOS");
        System.out.println("--------------------------------");

        Scanner leer = new Scanner(System.in);

        while (true) {
            int filas = 0, columnas = 0;

            System.out.print("Ingrese el ancho de la pieza: ");
            filas = Integer.parseInt(leer.nextLine());
            if (filas < 0 || filas >= 21) {
                System.err.println("[ERROR]");
            }

            System.out.print("Ingrese el alto de la pieza: ");
            columnas = Integer.parseInt(leer.nextLine());

            String[][] matriz = new String[filas][columnas];

            matriz[0][0] = new String("f/c ");


            for (int x = 0; x < matriz.length; x++) {
                for (int y = 0; y < matriz[x].length; y++) {
                    if (x == 0 && y != 0) {
                        matriz[x][y] = new String(" " + x + y + " ");
                    }
                    if (x != 0 && y == 0) {
                        matriz[x][y] = new String(" " + y + x + " ");

                    }
                    if (x > 0 && y > 0) {
                        matriz[x][y] = new String(" -  ");
                    }
                }
                //System.out.println();
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println("");
            }

            System.out.println("---------------------------------------");
            int area = filas * columnas;

            int PORCENTAJE_GATOS, PORCENTAJE_RATONES;

            PORCENTAJE_GATOS = (int) (area * 0.1);
            PORCENTAJE_RATONES = (int) (area * 0.25);

            System.out.println("Solo puede ingresar [" + PORCENTAJE_GATOS + "] gatos como máximo");
            System.out.print("N° de gatos: ");
            int NumGatos = Integer.parseInt(leer.nextLine());
            if (NumGatos > PORCENTAJE_RATONES) {
                System.out.println("[ERROR] Superá la cantidad Estimada");
                System.out.print("N° de gatos: ");
                NumGatos = Integer.parseInt(leer.nextLine());
            }

            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    System.out.print(matriz[fila][columna]);
                }
                System.out.println("");
            }
            System.out.println("----------------------------------------");

            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz[fila].length; columna++) {
                }
            }

            for (int i = 0; i < NumGatos; i++) {
                System.out.println("--------------------");
                System.out.println("GATO N° " + (i + 1));
                System.out.println("--------------------");

                int filaGato, coluGato;

                System.out.print("Ingrese fila: ");
                filaGato = Integer.parseInt(leer.nextLine());
                System.out.print("Ingrese columna: ");
                coluGato = Integer.parseInt(leer.nextLine());

                System.out.println("--------------------------");
                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[fila].length; columna++) {
                    }
                }
                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[fila].length; columna++) {
                        System.out.print(matriz[fila][columna]);
                        matriz[filaGato][coluGato] = " G  ";
                    }
                    System.out.println("");
                }

            }
            System.out.println("------------------------------------");
            System.out.println("Solo puede ingresar [" + PORCENTAJE_RATONES + "] gatos como máximo");

            System.out.print("N° de ratones: ");
            int NumRatones = Integer.parseInt(leer.nextLine());

            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    System.out.print(matriz[fila][columna]);
                }
                System.out.println("");
            }
            System.out.println("----------------------------------------");

            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz[fila].length; columna++) {
                }
            }

            for (int i = 0; i < NumRatones; i++) {
                System.out.println("--------------------");
                System.out.println("RATON N° " + (i + 1));
                System.out.println("--------------------");

                int filaRaton, coluRaton;

                System.out.print("Ingrese fila: ");
                filaRaton = Integer.parseInt(leer.nextLine());

                System.out.print("Ingrese columna");
                coluRaton = Integer.parseInt(leer.nextLine());

                System.out.println("--------------------------");
                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[fila].length; columna++) {
                    }
                }
                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[fila].length; columna++) {
                        System.out.print(matriz[fila][columna]);
                        matriz[filaRaton][coluRaton] = " R  ";
                    }
                    System.out.println("");
                }

            }
            System.out.print("N° de Muebles: ");
            int NumMueble = Integer.parseInt(leer.nextLine());

            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz[fila].length; columna++) {
                    System.out.print(matriz[fila][columna]);
                }
                System.out.println("");
            }

            for (int i = 0; i < NumMueble; i++) {
                System.out.println("---------------------");
                System.out.println("MUEBLE N° " + (i + 1));
                System.out.println("---------------------");

                int filaMueble1, filaMueble2, coluMueble1, coluMueble2;

                System.out.println("Ingrese fila: ");
                filaMueble1 = Integer.parseInt(leer.nextLine());
                System.out.println("Ingrese columna: ");
                coluMueble1 = Integer.parseInt(leer.nextLine());

                System.out.println("-----------------------");
                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[fila].length; columna++) {
                    }
                }
                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[fila].length; columna++) {
                        System.out.print(matriz[fila][columna]);
                        matriz[filaMueble1][coluMueble1] = " X  ";
                    }
                    System.out.println("");
                }

                System.out.println("Ingrese fila: ");
                filaMueble2 = Integer.parseInt(leer.nextLine());
                System.out.println("Ingrese columna: ");
                coluMueble2 = Integer.parseInt(leer.nextLine());

                System.out.println("-----------------------");
                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[fila].length; columna++) {
                    }
                }
                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[fila].length; columna++) {
                        System.out.print(matriz[fila][columna]);
                        matriz[filaMueble2][coluMueble2] = " X  ";
                    }
                    System.out.println("");
                }

                System.out.println("");

                System.out.println("-----------------------");

                System.out.println("Procesar?");
                System.out.println("1.- SI");
                System.out.println("2.- NO");
                System.out.print("> ");
                int op = Integer.parseInt(leer.nextLine());
                if (op == 2) {
                    break;
                }

            }
        }
    }
}
