public class Barabanchik implements  Instruments{
    int size;
    public Barabanchik (int size){
        this.size=size;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }
    @Override
    public void play(){
        System.out.println("Барабан играет размером"+ getSize()+"см");
    }
}

