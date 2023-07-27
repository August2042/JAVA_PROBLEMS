class perimeter {

    int perimeter_square;
    int perimeter_rectangle;
    float perimeter_circle;

    int Perimeter_1(int side)

    {
        perimeter_square = 4 * side;
        return perimeter_square;

    }

    int Perimeter_1(int length, int breadth) {
        perimeter_rectangle = 2 * (length + breadth);
        return perimeter_rectangle;
    }

    float Perimeter_1(float radius) {
        perimeter_circle = 2 * 3.14f * radius;
        return perimeter_circle;
    }

    public static void main(String[] args) {
        perimeter obj = new perimeter();
        System.out.println("The perimeter of square : " + obj.Perimeter_1(5));
        System.out.println("The perimeter of rectangle : " + obj.Perimeter_1(10, 12));
        System.out.println("The perimeter of circle : " + obj.Perimeter_1(42.0f));
    }

}