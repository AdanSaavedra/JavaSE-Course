public class Enumerations {
    public enum WeekDays {
        MONDAY("Lunes"),
        TUESDAY("Martes"),
        WEDNESDAY("Miercoles"),
        THURSDAY("Jueves"),
        FRIDAY("Viernes");

        private String spanish;
        private WeekDays(String s){
            spanish = s;
        }
        private String getSpanish(){
            return spanish;
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(WeekDays.values()[i].getSpanish());
        }

        System.out.println(WeekDays.MONDAY);
        System.out.println(WeekDays.MONDAY.getSpanish());
    }
}
