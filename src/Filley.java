public class Filley extends Human implements BadBoy{
    private boolean loud;

    public Filley(String name, boolean loud) {
        super(name);
        this.loud = loud;
    }

    @Override
    public void speak() {
        if (loud) {
            System.out.println(getName() + " говорит громко:");
        } else {
            System.out.println(getName() + " говорит тихо:");
        }
    }


    @Override
    public void catchCarlson() {
        System.out.println(getName() + " попытается поймать Карлсона");
    }

    @Override
    public void sit() {
        System.out.println(getName() + " сидит на лавке");
    }
    public void look() {
        System.out.println(getName() + " посмотрел на малыша");
    }
    public void say() {
        System.out.println(" Но так легко Малыша не проведешь.");
    }
    public void think() {
        System.out.println(getName() + " думает");
    }

}
