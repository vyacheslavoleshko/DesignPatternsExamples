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

    public static class builder {
        // mandatory parameters
        private String name;
        private byte brainVolume;

        // optional parameters
        private BigInteger stupidity = new BigInteger("0");
        private byte numberOfBooksRead = 0;
        private Double awesomeness = -1.0;  // default value

        public builder(String name, byte brainVolume) {
            this.name = name;
            this.brainVolume = brainVolume;
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

        public JuniorDeveloper build() {
            return new JuniorDeveloper(this);
        }
    }

    private JuniorDeveloper(builder builder) {
        this.name = builder.name;
        this.brainVolume = builder.brainVolume;
        this.stupidity = builder.stupidity;
        this.numberOfBooksRead = builder.numberOfBooksRead;
        this.awesomeness = builder.awesomeness;
    }

    public static void main(String[] args) {
        JuniorDeveloper jun = new JuniorDeveloper
                .builder("Junior", (byte) 100500)
                .setStupidity(new BigInteger("100500"))
                .setNumberOfBooksRead((byte)6)
                .setAwesomeness(42.0)
                .build();

        System.out.println(jun.name);
        System.out.println(jun.brainVolume);
        System.out.println(jun.stupidity);
        System.out.println(jun.numberOfBooksRead);
        System.out.println(jun.awesomeness);

    }
}
