package model;
public class Customer{
    private String cus_ID;
    private String name;
    private String email;
    private String phn_num;
    private String address;
    private String password;
    public Customer(String cus_ID,String name,String email,String phn_num,String address,String password) {
        this.cus_ID=cus_ID;
        this.name=name;
        this.email=email;
        this.phn_num=phn_num;
        this.address=address;
        this.password=password;
    }
    public void setID(String cus_ID) {
        this.cus_ID=cus_ID;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setemail(String email){
        this.email=email;
    }
    public void setphnnumber(String phn_num){
        this.phn_num=phn_num;
    }
    public void setaddress(String address) {
        this.address=address;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getID() {
        return this.cus_ID;
    }
    public String getname(){
        return this.name;
    }
    public String getemail(){
        return this.email;
    }
    public String getphnenum(){
        return this.phn_num;
    }
    public String getaddress(){
        return this.address;
    }
    public String getpass(){
        return this.password;
    }
}
