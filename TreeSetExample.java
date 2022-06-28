package javaconcepts;

import java.util.Comparator;
import java.util.TreeSet;

// TreeSet implements NavigableSet which in turn extends Sorted Set
// sorts the elements
// not synchronized
// it uses self balancing tree i.e red black tree
// TreeSet is normally used for storing huge amounts of 
// information that is naturally sorted. This aids in easy and faster access.
// works based on tree map
// We can also sort TreeSet in a customized order by defining a new comparator class.
// This comparator object is then passed to the TreeSet constructor.
// takes O(logn) time for basic operations

public class TreeSetExample {
	 
    public static void main(String a[]){
       
    	System.out.println("using name Comparator\n");
        TreeSet<Empl> nameComp = new TreeSet<Empl>(new MyNameComp());
        nameComp.add(new Empl("Ram",3000));
        nameComp.add(new Empl("John",6000));
        nameComp.add(new Empl("Crish",2000));
        nameComp.add(new Empl("Tom",2400));
        for(Empl e:nameComp){
            System.out.println(e);
        }
        System.out.println("\nusing salary Comparator in reverse order");
      
        TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
        salComp.add(new Empl("Ram",3000));
        salComp.add(new Empl("John",6000));
        salComp.add(new Empl("Crish",2000));
        salComp.add(new Empl("Tom",2400));
        for(Empl e:salComp){
            System.out.println(e);
        }
        
        
       /*op: using name Comparator

        Name: Crish-- Salary: 2000
        Name: John-- Salary: 6000
        Name: Ram-- Salary: 3000
        Name: Tom-- Salary: 2400

        using salary Comparator in reverse order
        Name: John-- Salary: 6000
        Name: Ram-- Salary: 3000
        Name: Tom-- Salary: 2400
        Name: Crish-- Salary: 2000 */

    }
}
 
class MyNameComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getName().compareTo(e2.getName());
    }
}   
 
class MySalaryComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        if(e1.getSalary() > e2.getSalary()){
            return -1;
        } else {
            return 1;
        }
    }
}
 
class Empl{
     
    private String name;
    private int salary;
     
    public Empl(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}