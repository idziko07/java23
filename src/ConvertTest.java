public class ConvertTest {
    public static void main(String[] args) {

        for (int i=1; i<8; i++){
            String day = CalandarConverter.convertDayToString(i);

            System.out.println(i + " dzień tygodnia to " + day);
        }
    }
}
