import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Serializacion mClase=new Serializacion("ola",-7,2.7e10);

        File ficheiro=new File(System.getProperty("user.dir")+"/src/main/java/serial.txt");

        ObjectOutputStream obxOutput=new ObjectOutputStream(new FileOutputStream(ficheiro));

        ObjectInputStream obxInput=new ObjectInputStream(new FileInputStream(ficheiro));

        obxOutput.writeObject(mClase);
        obxOutput.close();

        System.out.println("obx: -> "+obxInput.readObject().toString());
        obxInput.close();

        System.out.println("num1: "+mClase.getNum1());

    }
}
