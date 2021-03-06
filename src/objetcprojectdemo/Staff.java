
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcprojectdemo;

/**
 *
 * @author MANUEL
 */
public class Staff {
/* Declaración de variables privadas de la clase*/
    private String NombreEmpleado;
    private final int RatioHora = 30;
    private int HorasTrabajadas;
 /* Metodo que visualiza el mensaje "Calculando el salario..."*/   
    public void printMessage()
    { 
        System.out.println("Calculando el salario...");
    }
/* Método que calcula el salario cuando no hay bonus */
    /**
     * Calcula el salario cuando no hay bonos.
     * @return int ,en caso de no trabajar ninguna hora -1.
     */
    public int calculatePay()
    {
        printMessage();
        int staffPay;
        staffPay = RatioHora * HorasTrabajadas;
        if (HorasTrabajadas > 0)
            return staffPay;
        else
            return -1;
    }
    /**
     * Calcula el salario cuando hay bonos.
     * @param bonus Bono a sumar.
     * @param allowance La paga a sumar.
     * @return el salario a cobrar.
     */
    
    public int calculatePay(int bonus, int allowance)
    {
        printMessage();
        if (HorasTrabajadas>0)
            return HorasTrabajadas * RatioHora + bonus + allowance;
        else
            return 0;
    }
   /* Mértodo setter que verifica que horas trabajadas es mayor que cero */
    public void setHorasTrabajadas(int hours)
    {
        if (hours > 0)
            HorasTrabajadas = hours;
        else {
            System.out.println("-Error: HoursWorked Cannot be Smaller than zero");
            System.out.println("-Error: HoursWorked is not updated");
            }          
    }
    /* Método getter para asignar valores a horas trabajadas */
    public int getHorasTrabajadas()
    {
        return HorasTrabajadas;
    }
    /* Constructores crean  objetos Staff */
    public Staff(String name)
    {
        String nameOfStaff = name;
        System.out.println("\n"+ nameOfStaff);
        System.out.println("-------------------------");
    }
    public Staff(String firstName, String lastName)
    {
        String nameOfStaff = firstName + lastName;
        System.out.println("\n"+nameOfStaff);
        System.out.println("-------------------------------");
    }
    }
