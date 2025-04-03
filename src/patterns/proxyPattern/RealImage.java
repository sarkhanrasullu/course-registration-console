package patterns.proxyPattern;

public class RealImage implements Image {
        private final String filename;

        public RealImage(String filename) {
            this.filename = filename;
            loadFromDisk(filename);
        }


    @Override
    public void display() {
        System.out.println("Displaying "+filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Searching "+filename);
    }
}
