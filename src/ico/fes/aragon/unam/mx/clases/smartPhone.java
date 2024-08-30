package ico.fes.aragon.unam.mx.clases;

public class smartPhone {

    private String Marca;

    private int Anio;

    private int memoriaRam;

    private int Almacenamiento;

    private String Color;

    public smartPhone(){

    }

    public smartPhone(String marca, int anio, int memoriaRam, int almacenamiento, String color) {
        Marca = marca;
        Anio = anio;
        this.memoriaRam = memoriaRam;
        Almacenamiento = almacenamiento;
        Color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        Almacenamiento = almacenamiento;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "smartPhone{" +
                "Marca='" + Marca + '\'' +
                ", Anio=" + Anio +
                ", memoriaRam=" + memoriaRam +
                ", Almacenamiento=" + Almacenamiento +
                ", Color='" + Color + '\'' +
                '}';
    }
}
