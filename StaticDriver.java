public class StaticDriver{
    public static void main(String[] args){
        Static stat1 = new Static();
        Static stat2 = new Static();

        stat1.addX();
        stat2.addX();
        System.out.println("Stat1:" + stat1.getX() + " Stat2: " + stat2.getX());
    }
}