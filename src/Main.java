public class Main {
    public static void main(String[] args) {
     Programmer programmer=new Programmer("Nulan","Developer","Tesla");
        System.out.println(programmer.getName()+" "+programmer.getDesignation()+" "+programmer.getCompanyName());
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer.toString());
        System.out.println();


        Dancer dancer= new Dancer("Nazik","Dancer","Star");
        System.out.println(dancer.getName()+" "+dancer.getDesignation()+" "+dancer.getGroupName());
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(dancer.toString());
        System.out.println();

        Singer singer =new Singer("Petri","Singer","Sky");
        System.out.println(singer.getName()+" "+singer.getDesignation()+" "+singer.getBandName());
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playCitar();
        System.out.println(singer.toString());
    }



    }
