package App_Pruebas;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class AsistentePersonalEva {

    public static void main(String[] args) {
        int idiomas;
        System.out.println("Selecciona tu idioma...");
        System.out.println("1 - Español");
        System.out.println("2 - Ingles");
        System.out.print("- ");
        Scanner iDiomas = new Scanner (System.in);
        idiomas = iDiomas.nextInt();
        if(idiomas ==1){
            
        //variables ---------------------------------------------------------------------------------------------------------
        String usuario, decision, nombre, parentesco, cumpleaños, alarma1 = "0", pasatiempos, alarma3 = "0", alarma33 = "0", emergencian, emergenciap;
        String mundo = "SI", actividades, ciclo = "SI", alarmas, borrarcaso1, borrarcaso2, borrarcaso4, borrarcaso6, borrarcasoextra;
        String emergencianum, direccion, cumpleañosu, medicina, medicinah, adicional = "SI";
        int opcion, capacidad1 = 0, acumulador1 = 0, capacidad2 = 0, acumulador2 = 0, capacidad4 = 0, acumulador4 = 0, acumulador5 = 0, capacidad6 = 0;
        int capacidadalarmas, acumuladorextra = 0, borrar1, rutina = 1, acumulador6 = 0, ver1;
        //Scanner ---------------------------------------------------------------------------------------------------------
        Scanner uSuario = new Scanner(System.in);
        Scanner dEcision = new Scanner(System.in);
        Scanner oPcion = new Scanner(System.in);
        Scanner cApacidad1 = new Scanner(System.in); //empieza el caso1
        Scanner nOmbre = new Scanner(System.in);
        Scanner pArentesco = new Scanner(System.in);
        Scanner cUmpleaños = new Scanner(System.in);
        Scanner aLarma1 = new Scanner(System.in);
        Scanner cApacidad2 = new Scanner(System.in); //empieza el caso2
        Scanner pAsatiempos = new Scanner(System.in);
        Scanner aLarma3 = new Scanner(System.in); //empieza el caso3
        Scanner aLarma33 = new Scanner(System.in);
        Scanner cApacidad4 = new Scanner(System.in); //empieza el caso4
        Scanner eMergenciaN = new Scanner(System.in);
        Scanner eMergenciaP = new Scanner(System.in);
        Scanner eMergenciaNum = new Scanner(System.in);
        Scanner dIreccion = new Scanner(System.in); //empieza el caso5
        Scanner cUmpleañosu = new Scanner(System.in);
        Scanner cApacidad6 = new Scanner(System.in); //empieza el caso6
        Scanner mEdicina = new Scanner(System.in);
        Scanner mEdicinah = new Scanner(System.in);
        Scanner aCtividades = new Scanner(System.in);
        Scanner aLarmas = new Scanner(System.in); //alarmas extra
        Scanner cApacidadalarmas = new Scanner(System.in);
        Scanner bOrrarcasoextra = new Scanner(System.in);
        Scanner bOrrar1 = new Scanner(System.in); // borrar
        Scanner bOrrarcaso1 = new Scanner(System.in);
        Scanner bOrrarcaso2 = new Scanner(System.in);
        Scanner bOrrarcaso4 = new Scanner(System.in);
        Scanner bOrrarcaso6 = new Scanner(System.in);
        Scanner aDicional = new Scanner(System.in); // continuar alarmas
        Scanner vEr1 = new Scanner(System.in); // buscar info
        //vectores --------------------------------------------------------------------------------------------------------
        Vector caso1 = new Vector(100); //nombre familiares
        Vector caso11 = new Vector(100); //parentesco familiares
        Vector caso111 = new Vector(100); //cumpleaños familiares
        Vector caso2 = new Vector(100); //pasatiempos
        Vector caso4 = new Vector(100); //nombre emergencia
        Vector caso44 = new Vector(100); //parentesco emergencia
        Vector caso444 = new Vector(100); //numero emergencia
        Vector caso5 = new Vector(1); //direccion
        Vector caso55 = new Vector(1); //cumpleaños
        Vector caso6 = new Vector(100); //nombre medicina
        Vector caso66 = new Vector(100); //hora emergencia
        Vector extra = new Vector(100); //alarmas extras        
        //vectores precargados --------------------------------------------------------------------------------------------------------
        Vector precargados = new Vector(10);
        precargados.addElement("Eva");
        precargados.addElement("12:00");
        precargados.addElement("07:00");

        System.out.println("\nBienveni@, mi nombre es " + precargados.elementAt(0) + ", un gusto ser tu asistente personal,");
        System.out.print("para continuar escribe tu nombre : ");
        usuario = uSuario.nextLine();
        System.out.println("\nHola " + usuario + " deseas configurar el dispositivo?");
        System.out.print("no es obligatorio pero " + precargados.elementAt(0) + " te lo recomienda, escribe tu decision aqui : ");
        decision = dEcision.nextLine();
        decision = decision.toUpperCase();
        while (mundo.equals("SI")) {
            while (decision.equals("SI")) {
                do {
                    System.out.println("\nMENU");
                    System.out.println("1: Dime el nombre y cumpleaños de tus familiares o amigos mas cercanos");
                    System.out.println("2: Que es lo que mas te gusta hacer en tu dia");
                    System.out.println("3: Dime a que hora te gusta levantarte y a que hora duermes");
                    System.out.println("4: Añade numeros de familiares o amigos en caso de emergencia");
                    System.out.println("5: Escribe tu nombre completo, donde vives y cuando cumples años");
                    System.out.println("6: Dime a que hora te tocan tus medicinas y el nombre de cada una de ellas");
                    System.out.print("\nIngresa alguna opcion : ");
                    opcion = oPcion.nextInt();
                } while (opcion > 6);
                switch (opcion) {
                    case 1:
                        System.out.println("\nConfiguremos la primera opcion...");
                        System.out.print("¿Cuantos conocidos deseas guardar? ");
                        capacidad1 = cApacidad1.nextInt();
                        capacidad1 = capacidad1 + acumulador1;
                        System.out.println("");
                        for (int i = acumulador1; i < capacidad1; i++) {
                            System.out.println("Persona " + (i + 1));
                            System.out.print("Nombre : ");
                            nombre = nOmbre.nextLine();
                            caso1.insertElementAt(nombre, i);
                            System.out.print("Parentesco : ");
                            parentesco = pArentesco.nextLine();
                            caso11.insertElementAt(parentesco, i);
                            System.out.print("Cumpleaños (dia/mes/año) : ");
                            cumpleaños = cUmpleaños.nextLine();
                            caso111.insertElementAt(cumpleaños, i);
                            acumulador1++;
                            System.out.println("");
                        }
                        System.out.println("Conocidos guardados con exito!!!");
                        System.out.print("¿A que hora quieres que te lo recuerde? (08:04 o 15:56) ");
                        alarma1 = aLarma1.nextLine();
                        System.out.println("Alarma guardada para las " + alarma1 + "\n");
                        System.out.println("Recuerda que en cualquier momento puedes agregar mas conocidos desde el menu!!!\n");
                        System.out.print("¿Quieres configurar otra opcion? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "SI";
                        break;
                    case 2:
                        System.out.println("\nConfiguremos la opcion 2...");
                        System.out.print("¿Cuantos pasatiempos deseas agregar? ");
                        capacidad2 = cApacidad2.nextInt();
                        capacidad2 = capacidad2 + acumulador2;
                        System.out.println("");
                        for (int i = acumulador2; i < capacidad2; i++) {
                            System.out.print("Pasatiempo " + (i + 1) + " : ");
                            pasatiempos = pAsatiempos.nextLine();
                            caso2.insertElementAt(pasatiempos, i);
                            acumulador2++;
                        }
                        System.out.println("\nPasatiempos guardados con exito!!!");
                        System.out.println("Recuerda que en cualquier momento puedes agregar mas pasatiempos desde el menu!!!\n");
                        System.out.print("¿Quieres configurar otra opcion? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "SI";
                        break;
                    case 3:
                        System.out.println("\nConfiguremos la opcion 3...\n");
                        for (int i = 0; i < 1; i++) {
                            System.out.print("¿A que hora te gusta despertarte(08:04 o 15:56) ? ");
                            alarma3 = aLarma3.nextLine();
                            System.out.print("¿A que hora te gusta dormirte(08:04 o 15:56) ? ");
                            alarma33 = aLarma33.nextLine();
                        }
                        System.out.println("\nAlarmas guardados con exito!!!");
                        System.out.println("Alarmas guardadas para las " + alarma3 + " y " + alarma33);
                        System.out.println("Recuerda que en cualquier momento puedes modificar las alarmas desde el menu!!!\n");
                        System.out.print("¿Quieres configurar otra opcion? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "SI";
                        break;
                    case 4:
                        System.out.println("\nConfiguremos la opcion 4...\n");
                        System.out.println("Estos numeros seran usados automaticamente cuando estes grave o necesites ayuda,");
                        System.out.println("cuando escribas la palabra 'ayuda' se mostraran todos los numeros.\n");
                        System.out.println("Es necesario saber que estoy tomando en cuenta que alguien esta a tu cuidado siempre,");
                        System.out.println("por lo tanto esa persona podra ver los numeros para que pueda llamar y ahorre tiempo\n");
                        System.out.print("¿Cuantos contactos de emergencia quieres guardar? ");
                        capacidad4 = cApacidad4.nextInt();
                        capacidad4 = capacidad4 + acumulador4;
                        System.out.println("");
                        for (int i = acumulador4; i < capacidad4; i++) {
                            System.out.println("Persona de emergencia " + (i + 1));
                            System.out.print("Nombre : ");
                            emergencian = eMergenciaN.nextLine();
                            caso4.insertElementAt(emergencian, i);
                            System.out.print("Parentesco : ");
                            emergenciap = eMergenciaP.nextLine();
                            caso44.insertElementAt(emergenciap, i);
                            System.out.print("Numero : ");
                            emergencianum = eMergenciaNum.nextLine();
                            caso444.insertElementAt(emergencianum, i);
                            acumulador4++;
                            System.out.print("\n");
                        }
                        System.out.println("Contactos de emergencia guardados con exito!!!");
                        System.out.println("Recuerda que en cualquier momento puedes agregar mas numeros de emergencia desde el menu!!!\n");
                        System.out.print("¿Quieres configurar otra opcion? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "SI";
                        break;
                    case 5:
                        System.out.println("\nConfiguremos la opcion 5...");
                        System.out.println("");
                        for (int i = acumulador5; i < 1; i++) {
                            System.out.println("Hola de nuevo " + usuario + " aqui almacenare algunos datos personales!!!");
                            System.out.print("Direccion : ");
                            direccion = dIreccion.nextLine();
                            caso5.insertElementAt(direccion, i);
                            System.out.print("Cumpleaños : ");
                            cumpleañosu = cUmpleañosu.nextLine();
                            caso55.insertElementAt(cumpleañosu, i);
                            acumulador5++;
                            System.out.println("");
                        }
                        System.out.println("Datos personales guardados con exito!!!");
                        System.out.print("¿Quieres configurar otra opcion? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "SI";
                        break;
                    case 6:
                        System.out.println("\nConfiguremos la opcion 6...");
                        System.out.print("¿Cuantas medicinas quieres agregar? ");
                        capacidad6 = cApacidad6.nextInt();
                        capacidad6 = capacidad6 + acumulador6;
                        System.out.println("");
                        for (int i = acumulador6; i < capacidad6; i++) {
                            System.out.println("Medicina " + (i + 1));
                            System.out.print("Nombre : ");
                            medicina = mEdicina.nextLine();
                            caso6.insertElementAt(medicina, i);
                            System.out.print("Hora : ");
                            medicinah = mEdicinah.nextLine();
                            caso66.insertElementAt(medicinah, i);
                            acumulador6++;
                        }
                        System.out.println("\nMedicinas guardados con exito!!!");
                        System.out.println("Recuerda que en cualquier momento puedes agregar mas medicinas desde el menu!!!\n");
                        System.out.print("¿Quieres configurar otra opcion? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "SI";
                        break;
                }
            }
            Date fechaHoraActuales = new Date();
            SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
            String horA = hora.format(fechaHoraActuales);
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MMMM/yyyy");
            String fechA = fecha.format(fechaHoraActuales);
            System.out.println("\nHola " + usuario + ", espero te encuentres de maravilla!, el dia de hoy es " + fechA + " y la hora es " + horA);
            System.out.println("\nActividades\n");
            System.out.println("menu <- ingresas al menu");
            System.out.println("quien eres? <- te explico mi proposito");
            System.out.println("ayuda <- te muestro los contactos de emergencia");
            System.out.println("alarma <- podras agregar alarmas independientes de las del menu");
            System.out.println("borrar <- puedes borrar datos del menu o las alarmas extras");
            System.out.println("mod <- entrare en modo alarmas, es recomendado si no lo estas usando para que suenen todas las alarmas");
            System.out.println("buscar <- podras ver la informacion ordenada de las opciones del menu");
            System.out.println("apagar <- si activas esto me desactivare pero se eliminaran todos los datos");
            System.out.println("\nRecuerda que yo estoy configurada con los datos que ingresaste en el menu");
            System.out.println("por lo tanto, estas palabras clave son extras por si necesitas algo mas\n");
            ciclo = "SI";
            rutina = 1;
            while (ciclo.equals("SI")) {
                System.out.print("- ");
                actividades = aCtividades.nextLine();
                actividades = actividades.toUpperCase();
                if(actividades.equals("QUIEN ERES?")){
                    System.out.println("\nMi nombre es Eva, fui programada para ayudar a gente con alzheimer, mis funciones son super funcionales,");
                    System.out.println("para personas en la primera etapa... Mi objetivo proximo es alcanzar inteligencia artificial");
                    System.out.println("asi podre ayudar a mas personas y sere mas funcional, por lo mientras, te recomiendo");
                    System.out.println("navegar mi menu, configurar almas importantes, etc, estare para guiarte "+usuario+"\n");
                }
                if (actividades.equals("MENU")) {
                    decision = "SI";
                    ciclo = "NO";
                } else if (actividades.equals("AYUDA")) {
                    System.out.println("\nPuedes llamar a estos contactos\n");
                    for (int i = 0; i < capacidad4; i++) {
                        System.out.println(caso4.elementAt(i) + " es tu " + caso44.elementAt(i) + " --- " + caso444.elementAt(i));
                    }
                    System.out.println("emergencias --- 911\n");
                } else if (actividades.equals("ALARMA")) {
                    System.out.print("\n¿Cuantas alarmas deseas poner? ");
                    capacidadalarmas = cApacidadalarmas.nextInt();
                    capacidadalarmas = capacidadalarmas + acumuladorextra;
                    System.out.println("");
                    for (int i = acumuladorextra; i < capacidadalarmas; i++) {
                        System.out.print("Escribe la alarma " + (i + 1) + " : ");
                        alarmas = aLarmas.nextLine();
                        extra.insertElementAt(alarmas, i);
                        acumuladorextra++;
                    }
                    System.out.println("\nAlarmas guardadas: ");
                    for (int i = 0; i < capacidadalarmas; i++) {
                        System.out.println((i + 1) + " - " + extra.elementAt(i));
                    }
                    System.out.println("");
                } else if (actividades.equals("BORRAR")) {
                    do {
                        System.out.println("\n1: Dime el nombre y cumpleaños de tus familiares o amigos mas cercanos");
                        System.out.println("2: Que es lo que mas te gusta hacer en tu dia");
                        System.out.println("3: Añade numeros de familiares o amigos en caso de emergencia");
                        System.out.println("4: Dime a que hora te tocan tus medicinas y el nombre de cada una de ellas");
                        System.out.println("5: Alarmas extra");
                        System.out.print("\n¿De que opcion deseas eliminar informacion? ");
                        borrar1 = bOrrar1.nextInt();
                    } while (borrar1 > 6);
                    if (borrar1 == 1) {
                        if (acumulador1 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso1.size(); i++) {
                                System.out.println((i + 1) + " - " + caso1.elementAt(i) + " es tu " + caso11.elementAt(i) + " y su cumpleaños es " + caso111.elementAt(i));
                            }
                            System.out.print("\nEscribe el nombre del que desees borrar : ");
                            borrarcaso1 = bOrrarcaso1.nextLine();
                            System.out.println("");
                            for (int i = 0; i < caso1.size(); i++) {
                                if (borrarcaso1.equals(caso1.elementAt(i))) {
                                    caso1.removeElement(borrarcaso1);
                                    caso11.removeElement(caso11.elementAt(i));
                                    caso111.removeElement(caso111.elementAt(i));
                                    System.out.println("Contacto eliminado\n");
                                    acumulador1--;
                                }
                            }
                        } else {
                            System.out.println("\nNo hay contactos guardados\n");
                        }
                    }
                    if (borrar1 == 2) {
                        if (acumulador2 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso2.size(); i++) {
                                System.out.println((i + 1) + " - " + caso2.elementAt(i));
                            }
                            System.out.print("\nEscribe el pasatiempo que desees borrar : ");
                            borrarcaso2 = bOrrarcaso2.nextLine();
                            System.out.println("");
                            for (int i = 0; i < caso2.size(); i++) {
                                if (borrarcaso2.equals(caso2.elementAt(i))) {
                                    caso2.removeElement(borrarcaso2);
                                    System.out.println("Pasatiempo eliminado\n");
                                    acumulador2--;
                                }
                            }
                        } else {
                            System.out.println("\nNo hay pasatiempos guardados\n");
                        }
                    }
                    if (borrar1 == 3) {
                        if (acumulador4 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso4.size(); i++) {
                                System.out.println((i + 1) + " - " + caso4.elementAt(i) + " es tu " + caso44.elementAt(i) + " y su numero es " + caso444.elementAt(i));
                            }
                            System.out.print("\nEscribe el contacto de emergencia que desees borrar : ");
                            borrarcaso4 = bOrrarcaso4.nextLine();
                            System.out.println("");
                            for (int i = 0; i < caso4.size(); i++) {
                                if (borrarcaso4.equals(caso4.elementAt(i))) {
                                    caso4.removeElement(borrarcaso4);
                                    caso44.removeElement(caso44.elementAt(i));
                                    caso444.removeElement(caso444.elementAt(i));
                                    System.out.println("Contacto de emergencia eliminado\n");
                                    acumulador4--;
                                }
                            }
                        } else {
                            System.out.println("\nNo hay contactos de emergencia guardados\n");
                        }
                    }
                    if (borrar1 == 4) {
                        if (acumulador6 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso6.size(); i++) {
                                System.out.println((i + 1) + " - " + caso6.elementAt(i) + " y la hora activa es a las " + caso66.elementAt(i));
                            }
                            System.out.print("\nEscribe la medicina que desees borrar : ");
                            borrarcaso6 = bOrrarcaso6.nextLine();
                            System.out.println("");
                            for (int i = 0; i < caso6.size(); i++) {
                                if (borrarcaso6.equals(caso6.elementAt(i))) {
                                    caso6.removeElement(borrarcaso6);
                                    caso66.removeElement(caso66.elementAt(i));
                                    System.out.println("Medicina eliminado\n");
                                    acumulador6--;
                                }
                            }
                        } else {
                            System.out.println("\nNo hay medicinas guardados\n");
                        }
                    }
                    if (borrar1 == 5) {
                        if (acumuladorextra > 0) {
                            System.out.println("");
                            for (int i = 0; i < extra.size(); i++) {
                                System.out.println((i + 1) + " - " + extra.elementAt(i));
                            }
                            System.out.print("\nEscribe la alarma que desees borrar : ");
                            borrarcasoextra = bOrrarcasoextra.nextLine();
                            System.out.println("");
                            for (int i = 0; i < extra.size(); i++) {
                                if (borrarcasoextra.equals(extra.elementAt(i))) {
                                    extra.removeElement(borrarcasoextra);
                                    System.out.println("Alarma eliminado\n");
                                    acumuladorextra--;
                                }
                            }
                        } else {
                            System.out.println("\nNo hay alarmas extras\n");
                        }
                    }

                } else if (actividades.equals("MOD")) {
                    while (rutina == 1) {
                        Date hoRa = new Date();
                        SimpleDateFormat horaa = new SimpleDateFormat("HH:mm");
                        String horafija = horaa.format(hoRa);
                        if (horafija.equals(precargados.elementAt(1))) {
                            System.out.println("\nHola " + usuario + " que te parece hacer algunas de estas actividades?");
                            for (int i = 0; i < caso2.size(); i++) {
                                System.out.println((i + 1) + " - " + caso2.elementAt(i));
                            }
                            System.out.print("\n¿Deseas continuar en modo alarma?, si tu respuesta es si, espera un minuto para responder : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("SI")) {
                                actividades = "MOD";
                                
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }

                        }
                        if (horafija.equals(precargados.elementAt(2))) {
                            System.out.println("\nHola " + usuario + " aqui te muestro algunos datos tuyos ");
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Vives en " + caso5.elementAt(i) + " y tu cumpleaños es el " + caso55.elementAt(i));
                            }
                            System.out.print("\n¿Deseas continuar en modo alarma?, si tu respuesta es si, espera un minuto para responder : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("SI")) {
                                actividades = "MOD";
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }

                        }
                        if (horafija.equals(alarma1)) {
                            System.out.println("\nHola " + usuario + " aqui te muestro algunos amigos y familiares!!! ");
                            for (int i = 0; i < caso1.size(); i++) {
                                System.out.println((i + 1) + " - " + caso1.elementAt(i) + " es tu " + caso11.elementAt(i) + " y cumple años el " + caso111.elementAt(i));
                            }
                            System.out.print("\n¿Deseas continuar en modo alarma?, si tu respuesta es si, espera un minuto para responder : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("SI")) {
                                actividades = "MOD";
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }
                        }
                        if (horafija.equals(alarma3)) {
                            for (int i = 0; i < 1; i++) {
                                System.out.println("\nBuenos dias " + usuario + " ya es hora de empezar un nuevo dia junto conmigo, Eva");
                            }
                            System.out.print("\n¿Deseas continuar en modo alarma?, si tu respuesta es si, espera un minuto para responder : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("SI")) {
                                actividades = "MOD";
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }
                        }
                        if (horafija.equals(alarma33)) {
                            for (int i = 0; i < 1; i++) {
                                System.out.println("\nBuenas noches " + usuario + " ya es hora de descansar, te recomiendo, te acobijes bien, que descanses...");
                            }
                            System.out.print("\n¿Deseas continuar en modo alarma?, si tu respuesta es si, espera un minuto para responder : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("SI")) {
                                actividades = "MOD";
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }
                        }
                        if (horafija.equals(horafija)) {
                            for (int i = 0; i < caso66.size(); i++) {
                                if (horafija.equals(caso66.elementAt(i))) {
                                    System.out.println("Es hora de tomarte la medicina " + caso6.elementAt(i));
                                    System.out.print("\n¿Deseas continuar en modo alarma?, si tu respuesta es si, espera un minuto para responder : ");
                                    adicional = aDicional.nextLine();
                                    adicional = adicional.toUpperCase();
                                    if (adicional.equals("SI")) {
                                        actividades = "MOD";
                                    } else {
                                        ciclo = "NO";
                                        rutina = 0;
                                    }
                                }
                            }
                        }
                        if (horafija.equals(horafija)) {
                            for (int i = 0; i < extra.size(); i++) {
                                if (horafija.equals(extra.elementAt(i))) {
                                    System.out.println("\nLa hora " + extra.elementAt(i) + " esta detectada como una alarma extra...");
                                    System.out.print("\n¿Deseas continuar en modo alarma?, si tu respuesta es si, espera un minuto para responder : ");
                                    adicional = aDicional.nextLine();
                                    adicional = adicional.toUpperCase();
                                    if (adicional.equals("SI")) {
                                        actividades = "MOD";
                                    } else {
                                        ciclo = "NO";
                                        rutina = 0;
                                    }
                                }
                            }
                        }
                    }
                } else if (actividades.equals("BUSCAR")) {
                    do {
                        System.out.println("\n1: Dime el nombre y cumpleaños de tus familiares o amigos mas cercanos");
                        System.out.println("2: Que es lo que mas te gusta hacer en tu dia  'ordenamos tus pasatiempos alfabeticamente'");
                        System.out.println("3: Añade numeros de familiares o amigos en caso de emergencia");
                        System.out.println("4: Dime a que hora te tocan tus medicinas y el nombre de cada una de ellas");
                        System.out.println("5: Alarmas extra 'ordenamos tus alarmas cronologicamente'");
                        System.out.print("\n¿De que opcion deseas ver informacion? ");
                        ver1 = vEr1.nextInt();
                    } while (ver1 > 6);
                    if (ver1 == 1) {
                        if (acumulador1 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso1.size(); i++) {
                                System.out.println((i + 1) + " - " + caso1.elementAt(i) + " es tu " + caso11.elementAt(i) + " y su cumpleaños es " + caso111.elementAt(i));
                            }
                            System.out.println("");
                        } else {
                            System.out.println("\nNo hay contactos guardados\n");
                        }

                    }
                    if (ver1 == 2) {
                        if (acumulador2 > 0) {
                            System.out.println("");
                            Collections.sort(caso2);
                            for (int i = 0; i < caso2.size(); i++) {
                                System.out.println((i + 1) + " - " + caso2.elementAt(i));
                            }
                            System.out.println("");
                        } else {
                            System.out.println("\nNo hay pasatiempos guardados\n");
                        }

                    }
                    if (ver1 == 3) {
                        if (acumulador4 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso4.size(); i++) {
                                System.out.println((i + 1) + " - " + caso4.elementAt(i) + " es tu " + caso44.elementAt(i) + " y su numero es " + caso444.elementAt(i));
                            }
                            System.out.println("");

                        } else {
                            System.out.println("\nNo hay contactos de emergencia guardados\n");
                        }

                    }
                    if (ver1 == 4) {
                        if (acumulador6 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso6.size(); i++) {
                                System.out.println((i + 1) + " - " + caso6.elementAt(i) + " y la hora activa es a las " + caso66.elementAt(i));
                            }
                            System.out.println("");

                        } else {
                            System.out.println("\nNo hay medicinas guardados\n");
                        }

                    }
                    if (ver1 == 5) {
                        if (acumuladorextra > 0) {
                            System.out.println("");
                            Collections.sort(extra);
                            for (int i = 0; i < extra.size(); i++) {
                                System.out.println((i + 1) + " - " + extra.elementAt(i));
                            }
                            System.out.println("");
                        } else {
                            System.out.println("\nNo hay alarmas guardados\n");
                        }
                    }
                } else if (actividades.equals("APAGAR")) {
                    System.out.println("\nEspero alla sido de ayuda en este tiempo contigo!");
                    ciclo = "NO";
                    mundo = "NO";
                }
            }
        }
        }
        
        
        //ingles
        else if(idiomas==2){
           //variables ---------------------------------------------------------------------------------------------------------
        String usuario, decision, nombre, parentesco, cumpleaños, alarma1 = "0", pasatiempos, alarma3 = "0", alarma33 = "0", emergencian, emergenciap;
        String mundo = "YES", actividades, ciclo = "YES", alarmas, borrarcaso1, borrarcaso2, borrarcaso4, borrarcaso6, borrarcasoextra;
        String emergencianum, direccion, cumpleañosu, medicina, medicinah, adicional = "YES";
        int opcion, capacidad1 = 0, acumulador1 = 0, capacidad2 = 0, acumulador2 = 0, capacidad4 = 0, acumulador4 = 0, acumulador5 = 0, capacidad6 = 0;
        int capacidadalarmas, acumuladorextra = 0, borrar1, rutina = 1, acumulador6 = 0, ver1;
        //Scanner ---------------------------------------------------------------------------------------------------------
        Scanner uSuario = new Scanner(System.in);
        Scanner dEcision = new Scanner(System.in);
        Scanner oPcion = new Scanner(System.in);
        Scanner cApacidad1 = new Scanner(System.in); //empieza el caso1
        Scanner nOmbre = new Scanner(System.in);
        Scanner pArentesco = new Scanner(System.in);
        Scanner cUmpleaños = new Scanner(System.in);
        Scanner aLarma1 = new Scanner(System.in);
        Scanner cApacidad2 = new Scanner(System.in); //empieza el caso2
        Scanner pAsatiempos = new Scanner(System.in);
        Scanner aLarma3 = new Scanner(System.in); //empieza el caso3
        Scanner aLarma33 = new Scanner(System.in);
        Scanner cApacidad4 = new Scanner(System.in); //empieza el caso4
        Scanner eMergenciaN = new Scanner(System.in);
        Scanner eMergenciaP = new Scanner(System.in);
        Scanner eMergenciaNum = new Scanner(System.in);
        Scanner dIreccion = new Scanner(System.in); //empieza el caso5
        Scanner cUmpleañosu = new Scanner(System.in);
        Scanner cApacidad6 = new Scanner(System.in); //empieza el caso6
        Scanner mEdicina = new Scanner(System.in);
        Scanner mEdicinah = new Scanner(System.in);
        Scanner aCtividades = new Scanner(System.in);
        Scanner aLarmas = new Scanner(System.in); //alarmas extra
        Scanner cApacidadalarmas = new Scanner(System.in);
        Scanner bOrrarcasoextra = new Scanner(System.in);
        Scanner bOrrar1 = new Scanner(System.in); // borrar
        Scanner bOrrarcaso1 = new Scanner(System.in);
        Scanner bOrrarcaso2 = new Scanner(System.in);
        Scanner bOrrarcaso4 = new Scanner(System.in);
        Scanner bOrrarcaso6 = new Scanner(System.in);
        Scanner aDicional = new Scanner(System.in); // continuar alarmas
        Scanner vEr1 = new Scanner(System.in); // buscar info
        //vectores --------------------------------------------------------------------------------------------------------
        Vector caso1 = new Vector(100); //nombre familiares
        Vector caso11 = new Vector(100); //parentesco familiares
        Vector caso111 = new Vector(100); //cumpleaños familiares
        Vector caso2 = new Vector(100); //pasatiempos
        Vector caso4 = new Vector(100); //nombre emergencia
        Vector caso44 = new Vector(100); //parentesco emergencia
        Vector caso444 = new Vector(100); //numero emergencia
        Vector caso5 = new Vector(1); //direccion
        Vector caso55 = new Vector(1); //cumpleaños
        Vector caso6 = new Vector(100); //nombre medicina
        Vector caso66 = new Vector(100); //hora emergencia
        Vector extra = new Vector(100); //alarmas extras        
        //vectores precargados --------------------------------------------------------------------------------------------------------
        Vector precargados = new Vector(10);
        precargados.addElement("Eva");
        precargados.addElement("12:00");
        precargados.addElement("07:00");

        System.out.println("\nWelcome, my name is " + precargados.elementAt(0) + " a pleasure to be your personal assistant");
        System.out.print("to continue write your name : ");
        usuario = uSuario.nextLine();
        System.out.println("\nHi " + usuario + " do you want to configure the device?");
        System.out.print("it is not mandatory but " + precargados.elementAt(0) + " recommends it, write your decision here : ");
        decision = dEcision.nextLine();
        decision = decision.toUpperCase();
        while (mundo.equals("YES")) {
            while (decision.equals("YES")) {
                do {
                    System.out.println("\nMENU");
                    System.out.println("1: Tell me the name and birthday of your closest family or friends");
                    System.out.println("2: What do you like to do the most in your day?");
                    System.out.println("3: Tell me what time do you like to get up and what time do you sleep");
                    System.out.println("4: Add numbers of family or friends in case of emergency");
                    System.out.println("5: Write your full name, where you live and when your birthday is");
                    System.out.println("6: Tell me what time you get your medicines and the name of each of them");
                    System.out.print("\nEnter any option : ");
                    opcion = oPcion.nextInt();
                } while (opcion > 6);
                switch (opcion) {
                    case 1:
                        System.out.println("\nLet's configure the first option...");
                        System.out.print("How many acquaintances do you want to save? ");
                        capacidad1 = cApacidad1.nextInt();
                        capacidad1 = capacidad1 + acumulador1;
                        System.out.println("");
                        for (int i = acumulador1; i < capacidad1; i++) {
                            System.out.println("Person " + (i + 1));
                            System.out.print("Name : ");
                            nombre = nOmbre.nextLine();
                            caso1.insertElementAt(nombre, i);
                            System.out.print("relationship : ");
                            parentesco = pArentesco.nextLine();
                            caso11.insertElementAt(parentesco, i);
                            System.out.print("Birthday (day / month / year) : ");
                            cumpleaños = cUmpleaños.nextLine();
                            caso111.insertElementAt(cumpleaños, i);
                            acumulador1++;
                            System.out.println("");
                        }
                        System.out.println("Acquaintances saved successfully!!!");
                        System.out.print("What time do you want me to remind you? (08:04 o 15:56) ");
                        alarma1 = aLarma1.nextLine();
                        System.out.println("Saved alarm for " + alarma1 + "\n");
                        System.out.println("Remember that at any time you can add more acquaintances from the menu!!!\n");
                        System.out.print("Do you want to configure another option? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "YES";
                        break;
                    case 2:
                        System.out.println("\nLet's configure option 2 ...");
                        System.out.print("How many hobbies do you want to add? ");
                        capacidad2 = cApacidad2.nextInt();
                        capacidad2 = capacidad2 + acumulador2;
                        System.out.println("");
                        for (int i = acumulador2; i < capacidad2; i++) {
                            System.out.print("Hobby " + (i + 1) + " : ");
                            pasatiempos = pAsatiempos.nextLine();
                            caso2.insertElementAt(pasatiempos, i);
                            acumulador2++;
                        }
                        System.out.println("\nHobbies saved successfully !!!");
                        System.out.println("Remember that at any time you can add more hobbies from the menu !!!\n");
                        System.out.print("Do you want to configure another option? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "YES";
                        break;
                    case 3:
                        System.out.println("\nLet's configure option 3 ...\n");
                        for (int i = 0; i < 1; i++) {
                            System.out.print("What time do you like to wake up(08:04 o 15:56) ? ");
                            alarma3 = aLarma3.nextLine();
                            System.out.print("What time do you like to fall asleep(08:04 o 15:56) ? ");
                            alarma33 = aLarma33.nextLine();
                        }
                        System.out.println("\nAlarms saved successfully !!!");
                        System.out.println("Alarms saved for " + alarma3 + " y " + alarma33);
                        System.out.println("Remember that at any time you can modify the alarms from the menu !!!\n");
                        System.out.print("Do you want to configure another option? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "YES";
                        break;
                    case 4:
                        System.out.println("\nLet's configure option 4 ...\n");
                        System.out.println("These numbers will be used automatically when you are serious or need help,");
                        System.out.println("when you write the word 'help' all the numbers will be displayed.\n");
                        System.out.println("It is necessary to know that I am taking into account that someone is always in your care,");
                        System.out.println("therefore that person will be able to see the numbers so that they can call and save time\n");
                        System.out.print("How many emergency contacts do you want to keep? ");
                        capacidad4 = cApacidad4.nextInt();
                        capacidad4 = capacidad4 + acumulador4;
                        System.out.println("");
                        for (int i = acumulador4; i < capacidad4; i++) {
                            System.out.println("Emergency person " + (i + 1));
                            System.out.print("Name : ");
                            emergencian = eMergenciaN.nextLine();
                            caso4.insertElementAt(emergencian, i);
                            System.out.print("Relationship : ");
                            emergenciap = eMergenciaP.nextLine();
                            caso44.insertElementAt(emergenciap, i);
                            System.out.print("Number : ");
                            emergencianum = eMergenciaNum.nextLine();
                            caso444.insertElementAt(emergencianum, i);
                            acumulador4++;
                            System.out.print("\n");
                        }
                        System.out.println("Emergency contacts saved successfully !!!");
                        System.out.println("Remember that at any time you can add more emergency numbers from the menu !!!\n");
                        System.out.print("Do you want to configure another option? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "YES";
                        break;
                    case 5:
                        System.out.println("\nLet's configure option 5 ...");
                        System.out.println("");
                        for (int i = acumulador5; i < 1; i++) {
                            System.out.println("Hello again " + usuario + " here I will store some personal data !!!");
                            System.out.print("Direction : ");
                            direccion = dIreccion.nextLine();
                            caso5.insertElementAt(direccion, i);
                            System.out.print("birthday : ");
                            cumpleañosu = cUmpleañosu.nextLine();
                            caso55.insertElementAt(cumpleañosu, i);
                            acumulador5++;
                            System.out.println("");
                        }
                        System.out.println("Personal data saved successfully !!!");
                        System.out.print("Do you want to configure another option? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "YES";
                        break;
                    case 6:
                        System.out.println("\nLet's configure option 6 ...");
                        System.out.print("How many medicines do you want to add? ");
                        capacidad6 = cApacidad6.nextInt();
                        capacidad6 = capacidad6 + acumulador6;
                        System.out.println("");
                        for (int i = acumulador6; i < capacidad6; i++) {
                            System.out.println("Medicine " + (i + 1));
                            System.out.print("Name : ");
                            medicina = mEdicina.nextLine();
                            caso6.insertElementAt(medicina, i);
                            System.out.print("Hour : ");
                            medicinah = mEdicinah.nextLine();
                            caso66.insertElementAt(medicinah, i);
                            acumulador6++;
                        }
                        System.out.println("\nMedicines saved successfully !!!");
                        System.out.println("Remember that at any time you can add more medicines from the menu !!!\n");
                        System.out.print("Do you want to configure another option? ");
                        decision = dEcision.nextLine();
                        decision = decision.toUpperCase();
                        ciclo = "YES";
                        break;
                }
            }
            Date fechaHoraActuales = new Date();
            SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
            String horA = hora.format(fechaHoraActuales);
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MMMM/yyyy");
            String fechA = fecha.format(fechaHoraActuales);
            System.out.println("\nHi " + usuario + ", I hope you find yourself wonderfully! Today is " + fechA + " and the time is " + horA);
            System.out.println("\nActivities\n");
            System.out.println("menu <- you enter the menu");
            System.out.println("who are you? <- I explain my purpose");
            System.out.println("help <- I show you the emergency contacts");
            System.out.println("alarm <- you can add independent alarms from the menu");
            System.out.println("delete <- you can delete menu data or extra alarms");
            System.out.println("mod <- I will enter alarms mode, it is recommended if you are not using it so that all the alarms sound");
            System.out.println("search <- you will be able to see the ordered information of the menu options");
            System.out.println("turn off <- if you activate this I will deactivate but all data will be deleted");
            System.out.println("\nRemember that I am configured with the data you entered in the menu");
            System.out.println("therefore, these keywords are extras in case you need something else\n");
            ciclo = "YES";
            rutina = 1;
            while (ciclo.equals("YES")) {
                System.out.print("- ");
                actividades = aCtividades.nextLine();
                actividades = actividades.toUpperCase();              
                if(actividades.equals("WHO ARE YOU?")){
                    System.out.println("\nMy name is Eva, I was programmed to help people with Alzheimer's, my functions are super functional,");
                    System.out.println("for people in the first stage ... My next goal is to achieve artificial intelligence");
                    System.out.println("So I can help more people and be more functional, so in the meantime, I recommend you");
                    System.out.println("navigate my menu, configure important souls, etc, I will be there to guide you "+usuario+"\n");
                }
                if (actividades.equals("MENU")) {
                    decision = "YES";
                    ciclo = "NO";
                } else if (actividades.equals("HELP")) {
                    System.out.println("\nYou can call these contacts\n");
                    for (int i = 0; i < capacidad4; i++) {
                        System.out.println(caso4.elementAt(i) + " is your " + caso44.elementAt(i) + " --- " + caso444.elementAt(i));
                    }
                    System.out.println("emergencies --- 911\n");
                } else if (actividades.equals("ALARMA")) {
                    System.out.print("\nHow many alarms do you want to set? ");
                    capacidadalarmas = cApacidadalarmas.nextInt();
                    capacidadalarmas = capacidadalarmas + acumuladorextra;
                    System.out.println("");
                    for (int i = acumuladorextra; i < capacidadalarmas; i++) {
                        System.out.print("Write the alarm " + (i + 1) + " : ");
                        alarmas = aLarmas.nextLine();
                        extra.insertElementAt(alarmas, i);
                        acumuladorextra++;
                    }
                    System.out.println("\nSaved alarms: ");
                    for (int i = 0; i < capacidadalarmas; i++) {
                        System.out.println((i + 1) + " - " + extra.elementAt(i));
                    }
                    System.out.println("");
                } else if (actividades.equals("DELETE")) {
                    do {
                        System.out.println("\n1: Tell me the name and birthday of your closest family or friends");
                        System.out.println("2: What do you like to do the most in your day?");
                        System.out.println("3: Add numbers of family or friends in case of emergency");
                        System.out.println("4: Tell me what time you get your medicines and the name of each of them");
                        System.out.println("5: Extra alarms");
                        System.out.print("\nWhat option do you want to delete information from? ");
                        borrar1 = bOrrar1.nextInt();
                    } while (borrar1 > 6);
                    if (borrar1 == 1) {
                        if (acumulador1 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso1.size(); i++) {
                                System.out.println((i + 1) + " - " + caso1.elementAt(i) + " is your " + caso11.elementAt(i) + " and his birthday is " + caso111.elementAt(i));
                            }
                            System.out.print("\nWrite the name of the one you want to delete : ");
                            borrarcaso1 = bOrrarcaso1.nextLine();
                            System.out.println("");
                            for (int i = 0; i < caso1.size(); i++) {
                                if (borrarcaso1.equals(caso1.elementAt(i))) {
                                    caso1.removeElement(borrarcaso1);
                                    caso11.removeElement(caso11.elementAt(i));
                                    caso111.removeElement(caso111.elementAt(i));
                                    System.out.println("Contact deleted\n");
                                    acumulador1--;
                                }
                            }
                        } else {
                            System.out.println("\nNo saved contacts\n");
                        }
                    }
                    if (borrar1 == 2) {
                        if (acumulador2 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso2.size(); i++) {
                                System.out.println((i + 1) + " - " + caso2.elementAt(i));
                            }
                            System.out.print("\nWrite the hobby you want to delete : ");
                            borrarcaso2 = bOrrarcaso2.nextLine();
                            System.out.println("");
                            for (int i = 0; i < caso2.size(); i++) {
                                if (borrarcaso2.equals(caso2.elementAt(i))) {
                                    caso2.removeElement(borrarcaso2);
                                    System.out.println("Hobby removed\n");
                                    acumulador2--;
                                }
                            }
                        } else {
                            System.out.println("\nNo saved hobbies\n");
                        }
                    }
                    if (borrar1 == 3) {
                        if (acumulador4 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso4.size(); i++) {
                                System.out.println((i + 1) + " - " + caso4.elementAt(i) + " is your " + caso44.elementAt(i) + " and his number is " + caso444.elementAt(i));
                            }
                            System.out.print("\nWrite the emergency contact you want to delete: ");
                            borrarcaso4 = bOrrarcaso4.nextLine();
                            System.out.println("");
                            for (int i = 0; i < caso4.size(); i++) {
                                if (borrarcaso4.equals(caso4.elementAt(i))) {
                                    caso4.removeElement(borrarcaso4);
                                    caso44.removeElement(caso44.elementAt(i));
                                    caso444.removeElement(caso444.elementAt(i));
                                    System.out.println("Emergency contact removed\n");
                                    acumulador4--;
                                }
                            }
                        } else {
                            System.out.println("\nNo saved emergency contacts\n");
                        }
                    }
                    if (borrar1 == 4) {
                        if (acumulador6 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso6.size(); i++) {
                                System.out.println((i + 1) + " - " + caso6.elementAt(i) + " and the active time is at " + caso66.elementAt(i));
                            }
                            System.out.print("\nWrite the medicine you want to delete : ");
                            borrarcaso6 = bOrrarcaso6.nextLine();
                            System.out.println("");
                            for (int i = 0; i < caso6.size(); i++) {
                                if (borrarcaso6.equals(caso6.elementAt(i))) {
                                    caso6.removeElement(borrarcaso6);
                                    caso66.removeElement(caso66.elementAt(i));
                                    System.out.println("Medicine removed\n");
                                    acumulador6--;
                                }
                            }
                        } else {
                            System.out.println("\nThere are no stored medicines\n");
                        }
                    }
                    if (borrar1 == 5) {
                        if (acumuladorextra > 0) {
                            System.out.println("");
                            for (int i = 0; i < extra.size(); i++) {
                                System.out.println((i + 1) + " - " + extra.elementAt(i));
                            }
                            System.out.print("\nWrite the alarm you want to delete : ");
                            borrarcasoextra = bOrrarcasoextra.nextLine();
                            System.out.println("");
                            for (int i = 0; i < extra.size(); i++) {
                                if (borrarcasoextra.equals(extra.elementAt(i))) {
                                    extra.removeElement(borrarcasoextra);
                                    System.out.println("Alarm removed\n");
                                    acumuladorextra--;
                                }
                            }
                        } else {
                            System.out.println("\nThere are no extra alarms\n");
                        }
                    }

                } else if (actividades.equals("MOD")) {
                    while (rutina == 1) {
                        Date hoRa = new Date();
                        SimpleDateFormat horaa = new SimpleDateFormat("HH:mm");
                        String horafija = horaa.format(hoRa);
                        if (horafija.equals(precargados.elementAt(1))) {
                            System.out.println("\nHi " + usuario + " how about doing some of these activities?");
                            for (int i = 0; i < caso2.size(); i++) {
                                System.out.println((i + 1) + " - " + caso2.elementAt(i));
                            }
                            System.out.print("\nDo you want to continue in alarm mode? If your answer is yes, wait a minute to answer : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("YES")) {
                                actividades = "MOD";
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }

                        }
                        if (horafija.equals(precargados.elementAt(2))) {
                            System.out.println("\nHi " + usuario + " here I show you some of your data ");
                            for (int i = 0; i < 1; i++) {
                                System.out.println("You live in " + caso5.elementAt(i) + " and your birthday is on " + caso55.elementAt(i));
                            }
                            System.out.print("\nDo you want to continue in alarm mode? If your answer is yes, wait a minute to answer : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("YES")) {
                                actividades = "MOD";
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }

                        }
                        if (horafija.equals(alarma1)) {
                            System.out.println("\nHi " + usuario + " here I show you some friends and family !!! ");
                            for (int i = 0; i < caso1.size(); i++) {
                                System.out.println((i + 1) + " - " + caso1.elementAt(i) + " is your " + caso11.elementAt(i) + " and his birthday is " + caso111.elementAt(i));
                            }
                            System.out.print("\nDo you want to continue in alarm mode? If your answer is yes, wait a minute to answer : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("YES")) {
                                actividades = "MOD";
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }
                        }
                        if (horafija.equals(alarma3)) {
                            for (int i = 0; i < 1; i++) {
                                System.out.println("\nGood morning " + usuario + " it's time to start a new day together with me, Eva");
                            }
                            System.out.print("\nDo you want to continue in alarm mode? If your answer is yes, wait a minute to answer : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("YES")) {
                                actividades = "MOD";
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }
                        }
                        if (horafija.equals(alarma33)) {
                            for (int i = 0; i < 1; i++) {
                                System.out.println("\nGood night " + usuario + " it is time to rest, I recommend you, take shelter well, rest ...");
                            }
                            System.out.print("\nDo you want to continue in alarm mode? If your answer is yes, wait a minute to answer : ");
                            adicional = aDicional.nextLine();
                            adicional = adicional.toUpperCase();
                            if (adicional.equals("YES")) {
                                actividades = "MOD";
                            } else {
                                ciclo = "NO";
                                rutina = 0;
                            }
                        }
                        if (horafija.equals(horafija)) {
                            for (int i = 0; i < caso66.size(); i++) {
                                if (horafija.equals(caso66.elementAt(i))) {
                                    System.out.println("Time to take your medicine " + caso6.elementAt(i));
                                    System.out.print("\nDo you want to continue in alarm mode? If your answer is yes, wait a minute to answer : ");
                                    adicional = aDicional.nextLine();
                                    adicional = adicional.toUpperCase();
                                    if (adicional.equals("YES")) {
                                        actividades = "MOD";
                                    } else {
                                        ciclo = "NO";
                                        rutina = 0;
                                    }
                                }
                            }
                        }
                        if (horafija.equals(horafija)) {
                            for (int i = 0; i < extra.size(); i++) {
                                if (horafija.equals(extra.elementAt(i))) {
                                    System.out.println("\nThe time " + extra.elementAt(i) + " it is detected as an extra alarm ...");
                                    System.out.print("\nDo you want to continue in alarm mode? If your answer is yes, wait a minute to answer: ");
                                    adicional = aDicional.nextLine();
                                    adicional = adicional.toUpperCase();
                                    if (adicional.equals("YES")) {
                                        actividades = "MOD";
                                    } else {
                                        ciclo = "NO";
                                        rutina = 0;
                                    }
                                }
                            }
                        }
                    }
                } else if (actividades.equals("SEARCH")) {
                    do {
                        System.out.println("\n1: Tell me the name and birthday of your closest family or friends");
                        System.out.println("2: What do you like to do the most in your day? 'We order your hobbies alphabetically'");
                        System.out.println("3: Add numbers of family or friends in case of emergency");
                        System.out.println("4: Tell me what time you get your medicines and the name of each one");
                        System.out.println("5: Extra alarms 'we order your alarms chronologically'");
                        System.out.print("\nWhat option do you want to see information? ");
                        ver1 = vEr1.nextInt();
                    } while (ver1 > 6);
                    if (ver1 == 1) {
                        if (acumulador1 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso1.size(); i++) {
                                System.out.println((i + 1) + " - " + caso1.elementAt(i) + " is your " + caso11.elementAt(i) + " and his birthday is " + caso111.elementAt(i));
                            }
                            System.out.println("");
                        } else {
                            System.out.println("\nNo saved contacts\n");
                        }

                    }
                    if (ver1 == 2) {
                        if (acumulador2 > 0) {
                            System.out.println("");
                            Collections.sort(caso2);
                            for (int i = 0; i < caso2.size(); i++) {
                                System.out.println((i + 1) + " - " + caso2.elementAt(i));
                            }
                            System.out.println("");
                        } else {
                            System.out.println("\nNo saved hobbies\n");
                        }

                    }
                    if (ver1 == 3) {
                        if (acumulador4 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso4.size(); i++) {
                                System.out.println((i + 1) + " - " + caso4.elementAt(i) + " is your " + caso44.elementAt(i) + " and his number is " + caso444.elementAt(i));
                            }
                            System.out.println("");

                        } else {
                            System.out.println("\nNo saved emergency contacts\n");
                        }

                    }
                    if (ver1 == 4) {
                        if (acumulador6 > 0) {
                            System.out.println("");
                            for (int i = 0; i < caso6.size(); i++) {
                                System.out.println((i + 1) + " - " + caso6.elementAt(i) + " and the active time is at " + caso66.elementAt(i));
                            }
                            System.out.println("");

                        } else {
                            System.out.println("\nThere are no stored medicines\n");
                        }

                    }
                    if (ver1 == 5) {
                        if (acumuladorextra > 0) {
                            System.out.println("");
                            Collections.sort(extra);
                            for (int i = 0; i < extra.size(); i++) {
                                System.out.println((i + 1) + " - " + extra.elementAt(i));
                            }
                            System.out.println("");
                        } else {
                            System.out.println("\nNo saved alarms\n");
                        }
                    }
                } else if (actividades.equals("TURN OFF")) {
                    System.out.println("\nI hope it has been helpful in this time with you!");
                    ciclo = "NO";
                    mundo = "NO";
                }
            }
        } 
        }
    }
}