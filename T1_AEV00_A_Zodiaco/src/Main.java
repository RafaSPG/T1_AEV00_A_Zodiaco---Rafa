import java.sql.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);



        System.out.println("Introduce tu fecha de nacimiento (dd/mm/yy):");
        String fechaString = teclado.nextLine();

        Date fecha = null;

        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            fecha = formato.parse(fechaString);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto");
            return;
        }



        String sz = obtenersz(fecha);
        System.out.println("Tu signo zodiacal es: " + sz);

        System.out.println(obtenerFrase());

    }



    public static String obtenersz(Date fecha) {
        int mes = fecha.getMonth() + 1;
        int dia = fecha.getDate();

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } else {
            return "Fecha no válida";
        }
    }

    public static String obtenerFrase () {

        String[] fraseFinal = new String[5];
        String enviar = "";
        Random r = new Random();

        int numero = r.nextInt(5+1);

        fraseFinal[0] = "Hoy gracias a la Luna tendras un buen dia";
        fraseFinal[1] = "Hoy sera tu mejor dia";
        fraseFinal[2] = "Mañana ser tu dia";
        fraseFinal[3] = "Maña puedes morir";
        fraseFinal[4] = "Feliz dia";


        switch (numero) {

            case 1:
                enviar = fraseFinal[0];
                break;
            case 2:
                enviar = fraseFinal[1];

                break;
            case 3:
                enviar = fraseFinal[2];

                break;
            case 4:
                enviar = fraseFinal[3];

                break;
            case 5:
                enviar = fraseFinal[4];

                break;

        }




        return enviar;
    }

}