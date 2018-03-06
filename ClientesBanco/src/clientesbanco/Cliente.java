package clientesbanco;


public class Cliente {
   private String apellido;
   private String nombre;
   private int edad;
   
   public Cliente(String nombre,String apellido,int edad){
       this.apellido = apellido;
       this.edad = edad;
       this.nombre = nombre;
   }
  public void setApellido(String ape){
      this.apellido=ape;
  }
  public String getApellido(){
      return this.apellido;
  }
  public void setNombre(String nomb){
      this.nombre=nomb;
  }
  public String getNombre(){
      return this.nombre;
  }
  public void setEdad(int ed){
      this.edad=ed;
  }
  public int getEdad(){
      return this.edad;
  }

    @Override
    public String toString() {
        return "Nombre : - "+this.nombre+" - Apellido : - "+this.apellido+" - Edad : "+this.edad;
    }
  
}
