package edu.escuelaing.arep;

import static spark.Spark.*;
import org.json.JSONObject;

public class App
{

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");
        get("/convertir/:tipo/:num", (req, res) -> calcular(req.params(":tipo"), req.params(":num")));
    }

    public static JSONObject calcular(String tipo, String num) {
        Conversion conversion = new Conversion();
        if (tipo.equals("Celcius")) {
            conversion.convertirAcelcius(Float.parseFloat(num));
        } else if(tipo.equals("Fahrenheit")) {
            conversion.convertirAfahrenheit(Float.parseFloat(num));
        }else{
            System.out.println("Error en el Tipo");
        }
        JSONObject respuesta = new JSONObject();
        respuesta.put("Resultado",conversion.getResultado());
        return respuesta;
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}




