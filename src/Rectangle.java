public class Rectangle {
    private int width, height;

    public Rectangle(int width ,int height) {
        this.width = width;
        this.height = height;

    }


    public Rectangle(Rectangle other) {
        this.width = other.width;
        this.height = other.height;
    }


    public Rectangle() {
        this.width = 10;
        this.height = 10;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }







    public void show (){




        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" Width is " +this.width);
        System.out.println(" Height is " +this.height);






    }

}
