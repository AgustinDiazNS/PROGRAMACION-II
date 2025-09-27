import java.util.Scanner; 
import java.util.HashSet;
public class ActTPIV {

public static class EMPLEADO{
    //ATRIBUTOS INSTANCIADOS
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    //ATRIBUTOS DE CLASE
    static int cantidadempleados;
    static int idauto=0;
    public static HashSet<Integer> idsUsados = new HashSet<>();
    
    //GETTERS Y SETTERS
    public void setid(int id){
        if(idsUsados.contains(id)){
            System.out.println("La id ingresada es invalida, se asignara una automaticamente");
            this.id=idauto;
            idauto++;
            idsUsados.add(id);
        }
        else{
        idsUsados.add(id);
        this.id=id;
    }
    }
        public int getid(){
           return this.id;
        }
  
        public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return this.nombre;
    }
        public void setpuesto(String puesto){
        this.puesto=puesto;
    }
    public String getpuesto(){
        return this.puesto;
    }
        public boolean setsalario(double salario){
            if(salario<=0){
                return false;
            }
            else{
        this.salario=salario;
        return true;
    }
        }
    public double getsalario(){
        return this.salario;
    }

    //CONSTRUCTORES
    
    public EMPLEADO(String NOMBRE){
        this.nombre=NOMBRE;
        this.puesto="Indefinido";
        this.id=idauto;
        this.salario=0;
        idsUsados.add(this.id);
        idauto++;
        cantidadempleados++;
    }
    public EMPLEADO(String NOMBRE, String PUESTO){
        this.nombre=NOMBRE;
        this.puesto=PUESTO;
        this.id=idauto;
        this.salario=0;
        idsUsados.add(this.id);
        idauto++;
        cantidadempleados++;
    }
    public EMPLEADO(String NOMBRE, String PUESTO, double salario){
        this.nombre=NOMBRE;
        this.puesto=PUESTO;
        this.id=idauto;
        this.salario=salario;
        idsUsados.add(this.id);
        idauto++;
        cantidadempleados++;
    }
        public EMPLEADO(String NOMBRE, String PUESTO, double salario, int id){
        this.nombre=NOMBRE;
        this.puesto=PUESTO;
        setid(id);
        this.salario=salario;
        cantidadempleados++;
    }
    //Despido de empleados
     public void despedir(){
         System.out.println(this.nombre+"(con id "+this.id+" )"+"ha sido despedida");
         idsUsados.remove(this.id);
         this.nombre=null;
         this.id=-1;
         this.salario=0;
         this.puesto=null;
         cantidadempleados--;
     }
    
     //Definir salarios
     public void definirsalario(){
         Boolean valido=false;
         Scanner sc=new Scanner(System.in);
         do{
        System.out.println("Asigne un salario mayor a 0: ");
        double salarioo= sc.nextDouble();
        valido=setsalario(salarioo);
        if (valido){
            System.out.println("Numero invalido, intente nuevamente");
        }
         setsalario(salarioo);  
     } while(!valido);
         }
     
     //Actualizar salarios
     
     public void actualizarsalario(double porc, String esporcentaje){
         double salarion=this.getsalario();
        salarion+=salarion*(porc/100);
        setsalario(salarion);
     }
     public void actualizarsalario(double numero){
         double salarion=this.getsalario();
        salarion+=numero;
        setsalario(salarion);
     }
 @Override
    public String toString(){
    return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario;
}
     public static void DeclararTotalempleados(){
    System.out.println("El numero total de empleados es: "+cantidadempleados);
    
}
     
    } 



//CODIGO QUE SE EJECUTARA
     public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
    EMPLEADO Maria=new EMPLEADO("Maria","Operario de planta",500000);
    EMPLEADO Jose=new EMPLEADO("Jose");
    EMPLEADO Carlos=new EMPLEADO("Carlos","Vendedor",400000,2);
    
    System.out.println(Maria);
    System.out.println(Jose);
    System.out.println(Carlos);
    
    EMPLEADO.DeclararTotalempleados();
    
    Jose.definirsalario();
    System.out.println("SALARIO ACTUALIZADO: El salario de Jose es: $"+Jose.getsalario());
    Jose.actualizarsalario(50,"%");
    System.out.println("SALARIO ACTUALIZADO: El salario de Jose es: $"+Jose.getsalario());
    Jose.actualizarsalario(40000);
    System.out.println("SALARIO ACTUALIZADO: El salario de Jose es: $"+Jose.getsalario());
    
    System.out.println("Ingrese el puesto que quiere asignar: ");
    String nuevopuesto=sc.nextLine();
    Jose.setpuesto(nuevopuesto);
    System.out.println(Jose);
    
    Maria.despedir();
    EMPLEADO.DeclararTotalempleados();   
}
}





