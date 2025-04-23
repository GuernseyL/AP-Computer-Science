package Q4.VirtualPetLab;

public class Fox extends Pet {
    public Fox(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Fox
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Fox
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Fox
    }
}
