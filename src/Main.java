import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Opcion para elegir si se quiere convertir temperaturas usando JOptionPane
        do {

        String opcion = JOptionPane.showInputDialog("Ingrese la opcion que desea convertir: \n1. Monedas \n2. Temperatura");

        //Switch para elegir la opcion de moneda o temperatura
        switch (opcion) {
            case "1":
                // Opcion para elegir la moneda a convertir usando JOptionPane
                String opcion3 = JOptionPane.showInputDialog("Ingrese la opcion a convertir: \n1. Quetzales a Dolares \n2. Quetzales a Euros \n3. Quetzales a Libras \n4. Quetzales a Yenes \n5. Quetzales a Yuanes \n6. Quetzales a Pesos \n7. Quetzales a Reales \n8. Quetzales a Colones \n9. Dolares a Quetzales \n10. Euros a Quetzales \n11. Libras a Quetzales \n12. Yenes a Quetzales \n13. Yuanes a Quetzales \n14. Pesps a Quetzales \n15. Reales a Quetzales \n16. Colones a Quetzales");
                double cantidad;

                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir: "));
                // Instancia de la clase Monedas
                Monedas moneda = new Monedas();

                switch (opcion3) {

                    case "1":
                        JOptionPane.showMessageDialog(null, "La cantidad de Quetzales a convertir es: " + moneda.convertirQuetzalesADolares(cantidad));
                        break;
                    case "2":
                        JOptionPane.showMessageDialog(null, "La cantidad de Dolares a convertir es: " + moneda.convertirQuetzalesAEuros(cantidad));
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, "La cantidad de Euros a convertir es: " + moneda.convertirQuetzalesALibras(cantidad));
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, "La cantidad de Libras a convertir es: " + moneda.convertirQuetzalesAYenes(cantidad));
                        break;
                    case "5":
                        JOptionPane.showMessageDialog(null, "La cantidad de Yenes a convertir es: " + moneda.convertirQuetzalesAYuanes(cantidad));
                        break;
                    case "6":
                        JOptionPane.showMessageDialog(null, "La cantidad de Yuanes a convertir es: " + moneda.convertirQuetzalesAPesos(cantidad));
                        break;
                    case "7":
                        JOptionPane.showMessageDialog(null, "La cantidad de Pesos a convertir es: " + moneda.convertirQuetzalesAReales(cantidad));
                        break;
                    case "8":
                        JOptionPane.showMessageDialog(null, "La cantidad de Reales a convertir es: " + moneda.convertirQuetzalesAColones(cantidad));
                        break;
                    case "9":
                        JOptionPane.showMessageDialog(null, "La cantidad de Dolares a convertir es: " + moneda.convertirDolaresAQuetzales(cantidad));
                        break;
                    case "10":
                        JOptionPane.showMessageDialog(null, "La cantidad de Euros a convertir es: " + moneda.convertirEurosAQuetzales(cantidad));
                        break;
                    case "11":
                        JOptionPane.showMessageDialog(null, "La cantidad de Libras a convertir es: " + moneda.convertirLibrasAQuetzales(cantidad));
                        break;
                    case "12":
                        JOptionPane.showMessageDialog(null, "La cantidad de Yenes a convertir es: " + moneda.convertirYenesAQuetzales(cantidad));
                        break;
                    case "13":
                        JOptionPane.showMessageDialog(null, "La cantidad de Yuanos a convertir es: " + moneda.convertirYuanesAQuetzales(cantidad));
                        break;
                    case "14":
                        JOptionPane.showMessageDialog(null, "La cantidad de Pesos a convertir es: " + moneda.convertirPesosAQuetzales(cantidad));
                        break;
                    case "15":
                        JOptionPane.showMessageDialog(null, "La cantidad de Reales a convertir es: " + moneda.convertirRealesAQuetzales(cantidad));
                        break;
                    case "16":
                        JOptionPane.showMessageDialog(null, "La cantidad de Colones a convertir es: " + moneda.convertirColonesAQuetzales(cantidad));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                        break;
                }
                break;
            case "2":
                //Switch para elegir la temperatura a convertir
                String opcion2 = JOptionPane.showInputDialog("Ingrese la opcion que desea convertir: \n1. Celsius \n2. Fahrenheit \n3. Kelvin \n4. Rankine \n5. Reaumur \n6. Romer");
                // Cantidad a convertir usando JOptionPane

                cantidad  = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir: "));
                // Instancia de la clase Temperatura
                Temperatura temperatura = new Temperatura();
                switch (opcion2) {
                    case "1":
                        JOptionPane.showMessageDialog(null, "La cantidad de Celsius a convertir es: " + temperatura.convertirCelsius(cantidad));
                        break;
                    case "2":
                        JOptionPane.showMessageDialog(null, "La cantidad de Fahrenheit a convertir es: " + temperatura.convertirFahrenheit(cantidad));
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, "La cantidad de Kelvin a convertir es: " + temperatura.convertirKelvin(cantidad));
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, "La cantidad de Rankine a convertir es: "
                                + temperatura.convertirRankine(cantidad));
                        break;
                    case "5":
                        JOptionPane.showMessageDialog(null, "La cantidad de Reaumur a convertir es: "
                                + temperatura.convertirReaumur(cantidad));
                        break;
                    case "6":
                        JOptionPane.showMessageDialog(null, "La cantidad de Romer a convertir es: " + temperatura.convertirRomer(cantidad));
                        break;
                }
                break;
        }
        } while (JOptionPane.showConfirmDialog(null, "Desea continuar?") == 0);

    }
    
}