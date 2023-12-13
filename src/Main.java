
public class Main {
    public static void main(String[] args) {
        Filley filley = new Filley("Филле", true);
        Baby baby = new Baby("Малыш");
        Rulle rulle = new Rulle("Рулле");
        Karlson karlson = new Karlson("Карлсон");

        baby.sit();
        filley.sit();
        rulle.sit();

        filley.look();
        filley.speak();
        filley.say();

        baby.understand();
        filley.catchCarlson();
        rulle.catchCarlson();

        filley.think();
        rulle.think();

        karlson.lie();
        karlson.sleep();

    }
}