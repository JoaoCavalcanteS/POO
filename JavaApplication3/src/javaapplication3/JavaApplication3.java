/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;


public class JavaApplication3 {
    public static void main(String[] args) {
          int a = 50;
          modificar(a);
          System.out.print("(main): Valor de a:"+a);
    }
        static void modificar(int a) {;
            a = 200;
            System.out.print("(metodo): valor de A:"+a);
        }
}
