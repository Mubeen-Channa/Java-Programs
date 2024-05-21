public class Light_Travel_Program {
    public static void main(String[] args) {
        // Light Travel Seconds Measure Program
        long ms = 186000, odays, thdays, tsec;

        odays= (60*60+24);
        System.out.println("One  day Seconds    = " + odays);

        thdays= (odays*1000);
        System.out.println("1000 day Seconds    = " + thdays);
        
        tsec= (thdays*18600);
        System.out.println("Total Light Traveld = " + tsec);
    }
}