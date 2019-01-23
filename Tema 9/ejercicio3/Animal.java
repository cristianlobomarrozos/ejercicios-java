public abstract class Animal {
  private int edad;
  private String sexo;
  
  public Animal () {
    this.edad = 0;
    this.sexo = "HEMBRA";
  }
  
  public Animal (String sexo) {
    this.edad = 0;
    this.sexo = sexo;
  }
  
  public void setEdad (int tiempo) {
    this.edad = tiempo;
    
  }
  
  public int getEdad () {
    return this.edad;
  }
  
  public String toString () {
    String salida = "";
    
    salida = salida + "Sexo: " + this.sexo + "\nEdad: " + this.edad;
    
    return salida; 
  }
}
