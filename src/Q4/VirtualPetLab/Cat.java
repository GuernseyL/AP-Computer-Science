package Q4.VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        setHunger(getHunger()-20);
        if (getHunger() < 0) {
            setHunger(0);
        }
        setHappiness(getHappiness()+5);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
        setEnergy(getEnergy()+20);
        if (getEnergy() > 100) {
            setEnergy(100);
        }
    }

    @Override
    public void play() {
        setHappiness(getHappiness()+60);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
        setHunger(getHunger()+25);
        if (getHunger() > 100) {
            setHunger(100);
        }
        setEnergy(getEnergy()-35);
        if (getEnergy() < 0) {
            setEnergy(0);
        }
    }

    @Override
    public void sleep() {
        setEnergy(getEnergy()+50);
        if (getEnergy() > 100) {
            setEnergy(100);
        }
        setHunger(getHunger()-5);
        if (getHunger() < 0) {
            setHunger(0);
        }
        setHappiness(getHappiness()+15);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }
}
