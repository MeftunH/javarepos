/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalitim;

/**
 *
 * @author MAFTUN
 */
public class employer {
    private String name;
    private String department;
    private int salary;

    public employer() {
    }

    public employer(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void Showinfo()
    {
        System.out.println(this.name);
        System.out.println(this.department);
        System.out.println(this.salary);
    }

}
