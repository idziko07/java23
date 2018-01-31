public class CalandarConverter {
    private static final int PONIEDZIALEK = 1;
    private static final int WTOREK = 2;
    private static final int SRODA = 3;
    private static final int CZWARTEK = 4;
    private static final int PIATEK = 5;
    private static final int SOBOTA = 6;
    private static final int NIEDZIELA = 7;



    static String convertDayToString(int dayNumber){
       switch (dayNumber){
           case PONIEDZIALEK:
               return "Poniedziałek";
           case WTOREK:
               return "Wtorek";
           case SRODA:
               return "Sroda";
           case CZWARTEK:
               return "Czwartek";
           case PIATEK:
               return "Piatek";
           case SOBOTA:
               return "Sobota";
           case NIEDZIELA:
               return "Niedziela";
               default:
                   return "Zły numer";
       }
    }
}
