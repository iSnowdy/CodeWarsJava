package Kyu_7;

public class Building_Blocks {

    private int width;
    private int length;
    private int height;

    public Building_Blocks(int[] size) {
        this.width = size[0];
        this.length = size[1];
        this.height = size[2];
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getVolume() {
        return this.width * this.length * this.height;
    }

    public int getSurfaceArea() {
        return (2 * (this.length * this.height) + 2 * (this.width * this.length) + 2 * (this.width * this.height));
    }

    public static void main(String[] args) {

        Building_Blocks b = new Building_Blocks(new int[]{2, 4, 6});

        System.out.println("Width: " + b.getWidth());
        System.out.println("Length: " + b.getLength());
        System.out.println("Height: " + b.getHeight());
        System.out.println("Volume: " + b.getVolume());
        System.out.println("Surface Area: " + b.getSurfaceArea());

    }

}
