package arraylist;

public class Banjo {
	  public static String areYouPlayingBanjo(String name) {
	   char primeraLetra = name.charAt(0);
	    if (Character.toLowerCase(primeraLetra) == 'r'){
	      System.out.println(name + " plays banjo");
	      return name + " plays banjo";
	    } else {
	      return name + " does not play banjo";
	    }
	  }
	}