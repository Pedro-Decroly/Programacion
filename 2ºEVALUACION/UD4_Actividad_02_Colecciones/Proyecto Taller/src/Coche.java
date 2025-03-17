
public class Coche {
    
        public static final String remove = null;
        private String marca;
        private String color;

// Constructor 
    public Coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

// Metodo Getters
    public String getMarca() {
        return marca;
    }

    public String getcolor() {
        return color;
    }

//Metodos Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

//Metodo To String 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coche{");
        sb.append("marca=").append(marca);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
}