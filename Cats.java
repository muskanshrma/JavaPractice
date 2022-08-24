package JavaPractice;

public class Cats {
    String breed;
    String color;
    int age;



    public String getBreed() {
        return breed;
    }


    public static void main(String[] args) {

        Cats persian = new Cats();
        persian.breed ="persian";
        persian.color="white";
        persian.age= 3;


        System.out.println(persian.breed);

    }

}

