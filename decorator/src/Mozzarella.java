public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding dough");
        System.out.println("Adding mozzarella");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Mozarella";
    }

    public Double getCost(){
        return tempPizza.getCost() + .50;
    }
}
