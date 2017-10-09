import java.math.BigInteger;

/**
 * Class that has many constructor parameters.
 * We need to instantiate it using named parameters like in Python,
 * also we want to make it immutable. Some parameters are optional and some are mandatory.
 * <p>
 * Using this pattern is recommended when number of arguments >= 4
 *
 * NOTE: use Lombock @Builder annotation if you are cool hacker ;)
 *
 * @author Viacheslav Oleshko
 */
public class JuniorDeveloper {
    private String name;
    private byte brainVolume;
    private BigInteger stupidity;
    private byte numberOfBooksRead;
    private Double awesomeness;

    // Inner class to build the object
    public static class builder {
        // Set default values
        private String      name = "";
        private byte        brainVolume = 0;
        private BigInteger  stupidity = new BigInteger("100500");
        private byte        numberOfBooksRead = 0;
        private Double      awesomeness = -1.0;

        // Setters for all fields
        public builder setName(String name) {
            this.name = name;
            return this;
        }

        public builder setBrainVolume(byte brainVolume) {
            this.brainVolume = brainVolume;
            return this;
        }

        public builder setStupidity(BigInteger stupidity) {
            this.stupidity = stupidity;
            return this;
        }

        public builder setNumberOfBooksRead(byte numberOfBooksRead) {
            this.numberOfBooksRead = numberOfBooksRead;
            return this;
        }

        public builder setAwesomeness(Double awesomeness) {
            this.awesomeness = awesomeness;
            return this;
        }

        // This method of builder instantiates JuniorDeveloper objects
        public JuniorDeveloper build() {
            return new JuniorDeveloper(this);
        }
    }

    // Private constructor of JuniorDeveloper class. builder#build() uses this constructor
    private JuniorDeveloper(builder builder) {
        this.name = builder.name;
        this.brainVolume = builder.brainVolume;
        this.stupidity = builder.stupidity;
        this.numberOfBooksRead = builder.numberOfBooksRead;
        this.awesomeness = builder.awesomeness;
    }

    @Override
    public String toString() {
        return "JuniorDeveloper{" +
                "name='" + name + '\'' +
                ", brainVolume=" + brainVolume +
                ", stupidity=" + stupidity +
                ", numberOfBooksRead=" + numberOfBooksRead +
                ", awesomeness=" + awesomeness +
                '}';
    }

    public static void main(String[] args) {
        JuniorDeveloper unnamedJun = new JuniorDeveloper
                .builder()
                .build();

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper
                .builder()
                .setName("Junior")
                .setBrainVolume((byte)1)
                .setStupidity(new BigInteger("0"))
                .setNumberOfBooksRead((byte)6)
                .setAwesomeness(42.0)
                .build();

        System.out.println(unnamedJun);
        System.out.println(juniorDeveloper);
    }
}
