public class Tester {
    public static void main(String [] args){
        Person p = new Person();
        Person p1 = new Person("ali","male","jerusalem","0527038767",1.77,0.8,"10/8/2006","aliasmjadamro11@gmail.com","end","ok",216559724);
        System.out.println(p1);
        p.setName("Ali");
        p.setGender("Male");
       p.setAddress("Jerusalem");
       p.setPhonenumber("0527038767");
        p.setHigh(1.77);
       p.setWigh(0.8);
        p.setBorndate("10/8/2006");
        p.setEmail("aliasmjadamro11@gmail.com");
        p.setWork("eng");
        p.setFamilysituation("ok");
       p.setIDnumber(216559724);
        System.out.println(p);

        Person p3 = new Person(p1);
        System.out.println(p3);
    }
}