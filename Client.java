import Person.java;

class Client extends Person{
    private String address;
    private String phoneNumber;
    private String email;

    public Client(int id, String name, String address, String phoneNumber, String email){
        super(id, name);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
   	}

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}