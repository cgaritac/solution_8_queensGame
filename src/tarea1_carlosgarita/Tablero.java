/*
 Universidad: UNED
Curso:        Estructura de Datos
Código:       00825
Tema:         Tarea 1
Estudiante:   Carlos Garita Campos
Periodo:      II Cuatrimestre 2020
 */
package tarea1_carlosgarita;

//Importación de los paquetes que manejan diferentes funciones del programa
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

//Clase "Tablero" para ejecutar el programa y mostrar el tablero junto con las respectivas soluciones en un JFrame
public class Tablero extends javax.swing.JFrame {

    //Declaración de las variables de instancia de la clase "Tablero"
    private int solucion = 1;
    private String[][] tablero;
    private ImageIcon Queen = new ImageIcon("Reina.jpg");

    //Constructor de la clase "Tablero"
    public Tablero() {
        initComponents(); //Inicialización de los componentes en pantalla
        this.setLocationRelativeTo(null); //Define la ubicación del JFrame en el centro de la pantalla
        this.setTitle("Juego de las 8 reinas"); //Define el título del JFrame

        tablero = generarTablero(8); //Llama al método generarTablero y el resultado lo asigna a la variable de instancia "tablero" para definir un arreglo string de 8x8 

        /*Llama al método "resolverReinas" para definir una solución al problema con base en el número de fila inicial donde se colocará la reina, manteniendo la columna inicial
        como la columna 0 del tablero*/
        resolverReinas(tablero, solucion - 1, 0); 

        //Llama al método "llenarTablero" para ubicar en pantalla las imágenes de las reinas en las soluciones de las posiciones obtenidas mediante el método "resolverReinas"
        llenarTablero(); 

        this.txtSol.setText("Solución: " + solucion); //Muestra texto en el cuadro de texto en pantalla
    }

    //Método "llenarTablero" para ubicar en pantalla las imágenes de las reinas
    public void llenarTablero() {
        
        /*Condicional que se ejecuta si en la posición definida del arreglo 8x8 el valor del string es igual a una "D", ubicando entonces la imagen de la reina en el botón 
        correspondiente en pantalla y de lo contrario deja vacío el botón*/
        if (tablero[0][0].equals("D")) {
            B1.setIcon(Queen);
        } else {
            B1.setIcon(null);
        }

        if (tablero[1][0].equals("D")) {
            B9.setIcon(Queen);
        } else {
            B9.setIcon(null);
        }

        if (tablero[2][0].equals("D")) {
            B17.setIcon(Queen);
        } else {
            B17.setIcon(null);
        }

        if (tablero[3][0].equals("D")) {
            B25.setIcon(Queen);
        } else {
            B25.setIcon(null);
        }

        if (tablero[4][0].equals("D")) {
            B33.setIcon(Queen);
        } else {
            B33.setIcon(null);
        }

        if (tablero[5][0].equals("D")) {
            B41.setIcon(Queen);
        } else {
            B41.setIcon(null);
        }

        if (tablero[6][0].equals("D")) {
            B49.setIcon(Queen);
        } else {
            B49.setIcon(null);
        }

        if (tablero[7][0].equals("D")) {
            B57.setIcon(Queen);
        } else {
            B57.setIcon(null);
        }

        if (tablero[0][1].equals("D")) {
            B2.setIcon(Queen);
        } else {
            B2.setIcon(null);
        }

        if (tablero[1][1].equals("D")) {
            B10.setIcon(Queen);
        } else {
            B10.setIcon(null);
        }

        if (tablero[2][1].equals("D")) {
            B18.setIcon(Queen);
        } else {
            B18.setIcon(null);
        }

        if (tablero[3][1].equals("D")) {
            B26.setIcon(Queen);
        } else {
            B26.setIcon(null);
        }

        if (tablero[4][1].equals("D")) {
            B34.setIcon(Queen);
        } else {
            B34.setIcon(null);
        }

        if (tablero[5][1].equals("D")) {
            B42.setIcon(Queen);
        } else {
            B42.setIcon(null);
        }

        if (tablero[6][1].equals("D")) {
            B50.setIcon(Queen);
        } else {
            B50.setIcon(null);
        }

        if (tablero[7][1].equals("D")) {
            B58.setIcon(Queen);
        } else {
            B58.setIcon(null);
        }

        if (tablero[0][2].equals("D")) {
            B3.setIcon(Queen);
        } else {
            B3.setIcon(null);
        }

        if (tablero[1][2].equals("D")) {
            B11.setIcon(Queen);
        } else {
            B11.setIcon(null);
        }

        if (tablero[2][2].equals("D")) {
            B19.setIcon(Queen);
        } else {
            B19.setIcon(null);
        }

        if (tablero[3][2].equals("D")) {
            B27.setIcon(Queen);
        } else {
            B27.setIcon(null);
        }

        if (tablero[4][2].equals("D")) {
            B35.setIcon(Queen);
        } else {
            B35.setIcon(null);
        }

        if (tablero[5][2].equals("D")) {
            B43.setIcon(Queen);
        } else {
            B43.setIcon(null);
        }

        if (tablero[6][2].equals("D")) {
            B51.setIcon(Queen);
        } else {
            B51.setIcon(null);
        }

        if (tablero[7][2].equals("D")) {
            B59.setIcon(Queen);
        } else {
            B59.setIcon(null);
        }

        if (tablero[0][3].equals("D")) {
            B4.setIcon(Queen);
        } else {
            B4.setIcon(null);
        }

        if (tablero[1][3].equals("D")) {
            B12.setIcon(Queen);
        } else {
            B12.setIcon(null);
        }

        if (tablero[2][3].equals("D")) {
            B20.setIcon(Queen);
        } else {
            B20.setIcon(null);
        }

        if (tablero[3][3].equals("D")) {
            B28.setIcon(Queen);
        } else {
            B28.setIcon(null);
        }

        if (tablero[4][3].equals("D")) {
            B36.setIcon(Queen);
        } else {
            B36.setIcon(null);
        }

        if (tablero[5][3].equals("D")) {
            B44.setIcon(Queen);
        } else {
            B44.setIcon(null);
        }

        if (tablero[6][3].equals("D")) {
            B52.setIcon(Queen);
        } else {
            B52.setIcon(null);
        }
        if (tablero[7][3].equals("D")) {
            B60.setIcon(Queen);
        } else {
            B60.setIcon(null);
        }
        if (tablero[0][4].equals("D")) {
            B5.setIcon(Queen);
        } else {
            B5.setIcon(null);
        }
        if (tablero[1][4].equals("D")) {
            B13.setIcon(Queen);
        } else {
            B13.setIcon(null);
        }
        if (tablero[2][4].equals("D")) {
            B21.setIcon(Queen);
        } else {
            B21.setIcon(null);
        }
        if (tablero[3][4].equals("D")) {
            B29.setIcon(Queen);
        } else {
            B29.setIcon(null);
        }
        if (tablero[4][4].equals("D")) {
            B37.setIcon(Queen);
        } else {
            B37.setIcon(null);
        }
        if (tablero[5][4].equals("D")) {
            B48.setIcon(Queen);
        } else {
            B48.setIcon(null);
        }
        if (tablero[6][4].equals("D")) {
            B53.setIcon(Queen);
        } else {
            B53.setIcon(null);
        }
        if (tablero[7][4].equals("D")) {
            B61.setIcon(Queen);
        } else {
            B61.setIcon(null);
        }

        if (tablero[0][5].equals("D")) {
            B6.setIcon(Queen);
        } else {
            B6.setIcon(null);
        }

        if (tablero[1][5].equals("D")) {
            B14.setIcon(Queen);
        } else {
            B14.setIcon(null);
        }

        if (tablero[2][5].equals("D")) {
            B22.setIcon(Queen);
        } else {
            B22.setIcon(null);
        }

        if (tablero[3][5].equals("D")) {
            B30.setIcon(Queen);
        } else {
            B30.setIcon(null);
        }

        if (tablero[4][5].equals("D")) {
            B38.setIcon(Queen);
        } else {
            B38.setIcon(null);
        }

        if (tablero[5][5].equals("D")) {
            B46.setIcon(Queen);
        } else {
            B46.setIcon(null);
        }

        if (tablero[6][5].equals("D")) {
            B54.setIcon(Queen);
        } else {
            B54.setIcon(null);
        }

        if (tablero[7][5].equals("D")) {
            B62.setIcon(Queen);
        } else {
            B62.setIcon(null);
        }

        if (tablero[0][6].equals("D")) {
            B7.setIcon(Queen);
        } else {
            B7.setIcon(null);
        }

        if (tablero[1][6].equals("D")) {
            B15.setIcon(Queen);
        } else {
            B15.setIcon(null);
        }
        if (tablero[2][6].equals("D")) {
            B23.setIcon(Queen);
        } else {
            B23.setIcon(null);
        }

        if (tablero[3][6].equals("D")) {
            B31.setIcon(Queen);
        } else {
            B31.setIcon(null);
        }
        if (tablero[4][6].equals("D")) {
            B39.setIcon(Queen);
        } else {
            B39.setIcon(null);
        }
        if (tablero[5][6].equals("D")) {
            B47.setIcon(Queen);
        } else {
            B47.setIcon(null);
        }
        if (tablero[6][6].equals("D")) {
            B55.setIcon(Queen);
        } else {
            B55.setIcon(null);
        }
        if (tablero[7][6].equals("D")) {
            B63.setIcon(Queen);
        } else {
            B63.setIcon(null);
        }
        if (tablero[0][7].equals("D")) {
            B8.setIcon(Queen);
        } else {
            B8.setIcon(null);
        }
        if (tablero[1][7].equals("D")) {
            B16.setIcon(Queen);
        } else {
            B16.setIcon(null);
        }
        if (tablero[2][7].equals("D")) {
            B24.setIcon(Queen);
        } else {
            B24.setIcon(null);
        }
        if (tablero[3][7].equals("D")) {
            B32.setIcon(Queen);
        } else {
            B32.setIcon(null);
        }
        if (tablero[4][7].equals("D")) {
            B40.setIcon(Queen);
        } else {
            B40.setIcon(null);
        }
        if (tablero[5][7].equals("D")) {
            B48.setIcon(Queen);
        } else {
            B48.setIcon(null);
        }
        if (tablero[6][7].equals("D")) {
            B56.setIcon(Queen);
        } else {
            B56.setIcon(null);
        }
        if (tablero[7][7].equals("D")) {
            B64.setIcon(Queen);
        } else {
            B64.setIcon(null);
        }
    }
    
    /*Método para generar un arrerglo string de 8x8 que inicialmente contenga solo caracteres de espacio vacío que funcionen como un tablero base en donde se definirán las
    posiciones de las reinas antes de ubicarlas en pantalla*/
    public String[][] generarTablero(int longitud) {
        
        //Crea un objeto "tab" al instanciar el arreglo string de la variable global, incializandolo por medio del constructor con una longitud de 8x8
        String[][] tab = new String[longitud][longitud];

        //Ciclo para llenar el arreglo string 8x8 con caracteres de espacio vacío
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = " ";
            }
        }
        
        return tab; //Retorno del arreglo string 8x8
    }

    /*Método para valorar si la posición en la cual se ubicará la reina es posible de acuerdo a las reglas definidas del juego, valorando todo lo que esté a la izquierda de 
    la posición en la cual se desea ubicar la reina, ya que a la derecha aún no se habría ubicado ninguna reina aún*/
    public boolean posicionSegura(String[][] tablero, int fila, int columna) {
        
        //Ciclo para valorar si hay reinas a la izquierda de la posición en la cual se está valorando ubicar la reina
        for (int i = 0; i < columna; i++) {
            
            /*Condicional que se ejecuta si en la posición definida del arreglo 8x8 el valor del string es igual a una "D", lo cual indicaría que efectivamente en dicha 
            fila ya hay una reina*/
            if (tablero[fila][i].equals("D")) {
                return false; // retorna un valor false
            }
        }

        //Ciclo para valorar si hay reinas en la diagonal superior izquierda de la posición en la cual se está valorando ubicar la reina
        for (int i = fila, j = columna; i >= 0 && j >= 0; i--, j--) {
            
            /*Condicional que se ejecuta si en la posición definida del arreglo 8x8 el valor del string es igual a una "D", lo cual indicaría que efectivamente en dicha 
            fila ya hay una reina*/
            if (tablero[i][j].equals("D")) {
                return false; // retorna un valor false
            }
        }

        //Ciclo para valorar si hay reinas en la diagonal inferior izquierda de la posición en la cual se está valorando ubicar la reina
        for (int i = fila, j = columna; j >= 0 && i < 8; i++, j--) {
            
            /*Condicional que se ejecuta si en la posición definida del arreglo 8x8 el valor del string es igual a una "D", lo cual indicaría que efectivamente en dicha 
            fila ya hay una reina*/
            if (tablero[i][j].equals("D")) {
                return false; // retorna un valor false
            }
        }
        return true; // retorna un valor true
    }

    //Método recursivo para reolver la ubicación de las 8 reinas en el tablero de acuerdo a las reglas definidas para el juego
    public boolean resolverReinas(String[][] tablero, int fila, int columna) {                  
        
        //Condicional para detener el ciclo recursivo cuando se han evaluado las 8 columnas del tablero
        if (columna >= 8) {
            return true; //Regresa un valor de true
        }

        /*Ciclo para evaluar si en cada una de las filas y columnas del tablero es posible colocar una reina y en caso de que sí sea posible, colocar una "D" dentro del arreglo
        string 8x8 en la posición correspondiente para que sirva de base para el tablero gráfico*/
        for (int i = 0; i < 8; i++) {
            
            //Condicional para ubicar la primera reina en diferentes filass de la columna cero, después de la cual se ubicarán las demás reinas
            if (columna == 0) {
                tablero[fila][columna] = "D"; //Coloca un caracter "D" en la posición correspondiente del arreglo string 8x8 indicando que ahí va una reina
                columna = columna+1; //Suma un 1 a la variable local columna
            }
            
            //Condicional que se ejecuta si es posible colocar una reina en la posición conrrespondiente del arreglo string correspondiente
            if (posicionSegura(tablero, i, columna)) {
                tablero[i][columna] = "D"; //Coloca un caracter "D" en la posición correspondiente del arreglo string 8x8 indicando que ahí va una reina

                //Condiconal para llamar al método "resolverReinas" de forma recursiva 
                if (resolverReinas(tablero, 0, columna + 1)) {
                    return true; //Regresa un valor de true
                }
                tablero[i][columna] = " "; //Asingna un caracter de espacio vació en la posición respectiva del arreglo string 8x8
            }
        }

        return false; //Regresa un valor de false
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B25 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        B19 = new javax.swing.JButton();
        B26 = new javax.swing.JButton();
        B27 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();
        B28 = new javax.swing.JButton();
        B29 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        B24 = new javax.swing.JButton();
        B32 = new javax.swing.JButton();
        B31 = new javax.swing.JButton();
        B30 = new javax.swing.JButton();
        B45 = new javax.swing.JButton();
        B48 = new javax.swing.JButton();
        B33 = new javax.swing.JButton();
        B46 = new javax.swing.JButton();
        B35 = new javax.swing.JButton();
        B34 = new javax.swing.JButton();
        B44 = new javax.swing.JButton();
        B39 = new javax.swing.JButton();
        B40 = new javax.swing.JButton();
        B42 = new javax.swing.JButton();
        B37 = new javax.swing.JButton();
        B38 = new javax.swing.JButton();
        B47 = new javax.swing.JButton();
        B43 = new javax.swing.JButton();
        B41 = new javax.swing.JButton();
        B36 = new javax.swing.JButton();
        B57 = new javax.swing.JButton();
        B49 = new javax.swing.JButton();
        B50 = new javax.swing.JButton();
        B51 = new javax.swing.JButton();
        B58 = new javax.swing.JButton();
        B59 = new javax.swing.JButton();
        B52 = new javax.swing.JButton();
        B60 = new javax.swing.JButton();
        B61 = new javax.swing.JButton();
        B53 = new javax.swing.JButton();
        B54 = new javax.swing.JButton();
        B55 = new javax.swing.JButton();
        B56 = new javax.swing.JButton();
        B64 = new javax.swing.JButton();
        B63 = new javax.swing.JButton();
        B62 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSol = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setPreferredSize(new java.awt.Dimension(505, 630));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(505, 630));
        jPanel1.setRequestFocusEnabled(false);

        B9.setBackground(new java.awt.Color(0, 0, 0));

        B2.setBackground(new java.awt.Color(0, 0, 0));

        B4.setBackground(new java.awt.Color(0, 0, 0));

        B11.setBackground(new java.awt.Color(0, 0, 0));

        B6.setBackground(new java.awt.Color(0, 0, 0));

        B13.setBackground(new java.awt.Color(0, 0, 0));

        B8.setBackground(new java.awt.Color(0, 0, 0));

        B15.setBackground(new java.awt.Color(0, 0, 0));

        B25.setBackground(new java.awt.Color(0, 0, 0));

        B18.setBackground(new java.awt.Color(0, 0, 0));

        B27.setBackground(new java.awt.Color(0, 0, 0));

        B20.setBackground(new java.awt.Color(0, 0, 0));

        B29.setBackground(new java.awt.Color(0, 0, 0));

        B22.setBackground(new java.awt.Color(0, 0, 0));

        B24.setBackground(new java.awt.Color(0, 0, 0));

        B31.setBackground(new java.awt.Color(0, 0, 0));

        B45.setBackground(new java.awt.Color(0, 0, 0));

        B34.setBackground(new java.awt.Color(0, 0, 0));

        B40.setBackground(new java.awt.Color(0, 0, 0));

        B38.setBackground(new java.awt.Color(0, 0, 0));

        B47.setBackground(new java.awt.Color(0, 0, 0));

        B43.setBackground(new java.awt.Color(0, 0, 0));

        B41.setBackground(new java.awt.Color(0, 0, 0));

        B36.setBackground(new java.awt.Color(0, 0, 0));

        B57.setBackground(new java.awt.Color(0, 0, 0));

        B50.setBackground(new java.awt.Color(0, 0, 0));

        B59.setBackground(new java.awt.Color(0, 0, 0));

        B52.setBackground(new java.awt.Color(0, 0, 0));

        B61.setBackground(new java.awt.Color(0, 0, 0));

        B54.setBackground(new java.awt.Color(0, 0, 0));

        B56.setBackground(new java.awt.Color(0, 0, 0));

        B63.setBackground(new java.awt.Color(0, 0, 0));

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtSol);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B25, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B26, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B27, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B28, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B29, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B30, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B41, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B34, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B42, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B35, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B43, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B36, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B44, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B37, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B45, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B38, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B46, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B39, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B47, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B40, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B48, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B49, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B57, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B50, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B58, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B51, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B59, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B52, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B60, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B53, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B61, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B54, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B62, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B55, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B63, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B56, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B64, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B25, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B26, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B27, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B28, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B29, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B30, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B41, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B34, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B42, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B35, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B43, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B36, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B44, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B37, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B45, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B38, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B46, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B39, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B47, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B40, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B48, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B49, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B57, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B50, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B58, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B51, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B59, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B52, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B60, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B53, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B61, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B54, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B62, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B55, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B63, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B56, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B64, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSiguiente)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        //Condicional que se ejecuta si el valor de la variable instancia solución es menor a 6, correspondiente al número de solución que se desea mostrar en pantalla
        if (solucion < 6) {
            solucion = solucion + 1; //se suma un 1 a la variable de instancia "solucion"
            this.txtSol.setText("Solución: " + solucion); //Muestra texto en el cuadro de texto en pantalla
            tablero = generarTablero(8);  //Llama al método generarTablero para limpiar el arreglo string y el resultado lo asigna a la variable de instancia "tablero" 
            
            /*Llama al método "resolverReinas" para definir una solución al problema con base en el número de fila inicial donde se colocará la reina, manteniendo la columna inicial
            como la columna 0 del tablero*/
            resolverReinas(tablero, solucion - 1, 0); 
            
            //Llama al método "llenarTablero" para ubicar en pantalla las imágenes de las reinas en las soluciones de las posiciones obtenidas mediante el método "resolverReinas"
            llenarTablero();
        }
        
        //Condicional que se ejecuta si el valor de la variable instancia solución es igual a 6, con el fin de reiniciar el conteo de soluciones a 1
        if (solucion == 6) {
            solucion = 1; //Reinicia el valor de solución a un valor de 1
            this.txtSol.setText("Solución: " + solucion); //Muestra texto en el cuadro de texto en pantalla
            tablero = generarTablero(8); //Llama al método generarTablero para limpiar el arreglo string y el resultado lo asigna a la variable de instancia "tablero" 
            
            /*Llama al método "resolverReinas" para definir una solución al problema con base en el número de fila inicial donde se colocará la reina, manteniendo la columna inicial
            como la columna 0 del tablero*/
            resolverReinas(tablero, solucion - 1, 0);
            
            //Llama al método "llenarTablero" para ubicar en pantalla las imágenes de las reinas en las soluciones de las posiciones obtenidas mediante el método "resolverReinas"
            llenarTablero();
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //Método "Main" para inicializar el programa
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B16;
    private javax.swing.JButton B17;
    private javax.swing.JButton B18;
    private javax.swing.JButton B19;
    private javax.swing.JButton B2;
    private javax.swing.JButton B20;
    private javax.swing.JButton B21;
    private javax.swing.JButton B22;
    private javax.swing.JButton B23;
    private javax.swing.JButton B24;
    private javax.swing.JButton B25;
    private javax.swing.JButton B26;
    private javax.swing.JButton B27;
    private javax.swing.JButton B28;
    private javax.swing.JButton B29;
    private javax.swing.JButton B3;
    private javax.swing.JButton B30;
    private javax.swing.JButton B31;
    private javax.swing.JButton B32;
    private javax.swing.JButton B33;
    private javax.swing.JButton B34;
    private javax.swing.JButton B35;
    private javax.swing.JButton B36;
    private javax.swing.JButton B37;
    private javax.swing.JButton B38;
    private javax.swing.JButton B39;
    private javax.swing.JButton B4;
    private javax.swing.JButton B40;
    private javax.swing.JButton B41;
    private javax.swing.JButton B42;
    private javax.swing.JButton B43;
    private javax.swing.JButton B44;
    private javax.swing.JButton B45;
    private javax.swing.JButton B46;
    private javax.swing.JButton B47;
    private javax.swing.JButton B48;
    private javax.swing.JButton B49;
    private javax.swing.JButton B5;
    private javax.swing.JButton B50;
    private javax.swing.JButton B51;
    private javax.swing.JButton B52;
    private javax.swing.JButton B53;
    private javax.swing.JButton B54;
    private javax.swing.JButton B55;
    private javax.swing.JButton B56;
    private javax.swing.JButton B57;
    private javax.swing.JButton B58;
    private javax.swing.JButton B59;
    private javax.swing.JButton B6;
    private javax.swing.JButton B60;
    private javax.swing.JButton B61;
    private javax.swing.JButton B62;
    private javax.swing.JButton B63;
    private javax.swing.JButton B64;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtSol;
    // End of variables declaration//GEN-END:variables
}
