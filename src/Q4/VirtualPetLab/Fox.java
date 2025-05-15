package Q4.VirtualPetLab;

public class Fox extends Pet {
    public Fox(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        setHunger(getHunger()-25);
        if (getHunger() < 0) {
            setHunger(0);
        }
        setHappiness(getHappiness()+10);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
        setEnergy(getEnergy()+10);
        if (getEnergy() > 100) {
            setEnergy(100);
        }
    }

    @Override
    public void play() {
        setHappiness(getHappiness()+45);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
        setHunger(getHunger()+20);
        if (getHunger() > 100) {
            setHunger(100);
        }
        setEnergy(getEnergy()+30);
        if (getEnergy() < 0) {
            setEnergy(0);
        }
    }

    @Override
    public void sleep() {
        setEnergy(getEnergy()+80);
        if (getEnergy() > 100) {
            setEnergy(100);
        }
        setHunger(getHunger()-20);
        if (getHunger() < 0) {
            setHunger(0);
        }
        setHappiness(getHappiness()+25);
        if (getHappiness() > 100) {
            setHappiness(100);
        }
    }
}
