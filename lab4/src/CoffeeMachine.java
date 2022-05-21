public class CoffeeMachine extends Types_selection {
    public static int AvaliableSize = 300;
    public void start (){
        System.out.println("1- Black Cofee");
        System.out.println("2- Cappccino");
        System.out.println("3- Milk");
        System.out.println("4- nescafe");
        System.out.println("5- nespresso ");
        System.out.println("6- Stop");
    }

    public Object Select(int input){
        switch (input){
            case 1:{
                AvaliableSize =blackcoffee(AvaliableSize);
            }
            case2:{
                AvaliableSize =Cappccino(AvaliableSize);
            }
            case 3:{
                AvaliableSize =milk(AvaliableSize);
            }
            case 4:{
                AvaliableSize =nescafe(AvaliableSize);
            }
            case 5:{
                AvaliableSize =nespresso(AvaliableSize);
            }
            case 6:{
                stop();
            }
        }
        return null;
    }

}
