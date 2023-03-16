package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SAMSUNG
 */
public class FuncoesUteis {

    //Converte e valida data
    public static Date strToDate(String txtData) throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);
        return formato.parse(txtData);
    }

}
