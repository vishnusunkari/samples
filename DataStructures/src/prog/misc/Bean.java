package prog.misc;

import java.util.List;

import com.google.common.base.Objects;


public class Bean{

    private String name;
    private int length;
    private List<Bean> children;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public List<Bean> getChildren() {
		return children;
	}
	public void setChildren(List<Bean> children) {
		this.children = children;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(name, length);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bean other = (Bean) obj;
		if (children == null) {
			if (other.children != null)
				return false;
		} else if (!children.equals(other.children))
			return false;
		if (length != other.length)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
	
    

}
