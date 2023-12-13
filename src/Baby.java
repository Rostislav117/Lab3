public class Baby extends Human implements MainCharacter{
    public Baby(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println(getName() + " Привет");
    }

    @Override
    public void sit() {
        System.out.println(getName() + " сидит на лавке");
    }
    public void understand() {
        System.out.println(getName() + " понимал, что именно Филле и Рулле собирались делать сегодня ночью:");
    }
    public void lie() {
        System.out.println(getName() + " понимал, что именно Филле и Рулле собирались делать сегодня ночью:");
    }
    public void sleep() {
        System.out.println(getName() + " понимал, что именно Филле и Рулле собирались делать сегодня ночью:");
    }
}
