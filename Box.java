public class Box {
    public int size;
    public String color;

    public Box(int size, String color)
    {
        this.size = 5;
        this.color= "black";

    }
    public void fold() {
        System.out.println("Box can fold");
    }
}

class Big extends Box{
    public int volume;

    public Big(int size, String color, int volume)
    {
        System.out.println(size, color, volume);
    }
}

public class Test2
{public static void main (String args[])
{
    Big obj = new Big(5, "white", 20);
    System.out.println(obj);
}
}

}