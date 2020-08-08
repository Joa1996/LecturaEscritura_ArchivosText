
package lecturaescritura_archivostext;
//En java tenemos la posibilidad de poder leer y escibir en archivos planos como por ej. archivos de texto, esto se recomienda para 
//cuando tenemos que leer o escribir  datos pequeños, para datos o informacion mas grande se recomienda usar Base de Datos
import java.io.*;


public class LecturaEscritura_ArchivosText 
{

    public static void main(String[] args)
    {
    
    String text;
    try //Se utiliza Try catch ya que hay que manejar las exepciones, en este caso seria la exepcion que ocurriria en caso de que no encuentre el Archivo TXT 
    {
//    Se utiliza dentro de la clase FileReader un metodo para leer los archivos 
    FileReader fr=new FileReader("Archivo.txt");  //Debemos crear dentro del Archivo un TXT con el Nombre "Archivo"
    BufferedReader br=new BufferedReader(fr);//Usamos este metodo para leer las lineas del archivo plano
    String Linea="";
    
    while(Linea!=null)
    {
    Linea=br.readLine();
    System.out.println(Linea);
    }   
      
    }
    catch(Exception err)
            {
                System.out.println(err.getMessage());
                
            }
//     Ahora probamos crear y escribir un Archivo TXT
    try{
    FileWriter  fw=new FileWriter("Probando.txt");
    BufferedWriter bw=new BufferedWriter(fw); 
    bw.write("Hola Probando"+"\n");
    bw.write("Todo Bien x Ahi!!!");
    bw.close();//Cerrar Fichero siempre
    
    }
    catch(Exception err)
            {
                System.out.println(err.getMessage());
            }
            }
    
}
