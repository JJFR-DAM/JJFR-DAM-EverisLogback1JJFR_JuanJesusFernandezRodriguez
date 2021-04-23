package com.everis.desafioLogback;

import java.util.Scanner;

//Librerías importadas:

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	
	/** LOGGER*/
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	/*
     * Método principal.
     * 
     * Cálculos relacionados con la ley de gravitación universal,
     * faltaría comparar fórmulas de dinámica espacial para que el programa pueda,
     * realmente, despejar incógnitas más interesantes. Añadiría Velocidad de escape y aceleración(gravedad).
     * 
     * @param args
     */
	public static void main( String[] args )
    {
    	LOGGER.info("TRAZA INICIO");

    	/*
    	 * Creación de constante
    	 */
    	
    	final double G= Math.pow(6.673, -11);

    	/*
    	 * Creación de variables.
    	 */
    	
    	double m1=1;
    	double m2=1;
    	double r=1;
    	double fEntreMasas= 1;

    	/*
    	 * Apertura Scanner para pedir los datos por teclado.
    	 */
    	
    	Scanner sc=new Scanner(System.in);

    	/*
    	 * Menú de selección para despejar incógnitas.
    	 */
    	
    	LOGGER.trace("Elegir opción a calcular (Ejemplo '3'):");
    	LOGGER.trace("---Opción 1: Despejar radio.---\n---Opción 2: Despejar la masa.---\n---Opción 3: Despejar la fuerza existente entre dos masas.---");
    	int opcion=sc.nextInt();
    	switch(opcion) {
    	
    	/*
    	 * Caso 1 -> Despeja el radio.
    	 */
    	
    	case 1:
    		LOGGER.trace("---Introducir masa en kilos---");
    		m1=sc.nextDouble();
    		LOGGER.trace("---Introducir otra masa en kilos---");
    		m2=sc.nextDouble();
    		LOGGER.trace("---Introducir la fuerza existente entre las masas en Newtons---");
    		fEntreMasas=sc.nextDouble();
    		r=Math.pow((G*m1*m2/fEntreMasas), 0.5);
    		LOGGER.trace("El radio resultante es: {} metros", r);

        	/*
        	 * Bucle para aumentar el peso del archivo.
        	 */
        	
        	if (r>=500) {
            	LOGGER.info("TRAZA ENTRA IF");
        		for(int i=1;i<=2500;i++) {
        			LOGGER.trace("Contador de ciclo: {}",i);
        		}
        		LOGGER.trace("El radio resultante es: {} metros", r);
        	}
        	else LOGGER.error("No ha entrado en el bucle, prueba de nuevo");
        	LOGGER.info("TRAZA FIN CASE1");
    		break;

        	/*
        	 * Caso 2 -> Despeja la masa.
        	 */
        	
    	case 2:
    		LOGGER.trace("---Introducir masa en kilos---");
    		m2=sc.nextDouble();
    		LOGGER.trace("---Introducir la fuerza existente entre las masas en Newtons---");
    		fEntreMasas=sc.nextDouble();
    		LOGGER.trace("---Introducir radio---");
    		r=sc.nextDouble();
    		m1=(fEntreMasas*Math.pow(r, 2)/(m2*G));
    		LOGGER.trace("La masa resultante es: {} Kg", m1);

        	/*
        	 * Bucle para aumentar el peso del archivo.
        	 */
        	
        	if (m1>=500) {
            	LOGGER.info("TRAZA ENTRA IF");
        		for(int i=1;i<=2500;i++) {
        			LOGGER.info("Contador de ciclo: {}", i);
        		}
        		LOGGER.trace("La masa resultante es: {} Kg", m1);
        	}
        	else LOGGER.error("No ha entrado en el bucle, prueba de nuevo");
        	LOGGER.info("TRAZA FIN CASE2");
    		break;

        	/*
        	 * Caso 3 -> Despeja la fuerza resultante.
        	 */
        	
    	case 3:
    		LOGGER.trace("---Introducir masa en kilos---");
    		m1=sc.nextDouble();
    		LOGGER.trace("---Introducir otra masa en kilos---");
    		m2=sc.nextDouble();
    		LOGGER.trace("---Introducir el radio existente en metros---");
    		r=sc.nextDouble();
    		fEntreMasas=G*m1*m2/Math.pow(r, 2);
    		LOGGER.debug("La fuerza resultante es: {} Newtons", fEntreMasas);

        	/*
        	 * Bucle para aumentar el peso del archivo.
        	 */
        	
        	if (fEntreMasas>=500) {
            	LOGGER.info("TRAZA ENTRA IF");
        		for(int i=1;i<=2500;i++) {
        			LOGGER.info("Contador de ciclo: {}",i);
        		}
        		LOGGER.trace("La fuerza resultante es: {} Newtons", fEntreMasas);
        	}
        	else LOGGER.error("No ha entrado en el bucle, prueba de nuevo");
        	LOGGER.info("TRAZA FIN CASE3");
    		break;
    	}

    	/*
    	 * Cierre del Scanner que pide los datos por teclado.
    	 */
    	
        sc.close();
    	LOGGER.info("TRAZA FIN APP");
    }
}
