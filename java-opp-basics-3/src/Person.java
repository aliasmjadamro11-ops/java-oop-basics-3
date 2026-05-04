public class Person {

    private String name;
    private String gender;
    private String phonenumber;
    private String address;
    private double wigh;
    private double high;
    private String email;
    private String work;
    private String familysituation;
    private String borndate;
    private int IDnumber;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        if(phonenumber == ""){
            this.phonenumber = "Illegal Number";
        } else if (phonenumber.isEmpty()) {
            this.phonenumber = "Illegal Number";
        } else{
            this.phonenumber = phonenumber;

        }
    }


    public double getHigh() {
        return high;
    }
    public void setHigh(double high) {
        this.high = high;
    }


    public double getWigh(){
        return wigh;
    }
    public void setWigh(double wigh){
        this.wigh=wigh;
    }


    public String getBorndate() {
        return borndate;
    }
    public void setBorndate(String porndate) {
        this.borndate = borndate;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }


    public String getFamilysituation() {
        return familysituation;
    }
    public void setFamilysituation(String familysituation) {
        this.familysituation = familysituation;
    }


    public int getIDnumber() {
        return IDnumber;
    }
    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }


    public String toString(){
        return "Name = " + getName() + "\n" + "Gender = " + getGender() + "\n" + "Addess = " + getAddress() + "\n" + "Phonrnumber = " + getPhonenumber() + "\n" + "High = " + getHigh() + "\n" + "Wigh = " + getWigh() +"\n" + "Birthday = " + getBorndate() + "\n" + "Email = " + getEmail() + "\n" + "Work = " + getWork() + "\n" + "Familysituation = " + getFamilysituation() + "\n" + "IDnumer = " + getIDnumber();

    }


}