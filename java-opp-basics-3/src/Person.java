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


    public Person(){
       setName("What's your name:");
       setGender("Male or Female:");
       setAddress("Where are you from:");
       setPhonenumber("Rghit phone number:");
       setHigh(1.77);
       setWigh(0.8);
       setBorndate("10/8/2006");
       setEmail("aliasmjadamro11@gmail.com");
       setWork("eng");
       setFamilysituation("ok");
       setIDnumber(216559724);
    }
    public Person(String name , String gender , String address , String phonenumber , double high , double wigh , String borndate , String email , String work , String familysituation , int IDnumber){
        setName(name);
        setGender(gender);
        setAddress(address);
        setPhonenumber(phonenumber);
        setHigh(high);
        setWigh(wigh);
        setBorndate(borndate);
        setEmail(email);
        setWork(work);
        setFamilysituation(familysituation);
        setIDnumber(IDnumber);

    }
    public Person(Person v){
        setName(v.name);
        setGender(v.gender);
        setAddress(v.address);
        setPhonenumber(v.getPhonenumber());
        setHigh(v.high);
        setWigh(v.wigh);
        setBorndate(v.borndate);
        setEmail(v.email);
        setWork(v.work);
        setFamilysituation(v.familysituation);
        setIDnumber(v.IDnumber);

    }




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
    public void setBorndate(String borndate) {
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
        return "Name = " + getName() + "\n" + "Gender = " + getGender() + "\n" + "Addess = " +
                getAddress() + "\n" + "Phonrnumber = " + getPhonenumber() + "\n" + "High = "
                + getHigh() + "\n" + "Wigh = " + getWigh() +"\n" + "Birthday = " +
                getBorndate() + "\n" + "Email = " + getEmail() + "\n" + "Work = " + getWork() + "\n" +
                "Familysituation = " + getFamilysituation() + "\n" + "IDnumer = " + getIDnumber();

    }


}