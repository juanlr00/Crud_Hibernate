/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernatecrud;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import models.Carta;
import models.Pedido;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 *
 * @author juanl
 */
public class Principal {
    public static void main(String[] args) {
       
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("1. Mostrar la carta");
            System.out.println("2. Crear un pedido");
            System.out.println("3. Eliminar un pedido");
            System.out.println("4.Listar las comandas");
            System.out.println("5. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        //Mostrar carta
                        Session s1 = HibernateUtil.getSessionFactory().openSession();
                        Query q1 = s1.createQuery("FROM Carta");
                        System.out.println("Aquí tiene la carta");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        //Crear pedido
                        Session s2 = HibernateUtil.getSessionFactory().openSession();
                        Query q2 = s2.createQuery("FROM Carta"); 
                        q2.list().forEach( (e)->System.out.println(e) );
                     
                            System.out.println("Pedido añadido correctamente");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        //Eliminar pedido
                        Session s3 = HibernateUtil.getSessionFactory().openSession();
                        String delete = "DELETE FROM Pedidos WHERE idProd = :idProducto"; 
                        System.out.println("Pedido eliminado correctamente");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        //Listar comandas
                        Session s4 = HibernateUtil.getSessionFactory().openSession();
                        Query q4 = s4.createQuery("FROM Pedido");
                        q4.list().forEach( (e)->System.out.println(e) );
                        
                        System.out.println("Comandas mostradas");
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Inserte un número");
                sn.next();
            }
        }
        
    }


}
