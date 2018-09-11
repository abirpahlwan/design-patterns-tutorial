abstract public class Creature {

    protected String name;
    protected int weight;
    protected String sound;

    abstract public String getName();
    abstract public void setName(String name);

    abstract public int getWeight();
    abstract public void setWeight(int weight);

    abstract public String getSound();
    abstract public void setSound(String sound);
}
