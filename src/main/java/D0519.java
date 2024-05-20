class Sasin{
    int critical;
    String item;

    void setchampion(int critical,String item){
        this.critical = critical;
        this.item = item;
    }
}
class Yone extends Sasin{
    @Override
    void setchampion(int critical, String item) {
        super.setchampion(critical, item);
        this.item = "찬란한" + item;
    }
}
public class D0519 {
    public static void main(String[] args) {
        Yone Yone3star = new Yone();
        Yone3star.setchampion(30," 거인의 결의");
        System.out.println(Yone3star.critical+ "\n"+ Yone3star.item);
    }
}