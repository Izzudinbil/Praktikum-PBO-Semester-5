package guided.keyword;

public class Lagu {
    private String pencipta;
    private String judul;
    
    public void IsiParam(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }
    public void cetakKeLayar(){
        if(judul==null && pencipta==null) return;
        System.out.println("Judul : " + judul +", pencipta : " + pencipta);
    }
    static class DemoLagu {
        public static void main(String[] args){
            Lagu a = new Lagu();
            a.IsiParam("God Will Make A Way", "Don Moen");
            a.cetakKeLayar();
        }
    }
}