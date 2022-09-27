public class Main {
    public static void main(String[] args) {

        String numero = "2,123";

        String numerouno = numero.split(",")[0];
        String numerodecimal = numero.split(",")[1];

        //System.out.println(numerouno);
        int repeticiones=Integer.parseInt(numerouno);

        int [] arrayCifras = new int[numerodecimal.length()];
        int i;
        for (i=0;i<numerodecimal.length();i++){
            arrayCifras[i] = Integer.parseInt(String.valueOf(numerodecimal.charAt(i)));
            //System.out.println(arrayCifras[i]);
        }

        String [][] arrayDisplay = new String[numerodecimal.length()][7];
        for (i=0;i<numerodecimal.length();i++){
            switch (arrayCifras[i]){
                case 1:{
                    arrayDisplay[i][0] = "   ";
                    arrayDisplay[i][1] = " ";
                    arrayDisplay[i][2] = "|";
                    arrayDisplay[i][3] = "   ";
                    arrayDisplay[i][4] = " ";
                    arrayDisplay[i][5] = "|";
                    arrayDisplay[i][6] = "   ";
                    break;
                }
                case 2:{
                    arrayDisplay[i][0] = "---";
                    arrayDisplay[i][1] = " ";
                    arrayDisplay[i][2] = "|";
                    arrayDisplay[i][3] = "---";
                    arrayDisplay[i][4] = "|";
                    arrayDisplay[i][5] = "";
                    arrayDisplay[i][6] = "---";
                    break;
                }
                case 3:{
                    arrayDisplay[i][0] = "---";
                    arrayDisplay[i][1] = " ";
                    arrayDisplay[i][2] = "|";
                    arrayDisplay[i][3] = "---";
                    arrayDisplay[i][4] = " ";
                    arrayDisplay[i][5] = "|";
                    arrayDisplay[i][6] = "---";
                    break;
                }
                case 4:{
                    arrayDisplay[i][0] = "   ";
                    arrayDisplay[i][1] = "|";
                    arrayDisplay[i][2] = "|";
                    arrayDisplay[i][3] = "---";
                    arrayDisplay[i][4] = " ";
                    arrayDisplay[i][5] = "|";
                    arrayDisplay[i][6] = "   ";
                    break;
                }
                case 5: {
                    arrayDisplay[i][0] = "---";
                    arrayDisplay[i][1] = "|";
                    arrayDisplay[i][2] = " ";
                    arrayDisplay[i][3] = "---";
                    arrayDisplay[i][4] = " ";
                    arrayDisplay[i][5] = "|";
                    arrayDisplay[i][6] = "---";
                    break;
                }
                case 6: {
                    arrayDisplay[i][0] = "---";
                    arrayDisplay[i][1] = "|";
                    arrayDisplay[i][2] = " ";
                    arrayDisplay[i][3] = "---";
                    arrayDisplay[i][4] = "|";
                    arrayDisplay[i][5] = "|";
                    arrayDisplay[i][6] = "---";
                    break;
                }
                case 7: {
                    arrayDisplay[i][0] = "---";
                    arrayDisplay[i][1] = " ";
                    arrayDisplay[i][2] = "|";
                    arrayDisplay[i][3] = "---";
                    arrayDisplay[i][4] = " ";
                    arrayDisplay[i][5] = "|";
                    arrayDisplay[i][6] = "   ";
                    break;
                }
                case 8:{
                    arrayDisplay[i][0] = "---";
                    arrayDisplay[i][1] = "|";
                    arrayDisplay[i][2] = "|";
                    arrayDisplay[i][3] = "---";
                    arrayDisplay[i][4] = "|";
                    arrayDisplay[i][5] = "|";
                    arrayDisplay[i][6] = "---";
                }
                case 9:{
                    arrayDisplay[i][0] = "---";
                    arrayDisplay[i][1] = "|";
                    arrayDisplay[i][2] = "|";
                    arrayDisplay[i][3] = "---";
                    arrayDisplay[i][4] = " ";
                    arrayDisplay[i][5] = "|";
                    arrayDisplay[i][6] = "   ";
                }
            }

        }
        for (i=0;i<numerodecimal.length();i++){
            System.out.printf(" %s ", arrayDisplay[i][0]);
        }
        System.out.println("");
        for (i=0;i<numerodecimal.length();i++){
            System.out.printf("%s   %s", arrayDisplay[i][1], arrayDisplay[i][2]);
        }
        System.out.println("");
        for (i=0;i<numerodecimal.length();i++) {
            System.out.printf(" %s ", arrayDisplay[i][3]);
        }
        System.out.println("");
        for (i=0;i<numerodecimal.length();i++){
            System.out.printf("%s   %s", arrayDisplay[i][4], arrayDisplay[i][5]);
        }
        System.out.println("");
        for (i=0;i<numerodecimal.length();i++){
            System.out.printf(" %s ", arrayDisplay[i][6]);
        }
        System.out.println("");



    }
}