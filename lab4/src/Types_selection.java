public class Types_selection {

    public int notEmpty(){
        return 0;
    }
    public int emptysize(){
        return 1;
    }
    public int milk(int size){
        if(size<50){
            notEmpty();
        }
        size=size-50;
        return size;
    }
    public int blackcoffee(int size){
        if(size<50){
            notEmpty();
        }
        size=size-50;
        return size;
    }
    public int Cappccino(int size){
        if(size<50){
            notEmpty();
        }
        size=size-50;
        return size;
    }
    public int nespresso(int size){
        if(size<50){
            notEmpty();
        }
        size=size-50;
        return size;
    }
    public int nescafe(int size){
        if(size<50){
            notEmpty();
        }
        size=size-50;
        return size;
    }
    public Object stop(){
        notEmpty();
        return null;
    }
}
