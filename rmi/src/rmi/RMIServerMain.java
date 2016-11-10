package rmi;




public class RMIServerMain {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try 
        {
            RMIService ws = new RMIService();
           
            int suma = ws.getSuma(123, 10);
            int resta = ws.getResta(123, 10);
            int mult = ws.getMultiplicacion(123, 10);
            int div = ws.getDivision(123, 10);
            int mod = ws.getModulo(123, 10);
            int pot = ws.getPotencia(123, 10);
            
            System.out.println("suma: " + suma);
            System.out.println("resta: " + resta);
            System.out.println("multiplicacion: " + mult);
            System.out.println("division: " + div);
            System.out.println("modulo: " + mod);
            System.out.println("potencia: " + pot);
            
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("ERROR: " + ex);
        }
    }
}
