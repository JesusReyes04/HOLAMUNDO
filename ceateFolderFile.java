package demo2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class createFileFolder{
    public static void main(String[] args) {
        String dirName;
        String fileName;
        String fileExtension;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu directorio");
        dirName=leer.nextLine();
        File rutaDir = new File("C:\\VisualStudioProyectos\\Java\\demo2\\"+dirName);
        System.out.println("Introduce el nombre de tu archivo");
        fileName=leer.nextLine();
        do{
            System.out.println("Que tipo de archivo quieres crear");
            fileExtension=leer.nextLine();
        }while(fileExtension.startsWith("."));
        File rutaFile = new File("C:\\VisualStudioProyectos\\Java\\demo2\\"+dirName+"\\"+fileName+"."+fileExtension);
        rutaDir.mkdir();
        System.out.println((rutaDir.exists())?"Folder creado con exito":"No ha sido creado");
        try {
            rutaFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((rutaFile.exists())?"File creado con exito":"No ha sido creado");

    }
}
