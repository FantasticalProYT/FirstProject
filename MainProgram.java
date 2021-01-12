public class MainProgram {
    public static void main (final String... args){
        Person mohamed = new Person ("MOHAMED","ADEL",1700.067,175.67f,true,Gender.MALE);
        Person mena = new Person ("MENA","ADEL",5.0,120.25f,false,Gender.FEMALE);
        System.out.println("**************************************************************************");
        System.out.println("************* START OF PROGRAM *************");
        System.out.println();
        System.out.println("Mohamed:");
        mohamed.personDisplay();
        System.out.println();
        mena.setheight(0.125f);
        System.out.println("Mena:");
        mena.personDisplay();
        System.out.println();
        System.out.println("************* END OF PROGRAM *************");
        System.out.println("**************************************************************************");
    }
}
