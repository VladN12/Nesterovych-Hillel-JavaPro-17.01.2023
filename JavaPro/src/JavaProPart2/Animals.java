package JavaProPart2;


public class Animals {
    Cat cat1 = new Cat();
    Dog dog1 = new Dog();


    int catDistanceRun;
    int catDistanceSwim;
    int dogDistanceRun;
    int dogDistanceSwim;

    public void setCatDistanceRun(int catRun) {
        catDistanceRun = catRun;
        if (catRun > 200) {
            System.out.println("Cat " + cat1.setName("Tom") + " can not run more then 200m.");
        } else {
            System.out.println("Cat " + cat1.setName("Tom") + " run " + catDistanceRun + "m.");
        }

    }


    public void setCatSwim(int catSwim) {
        catDistanceSwim = catSwim;
        System.out.println("Cat " + cat1.setName("Tom") + " can not swim ");

    }

    public void setDogDistanceRun(int dogRun) {
        dogDistanceRun = dogRun;
        if (dogRun > 500) {
            System.out.println("Dog " + dog1.setName("Bobik") + " can not run more then 500m. ");
        } else {
            System.out.println("Dog " + dog1.setName("Bobik") + " run " + dogDistanceRun + "m.");
        }

    }

    public void setDogDistanceSwim(int dogSwim) {
        dogDistanceSwim = dogSwim;
        if (dogSwim > 10) {
            System.out.println("Dog " + dog1.setName("Bobik") + " can not swim more then 10m. ");
        } else {
            System.out.println("Dog " + dog1.setName("Bobik") + " swim " + dogDistanceSwim + " m.");
        }


    }
}
