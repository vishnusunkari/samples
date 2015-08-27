package prog.misc;

import java.util.ArrayList;
import java.util.List;
public class SerializeDeserialize {
	    public static String serialize (List<String> words, List<Integer> pos){
	        int currPos = 0;
	        StringBuffer sb = new StringBuffer();
	        for (String s : words){
	                pos.add(currPos+s.length());
	                currPos += s.length();
	                sb.append(s);
	        }
	        return sb.toString();
	    }

	    public static List<String> deserialize(String s, List<Integer> pos){
	        List<String> list = new ArrayList<String>();
	        int start = 0;
	        for (Integer end : pos){
	            list.add(s.substring(start, end));
	            start = end;
	        }
	        return list;
	    }

	    public static void main(String[] args){
	        List<String> list= new ArrayList<String>();
	        list.add("fdsf");
	        list.add("55 435");
	        list.add("hdfswzx");
	        list.add("5345450-- ");
	        List<Integer> pos = new ArrayList<Integer>();
	        String s = serialize(list, pos);
	        System.out.println("Serialized string : \n" + s);

	        System.out.println("DeSerialized string : \n" + s);
	        List<String> newList = deserialize(s, pos);
	        for (String s1 : newList){
	            System.out.println(s1);
	        }
	    }

}
