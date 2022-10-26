package BuilderPattern;

public class Phone {
    private String os;
    private int ram;
    private int scr_size;
    private String Processor;
    Phone(String os,int ram,int scr_size,String Processor){
        this.os=os;
        this.ram=ram;
        this.scr_size=scr_size;
        this.Processor=Processor;
    }
    public String toString(){
        return "Phone[ OS :"+os+",ram:"+ram+",scr_size:"+scr_size+",Processor :"+Processor;
    }

}
