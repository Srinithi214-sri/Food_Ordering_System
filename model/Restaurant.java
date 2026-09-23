package model;
public class Restaurant {
    private  String res_ID;
    private String name;
    private String address;
    private String email;
    private String contact;
    private String password;
    public Restaurant(String res_ID,String name,String address,String email,String contact,String password) {
        this.res_ID=res_ID;
        this.name=name;
        this.address=address;
        this.email=email;
        this.contact=contact;
        this.password=password;
    }
    public void setID(String res_ID) {
        this.res_ID = res_ID;
    }
    public void setname(String name) {
        this.name=name;
    }
        public void setaddress(String address){
            this.address=address;
        }
        public void setemail(String email){
            this.email=email;
        }
        public void setcontact(String contact){
            this.contact=contact;
        }
        public void setPassword(String password){
            this.password=password;
        }
        public String getID() {
            return this.res_ID;
        }
        public String getname(){
            return this.name;
        }
        public String getaddress(){
            return this.address;
        }
        public String getemail(){
            return this.email;
        }
        public String getcontact(){
            return this.contact;
        }
        public String getPassword(){
            return this.password;
        }
    }
