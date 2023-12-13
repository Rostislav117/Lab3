public class Rulle extends Human implements BadBoy{
    public Rulle(String name){
        super(name);
    }
    @Override
    public void speak(){
        System.out.println("Привет, я Рулле");
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
