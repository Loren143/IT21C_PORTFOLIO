
package Bankaccount;


public class bankaccount {
    

    private String name;
    private int age;
    private long accountnumber;
    private double balance;
    
    public bankaccount (String name,int age, int accountnumber,double balance){
        this.name= name;
        this.age= age;
        this.accountnumber= accountnumber;
        this.balance= balance;
        
    }
    
    public void setName(String name){this.name=name;}
    public int getAge(){
        return age;}
    public void setAge (int age){ this.age=age;}
    public void deposit (double amount) {balance += amount;}
    public double getBalance(){return balance;}
    public String getSummary(){return "\nName:" + name + "\nAge:" + age + "\nAccount Number:" + accountnumber + "\nBalance:" + balance;}
    
    }
    
   