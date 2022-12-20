package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(get = "Public", put = "Public")
public class Testeblocodow {

public static final int TIMEOUT = 300;

/**
 *
 * testeblocodow
 *
 * @author Paulo Henrique Caviquioli
 * @since 14/12/2022 15:22:22
 *
 */
public static Var testeblocodow() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    cronapi.io.Operations.fileCreate(
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    Var.valueOf("teste.csv").getObjectAsString()));
    item =
    cronapi.io.Operations.fileOpenToWrite(
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    Var.valueOf("teste.csv").getObjectAsString()),
    Var.valueOf("testando;arquivo;excel;"));
    cronapi.io.Operations.fileClose(item);
    cronapi.io.Operations.startDownload(
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    Var.valueOf("teste.csv").getObjectAsString()),
    Var.valueOf("teste2.csv"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

