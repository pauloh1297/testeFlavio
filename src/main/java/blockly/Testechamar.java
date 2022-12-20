package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Testechamar {

public static final int TIMEOUT = 300;

/**
 *
 * @author Paulo Henrique Caviquioli
 * @since 07/12/2022 10:56:28
 *
 */
public static Var TesteImagem2() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.io.Operations.startDownload(
    Var.valueOf(
    Var.valueOf("src/main/webapp/Imagem").getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    Var.valueOf("Peso.png").getObjectAsString()),
    Var.valueOf("Peso.png"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

