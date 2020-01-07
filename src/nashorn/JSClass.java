package nashorn;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSClass {
	
	
	public static void main(String args[])
	{
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
		
		Bindings bindings = engine.createBindings();
		bindings.put("count", 3);
		bindings.put("name", "icterra");
		 
		String script = "var greeting='Hello ';" +
		  "for(var i=count;i>0;i--) { " +
		  "greeting+=name + ' '" +
		  "}" +
		  "print(greeting)";
		 

		try {
			engine.eval(
					   "var greeting='hello world';" +
					   "print(greeting);");
			engine.eval(script, bindings);
			
			
			Object map = engine.eval("var HashMap = Java.type('java.util.HashMap');" +
					  "var map = new HashMap();" +
					  "map.put('hello', 'world');" +
					  "map");

		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	

}
