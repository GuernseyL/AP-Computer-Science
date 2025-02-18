package Q3.Prog702p;

public class BIG implements Animals {
    private String myName;
    private String myWord;

    public BIG (String MN, String MW) {
        myName = MN;
        myWord = MW;
    }

    public String getName() { return myName; }
    public String getWord() { return myWord; }
}
