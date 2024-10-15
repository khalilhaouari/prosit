package tn.esprit.ZooManagement.entities;

public class Zoo {
    protected Animal [] animals ;
    protected String name;
    protected String city;
    protected Integer nbrAnimals;
    protected final int nbrCages=25;
    protected int count;


    public void setName(String name) {
        if(name.isEmpty())
        {
            System.out.println("Name cannot be empty");}
        else this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNbrAnimals(Integer nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Integer getNbrAnimals() {
        return nbrAnimals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }


    public Zoo(int capacity) {
        this.animals = new Animal[capacity];
        this.count = 0;
    }

        public Zoo(String name, String city, int nbrCages) {
            animals = new Animal[nbrCages];
            this.name = name;
            this.city = city;
            //this.nbrCages = nbrCages;
        }
        public Zoo(Animal [] animals){
            animals = new Animal[nbrCages];
        }
  /*  public void createAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner la famille de l'animal : ");
        String family = sc.nextLine();
        System.out.println("Donner le nom de l'animal : ");
        String name = sc.nextLine();
        System.out.println("Donner l'âge de l'animal : ");
        int age = sc.nextInt();
        System.out.println("Est-il un mammifère ? (1 pour oui, 0 pour non) : ");
        boolean isMammal = sc.nextInt() == 1;

        tn.esprit.tn.esprit.ZooManagement.main.ZooManagement.entities.Animal newAnimal = new tn.esprit.tn.esprit.ZooManagement.main.ZooManagement.entities.Animal(family, name, age, isMammal);
        addAnimal(newAnimal);
    }

    public boolean addAnimal(tn.esprit.tn.esprit.ZooManagement.main.ZooManagement.entities.Animal animal) {
        if (animal != null && count < animals.length) {
            if (!animal.family.isEmpty() && !animal.name.isEmpty() && animal.age > 0) {
                animals[count] = animal; // Ajoute
                count++; // Incrémente
                System.out.println("Ajout effectué");
                return true;
            }
        }
        System.out.println("Ajout échoué");
        return false;
    }



  /*  void setName(String name){this.name=name;}
    void setCity(String city){this.city=city;}
    void setNbrCages(int nbrCages){this.nbrCages=nbrCages;}
    void setAnimals(tn.esprit.tn.esprit.ZooManagement.main.ZooManagement.entities.Animal animals){this.animals=animals;}

        String getName(){return name;}
        String getCity(){return city;}
        int getNbrCages(){return nbrCages;}
        //tn.esprit.tn.esprit.ZooManagement.main.ZooManagement.entities.Animal getAnimals(){return animals;}*/


        void displayZoo()

        {
            for(int i=0; i<nbrAnimals; i++) {
                System.out.println(animals[i]);
            }
        }
        public boolean addAnimal(Animal animal)
        {
            if(searchAnimal(animal)==-1 && isZooFull()) {
                this.animals[nbrAnimals] = animal;
                nbrAnimals++;
                return true;
            }
            else return false;
        }

    public boolean isZooFull() {
            return nbrAnimals >= nbrCages;
    }

    public int searchAnimal(Animal animal) {
            for (int i = 0; i < nbrAnimals; i++) {
                if (animals[i].name.equals(animal.name))
                    return i;
            }
            return -1;
        }
    public Zoo comparerZoo(Zoo z1,Zoo z2)
    {
        return z1.nbrAnimals>z2.nbrAnimals ? z1 : z2;

    }
        }






    //Prosit 3




