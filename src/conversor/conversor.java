package conversor;

import javax.swing.JOptionPane;

public class conversor {

	public static void main (String[]Args) {
		//exchange 20/04/2023
		double exchangeRateSameCurrency = 1;
        double exchangeRateUSDToEUR = 0.90;
        double exchangeRateUSDToGBP = 0.80;
        double exchangeRateUSDToJPY = 134.17;
        double exchangeRateUSDToKRW = 1330.36;
        double exchangeRateEURToGBP = 0.89;
        double exchangeRateEURToJPY = 148.91;
        double exchangeRateEURToKRW = 1476.23;
        double exchangeRateGBPToJPY = 166.84;
        double exchangeRateGBPToKRW = 1654.30;
        double exchangeRateJPYToKRW = 9.92;
		double amount;
        double result;
		
		
		
        Object[] mainUnits = {"Temperatura", "Longitud", "Divisas"};
        Object unitChoice = JOptionPane.showInputDialog(null, "Seleccione la unidad que desea convertir", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, mainUnits, mainUnits[2]);
        
        if (unitChoice == null){
            JOptionPane.showMessageDialog(null, "Error, cerrando el programa");
            return;
        }
        if (unitChoice.equals("Temperatura")){
            Object[] tempUnits = {"°C", "°F", "K"};
            Object tempChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, tempUnits, null);
            Object tempChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, tempUnits,null);
            switch (tempChoice1 + " to " + tempChoice2) {
                case "°C to °C" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °C:"));
                    result = amount;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °C equivalen a " + String.format("%.3f", result) + " °C.");
                }
                case "°C to °F" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °C"));
                    result = (amount *1.8)+32;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °C equivalen a " + String.format("%.3f", result) + " °F." );
                }
                case "°C to K" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °C"));
                    result =amount + 273.15;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °C equivalen a " + String.format("%.3f", result) + " K.");
                }
                case "°F to °C" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °F"));
                    result = (amount - 32)/1.8;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °F equivalen a " + String.format("%.3f", result) + " °C.");
                }
                case "°F to °F" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °F"));
                    result = amount;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °F equivalen a " + String.format("%.3f", result) + " °F.");
                }
                case "°F to K" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en °F"));
                    result = ((amount - 32)/1.8) + 273.15;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °F equivalen a " + String.format("%.3f", result) + " K.");
                }
                case "K to °C" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en K"));
                    result = amount - 273.15;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " K equivalen a " + String.format("%.3f", result) + " °C.");
                }
                case "K to °F" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en K"));
                    result = ((amount - 273.15) * 1.8) + 32;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " K equivalen a " + String.format("%.3f", result) + " °F.");
                }
                case "K to K" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en K"));
                    result = amount;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " K equivalen a " + String.format("%.3f", result) + " K.");
                }
                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
            }
               
            }
        if (unitChoice.equals("Longitud")){
                Object[] lengthUnits = {"m", "km", "ft", "mi"};
                Object lengthChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, lengthUnits, null);
                Object lengthChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, lengthUnits,null);
                switch (lengthChoice1 + " to " + lengthChoice2) {
                case "m to m" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la unidad en M"));
                	result=amount;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount)+" m equevale a " + String.format("%.3f", result) + "m.");
                	}
                case "m to km" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la unidad en M"));
                	result=amount * 0.001;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount)+" m equevale a " + String.format("%.3f", result) + "m.");
                	}
                case "m to ft" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la unidad en M"));
                	result=amount * 3.2808;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount)+" m equevale a " + String.format("%.3f", result) + "m.");
                }
                case "m to mi" -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en m"));
                    result = amount * 0.00062137;
                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m equivalen a " + String.format("%.3f", result) + " mi.");
                }
                case "km to m" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en km"));
                	result = amount * 1000;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "km equivalen a " + String.format("%.3f" , result) + " m.");
                }
                case "km to km" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en km"));
                	result = amount;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "km equivalen a " + String.format("%.3f" , result) + " km.");
                }
                case "km to ft" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en km"));
                	result = amount * 3280.84;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "km equivalen a " + String.format("%.3f" , result) + " ft.");
                }
                case "km to mi" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en km"));
                	result = amount * 0.621371;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "km equivalen a " + String.format("%.3f" , result) + " mi.");
                }
                case "ft to m" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en ft"));
                	result = amount * 0.3048;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "ft equivalen a " + String.format("%.3f" , result) + " m.");
                }
                case "ft to km" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en ft"));
                	result = amount * 0.0003048;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "ft equivalen a " + String.format("%.3f" , result) + " km.");
                }
                case "ft to ft" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en ft"));
                	result = amount;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "ft equivalen a " + String.format("%.3f" , result) + " ft.");
                }
                case "ft to mi" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en ft"));
                	result = amount * 0.000189394;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "ft equivalen a " + String.format("%.3f" , result) + " mi.");
                }
                case "mi to m" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en mi"));
                	result = amount * 1609.34;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "mi equivalen a " + String.format("%.3f" , result) + " m.");
                }
                case "mi to km" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en mi"));
                	result = amount * 1.60934;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "mi equivalen a " + String.format("%.3f" , result) + " km.");
                }
                case "mi to ft" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en mi"));
                	result = amount * 5280;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "mi equivalen a " + String.format("%.3f" , result) + " ft.");
                }
                case "mi to mi" ->{
                	amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud en mi"));
                	result = amount;
                	JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + "mi equivalen a " + String.format("%.3f" , result) + " mi.");
                }
                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");

              }
            
            }
        if (unitChoice.equals("Divisas")){
                    Object[] currencyUnits = {"USD", "EUR", "GBP", "JPY", "KRW"};
                    Object currencyChoice1 = JOptionPane.showInputDialog(null,"Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, currencyUnits, null);
                    Object currencyChoice2 = JOptionPane.showInputDialog(null,"Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, currencyUnits,null);
                    switch (currencyChoice1 + " to " + currencyChoice2) {
                        case "USD to USD" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto USD:"));
                            result = amount * exchangeRateSameCurrency;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " USD.");
                        }
                        case "USD to EUR" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en USD"));
                            result = amount * exchangeRateUSDToEUR;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " EUR." );
                        }
                        case "USD to GBP" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en USD"));
                            result = amount * exchangeRateUSDToGBP;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " GBP.");
                        }
                        case "USD to JPY" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en USD"));
                            result = amount * exchangeRateUSDToJPY;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " JPY.");
                        }
                        case "USD to KRW" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en USD"));
                            result = amount * exchangeRateUSDToKRW;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " KRW.");
                        }
                        case "GBP to USD" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                            result = amount / exchangeRateUSDToGBP;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " USD.");
                        }
                        case "GBP to EUR" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                            result = amount / exchangeRateEURToGBP;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " EUR.");
                        }
                        case "GBP to GBP" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                            result = amount * exchangeRateSameCurrency;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " GBP.");
                        }
                        case "GBP to JPY" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                            result = amount * exchangeRateGBPToJPY;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " JPY.");
                        }
                        case "GBP to KRW" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en GBP"));
                            result = amount * exchangeRateGBPToKRW;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " KRW.");
                        }
                        case "EUR to USD" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                            result = amount / exchangeRateUSDToEUR;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " USD.");
                        }
                        case "EUR to EUR" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                            result = amount * exchangeRateSameCurrency;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " EUR.");
                        }
                        case "EUR to GBP" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                            result = amount * exchangeRateEURToGBP;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " GBP.");
                        }
                        case "EUR to JPY" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                            result = amount * exchangeRateEURToJPY;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " JPY.");
                        }
                        case "EUR to KRW" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en EUR"));
                            result = amount * exchangeRateEURToKRW;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " KRW.");
                        }
                        case "JPY to USD" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                            result = amount / exchangeRateUSDToJPY;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " USD.");
                        }
                        case "JPY to EUR" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                            result = amount / exchangeRateEURToJPY;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " EUR.");
                        }
                        case "JPY to GBP" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                            result = amount / exchangeRateGBPToJPY;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " GBP.");
                        }
                        case "JPY to JPY" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                            result = amount * exchangeRateSameCurrency;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " JPY.");
                        }
                        case "JPY to KRW" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en JPY"));
                            result = amount * exchangeRateJPYToKRW;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " KRW.");
                        }
                        case "KRW to USD" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                            result = amount / exchangeRateUSDToKRW;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " USD.");
                        }
                        case "KRW to EUR" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                            result = amount / exchangeRateEURToKRW;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " EUR.");
                        }
                        case "KRW to GBP" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                            result = amount / exchangeRateGBPToKRW;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " GBP.");
                        }
                        case "KRW to JPY" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                            result = amount / exchangeRateJPYToKRW;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " JPY.");
                        }
                        case "KRW to KRW" -> {
                            amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en KRW"));
                            result = amount * exchangeRateSameCurrency;
                            JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " KRW.");
                        }
                        default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                    }
                }
            }
	}


                

