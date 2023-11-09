abstract class Shapes {
    abstract void numberOfSides();
}

class Hexagon extends Shapes{
    void numberOfSides(){
        System.out.println("The sides of a hexagon are six");
    }
}

class Rectangle extends Shapes{
    void numberOfSides(){
        System.out.println("The sides of a rectangle are four ");
    }
}

class Triangle extends Shapes{
    void numberOfSides(){
        System.out.println("The sides of a triangle are three ");
    }
}


class NoOfSides{
    public static void main(String[] args) {
        Shapes rect = new Rectangle();
        rect.numberOfSides();
        Shapes triangle = new Triangle();
        triangle.numberOfSides();
        Shapes hex = new Hexagon();
        hex.numberOfSides();
    }
}