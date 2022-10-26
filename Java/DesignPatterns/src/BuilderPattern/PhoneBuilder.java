package BuilderPattern;

public class PhoneBuilder {
    private String os;
    private int ram;
    private int scr_size;
    private String Processor;

    public PhoneBuilder setOs(String os){
        this.os=os;
        return this;
    }
    public PhoneBuilder setram(int ram){
        this.ram=ram;
        return this;
    }
    public PhoneBuilder setscr_size(int scr_size){
        this.scr_size=scr_size;
        return this;
    }
    public PhoneBuilder setprocessor(String processor){
        this.Processor=processor;
        return this;
    }

    public Phone get_phone(){
        return new Phone(os,ram,scr_size,Processor);
    }
}
