package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

public static final int TIMEOUT = 300;

/**
 *
 * teste
 *
 * @author Paulo Henrique Caviquioli
 * @since 24/11/2022 10:33:56
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.database.Operations.query(Var.valueOf("teste.entity.teste"),Var.valueOf("select \n	t.testenome \nfrom \n	teste t"));
    for (Iterator it_i = item.iterator(); it_i.hasNext();) {
        i = Var.valueOf(it_i.next());
        cronapi.database.Operations.execute(Var.valueOf("teste.entity.teste"), Var.valueOf("update \n	teste  \nset \n	testenome = :testenome"),Var.valueOf("testenome",
        Var.valueOf("passou")));
    } // end for
    return Var.VAR_NULL;
   }
 }.call();
}

}

