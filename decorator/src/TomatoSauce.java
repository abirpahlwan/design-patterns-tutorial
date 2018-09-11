public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding sauce");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    public Double getCost(){
        return tempPizza.getCost() + .35;
    }
}
