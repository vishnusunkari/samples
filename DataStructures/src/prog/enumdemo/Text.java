package prog.enumdemo;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Text {

	private String str;
	public Text(){
		this.str = "Hello how are you";
	}
	public enum Style {
		BOLD, ITALIC, UNDERLINE, STRIKETHROUGH;
	}
	
	public void applyStyles(Set<Style> styles){
		for(Style aType : styles) {
		      switch(aType) {
			       case BOLD:
			    	   this.str = "<BOLD>"+this.str+"</BOLD>"; break;
			       case ITALIC:
			    	   this.str = "<ITALIC>"+this.str+"</ITALIC>";break;
			       case UNDERLINE:
			    	   this.str = "<UNDERLINE>"+this.str+"</UNDERLINE>";break;
			       case STRIKETHROUGH:
			    	   this.str = "<STRIKETHROUGH>"+this.str+"</STRIKETHROUGH>";break;
		      }
		}
	}
	
	public static void main(String[] args) {
		Text text1 = new Text();
		/*Set<Style> style = new HashSet<Style>();
		style.add(Style.BOLD);
		style.add(Style.STRIKETHROUGH);*/
		System.out.println("Text before style:    "+text1.str);
		
		text1.applyStyles(EnumSet.of(Style.BOLD, Style.UNDERLINE));
		
		System.out.println("Text after style:    " + text1.str); 
		
		
		
	}

}
