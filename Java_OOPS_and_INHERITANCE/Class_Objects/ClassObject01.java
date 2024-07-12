public class ClassObject01 {
    public static void main(String[] args) {
        Box b1 = new Box(10, 10, 10);
        int boxVolume = b1.volume();
        System.out.println("Volume: " + boxVolume);
    }
}

class Box {
    int width, height, breadth;
    Box(int width, int height, int breadth){
        this.width = width;
        this.height = height;
        this.breadth = breadth;
    }

    int volume() {
        return (width * height * breadth);
    }
}