public class Computer implements  Electronics{

    Ram ram;
    Processor process;
    Storage storage;

    public Computer(Ram ram, Processor processor, Storage storage) {
        this.ram = ram;
        this.process = process;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", process=" + process +
                ", storage=" + storage +
                '}';
    }

    @Override
    public  boolean on() {
        return true;
    }

    @Override
    public boolean off(){
        return false;
    }
}
