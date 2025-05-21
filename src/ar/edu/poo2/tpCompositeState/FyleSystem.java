package ar.edu.poo2.tpCompositeState;

import java.util.List;

public interface FyleSystem {
	public int totalSize();
	public void printStructure();
	public Archive lastModified();
	public Archive oldestModified();
	public void add(FyleSystem f);
	public void remove(FyleSystem f);
	public List<FyleSystem> getChilds();
}
