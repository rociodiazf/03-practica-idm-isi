//import java.security.InvalidParameterException;
import java.util.*;

public class NoSolution extends RuntimeException{
	String msg;
	
	public NoSolution(String str) {
		msg = str;
	}
	
	public String toString(){
		return ("NoSolution: " + msg) ;
	}
}
