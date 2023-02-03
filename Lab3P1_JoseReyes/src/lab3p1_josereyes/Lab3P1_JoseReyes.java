/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_josereyes;

/**
 *
 * @author josem
 */
import java.util.Scanner;
public class Lab3P1_JoseReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);
        
        boolean flag = true ;
        while(flag==true){
            System.out.println("Binevenido al menu\n1.Fronteras\n2.Calculando pi\n3.Construyendo casas\n4.Salir del programa");
            int menu=r.nextInt();
            
            switch(menu){
                case 1:{
                    System.out.print("Ingrese un entero positivo: ");
                    int positivo=r.nextInt();
                    while(positivo<4 || positivo>16){
                        System.out.print("El valor ingresado no se aceptado, ingrese nuevamente un entero");
                        positivo=r.nextInt();
                    }
                    System.out.print("Ingrese el primer caracter para el triangulo superior:  ");
                    char simb1=r.next().charAt(0);
                    System.out.print("Ingrese el segundo caracter para el triangulo inferios: ");
                    char simb2=r.next().charAt(0);
                    
                    for (int i = 0; i < positivo; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < positivo* 2 - 2 * i - 2; j++) {
                            if (j % 2 == 0) {
                                System.out.print(simb1);
                            } else {
                                System.out.print(simb2);
                            }
                        }
                        System.out.println();
                    }
                }break;
                case 2:{
                    double pi=0;
                    double suma=1;
                    System.out.println("Ingrese un numero entero");
                    int num=r.nextInt();
                    for(int n=0;num>=n;n++){
                        pi+= suma/(2*n+1);
                        suma=-suma;
                    }
                    pi*=4;
                    System.out.println("La aproximacion es "+pi);
                    System.out.println("");
                }break;
                case 3:{
                    int num;
                    System.out.println("Ingrese un entero positivo mayor que 4");
                    num=r.nextInt();
                    
                    while(num<=4){
                        System.out.println("El numero debe ser mayor a 4, ingrese su numero nuevamente");
                        num=r.nextInt();
                    }
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < 2*num; j++) {
                            if (i<num/2) {
                                if(j>=num-i-1 && j<= num+i-1){
                                   System.out.print("*");
                                } else {
                                   System.out.print(" ");
                                }
                            }else{
                                if(j==num -(num-i-1)-1 || j==num+(num-i-1)-1){
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println();
                    }
                }break;
                case 4:{
                    flag=false;
                    System.out.println("Programa finalizado");
                }break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
