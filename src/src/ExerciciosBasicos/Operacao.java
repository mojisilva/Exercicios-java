package ExerciciosBasicos;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Operacao {

    public static void main(String[] args) throws ScriptException {
        String oper = "4 * 3";
        //int result;
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval(oper);
    }

}
