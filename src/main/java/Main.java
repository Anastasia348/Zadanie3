public class Main {
    public static void mail(String[]args){
        Guitar guitar1= new Guitar(4);
        Guitar guitar2= new Guitar(5);
        Guitar guitar3= new Guitar(6);
        Barabanchik barabanchik1 = new Barabanchik(14);
        Barabanchik barabanchik2 = new Barabanchik(15);
        Truba truba1 = new Truba(10);
        Truba truba2 = new Truba(11);
        Instruments[] instrument = {guitar1, guitar2, guitar3, barabanchik1, barabanchik2, truba1,truba2};
        for(Instruments instrument1 : instrument){
            instrument1.play();
        }
    }
    }
