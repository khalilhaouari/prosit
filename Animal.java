package tn.esprit.ZooManagement.entities;

public class Animal {
    protected String name;
    protected String family;
    protected  int age;
    protected boolean isMammal;

    Animal(){};

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setAge(int age) {
        if(age<0 )
        {
            System.out.println("Invalid Age");}

        else this.age = age;

    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(String name, String family, int age, boolean isMammal) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.isMammal = isMammal;
    }
//        public tn.esprit.tn.esprit.ZooManagement.main.ZooManagement.entities.Animal(String name){this.name = name;}


      /*  void setName(String name){this.name=name;}
        void setFamily(String family){this.family=family;}
        void setAge(int age){this.age=age;}
        void setIsMammal(boolean isMammal) {tn.esprit.tn.esprit.ZooManagement.main.ZooManagement.entities.Animal.isMammal = isMammal;}*/

    String getName(){return name;}
    String getFamily(){return family;}
    String getAge(){return Integer.toString(age);}
    boolean getIsMammal(){return isMammal;}


}
