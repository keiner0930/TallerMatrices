/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sony
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;

        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);

            }

        }

    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }

    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static void diagonalSecundaria(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == columnas - i - 1) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void triangularSuperior(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i <= j) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void triangularInferior(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i >= j) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void matrizTranspuesta(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                tabla2.setValueAt(aux, j, i);

            }
        }
    }

    public static void letraA(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == 0 || i == filas / 2 || j == 0 || j == columnas - 1) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraZ(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == columnas - 1 - i || i == 0 || i == filas - 1) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraT(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == 0 || j == filas / 2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraV(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i + j == filas - 1 && i <= j|| i == j && i + j <= filas) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraE(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == 0 || i == 0 || i == filas - 1 || i == columnas / 2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraF(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == 0 || i == 0 || i == columnas / 2) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraP(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == 0 || i == 0 || i == filas / 2 || j == columnas-1 && j/i >= 2 ) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraI(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == columnas / 2 || i == filas - 1 || i == 0) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraN(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == j || j == filas - 1 || j == 0) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraY(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (j == columnas / 2 && j <= i || i + j == filas - 1 && i <= j || i == j && i + j <= filas) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

    public static void letraX(JTable tabla1, JTable tabla2) {
        int filas, columnas, aux;

        filas = tabla1.getRowCount();
        columnas = tabla1.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                if (i == j || j == columnas - 1 - i) {
                    tabla2.setValueAt(aux, i, j);

                }
            }
        }
    }

}
