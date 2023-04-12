import javax.swing.JOptionPane;

public class Temperatura {

    public double convertirCelsius(double cantidad){
        return (cantidad - 32) * 5/9;
    }
    public double convertirFahrenheit(double cantidad){
        return (cantidad * 9/5) + 32;
    }
    public double convertirKelvin(double cantidad){
        return cantidad + 273.15;
    }
    public double convertirRankine(double cantidad){
        return cantidad + 459.67;
    }
    public double convertirReaumur(double cantidad){
        return (cantidad * 4/5);
    }
    public double convertirRomer(double cantidad){
        return (cantidad - 7.5) * 40/21;
    }

    //Funcion para ingresar la cantidad a convertir de la temperatura y la temperatura a convertir y retornar el resultado de la conversion usando jOptionPane
    public double convertirTemperatura(String opcion, double cantidad){
        double resultado = 0;
        switch (opcion) {
            case "Celsius":
                resultado = convertirCelsius(cantidad);
                break;
            case "Fahrenheit":
                resultado = convertirFahrenheit(cantidad);
                break;
            case "Kelvin":
                resultado = convertirKelvin(cantidad);
                break;
            case "Rankine":
                resultado = convertirRankine(cantidad);
                break;
            case "Reaumur":
                resultado = convertirReaumur(cantidad);
                break;
            case "Romer":
                resultado = convertirRomer(cantidad);
                break;
        }
        return resultado;
    }
}
