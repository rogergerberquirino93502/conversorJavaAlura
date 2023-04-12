    public class Monedas {
        //Conversor de monedas
        double quetzales = 7.79;
        double dolares = 1.00;
        double euros = 8.86;
        double libras = 0.76;
        double yenes = 109.00;
        double yuanes = 6.92;
        double pesos = 19.00;
        double reales = 3.74;
        double colones = 580.00;

        public double convertirDolaresAQuetzales(double cantidad){
            return cantidad * quetzales / dolares;
        }

        public double convertirQuetzalesADolares(double cantidad){
            return cantidad * dolares / quetzales;
        }

        public double convertirEurosAQuetzales(double cantidad){
            return cantidad * quetzales / euros;
        }

        public double convertirQuetzalesAEuros(double cantidad){
            return cantidad * euros / quetzales;
        }

        public double convertirLibrasAQuetzales(double cantidad){
            return cantidad * quetzales / libras;
        }

        public double convertirQuetzalesALibras(double cantidad){
            return cantidad * libras / quetzales;
        }

        public double convertirYenesAQuetzales(double cantidad){
            return cantidad * quetzales / yenes;
        }

        public double convertirQuetzalesAYenes(double cantidad){
            return cantidad * yenes / quetzales;
        }

        public double convertirYuanesAQuetzales(double cantidad){
            return cantidad * quetzales / yuanes;
        }

        public double convertirQuetzalesAYuanes(double cantidad){
            return cantidad * yuanes / quetzales;
        }

        public double convertirPesosAQuetzales(double cantidad){
            return cantidad * quetzales / pesos;
        }

        public double convertirQuetzalesAPesos(double cantidad){
            return cantidad * pesos / quetzales;
        }

        public double convertirRealesAQuetzales(double cantidad){
            return cantidad * quetzales / reales;
        }

        public double convertirQuetzalesAReales(double cantidad){
            return cantidad * reales / quetzales;
        }

        public double convertirColonesAQuetzales(double cantidad){
            return cantidad * quetzales / colones;
        }

        public double convertirQuetzalesAColones(double cantidad){
            return cantidad * colones / quetzales;
        }


    }

