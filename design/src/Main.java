public class Main {

    public static void main(String[] args){
        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);


        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());
        

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");

        System.out.println(giraffe.getName());
    }
}
