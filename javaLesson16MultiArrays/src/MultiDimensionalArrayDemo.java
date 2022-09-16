public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        String [][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "İzmir";
        sehirler[1][0] = "Konya";
        sehirler[1][1] = "Antalya";
        sehirler[1][2] = "Gaziantep";
        sehirler[2][0] = "Adana";
        sehirler[2][1] = "Bursa";
        sehirler[2][2] = "Van";
        for (int i = 0; i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
