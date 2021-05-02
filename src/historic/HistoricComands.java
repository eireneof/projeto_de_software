package historic;

import java.util.List;
import java.util.ArrayList;

public class HistoricComands {
	private final List<Integer> undos;
	private final List<Integer> redos;
	private int current;

	public HistoricComands() {
		undos = new ArrayList<>();
		redos = new ArrayList<>();
		setCurrent(-1);
	}
	
	public int undoCommand() {
		if(!undos.isEmpty()) {
			redos.add(current);
			current = undos.remove(undos.size() - 1);
		}
		return current;
	}
	
	public int redoCommand( ) {
		if(!redos.isEmpty()) {
			undos.add(current);
			current = redos.remove(redos.size() - 1);
		}
		return current;
	}

	public List<Integer> getUndos() {
		return undos;
	}

	public List<Integer> getRedos() {
		return redos;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int target) {
		undos.add(current);
		redos.clear();
		current = target;
	}
	
	public int getCurrentRedos() {
		if(!redos.isEmpty()) {
			return redos.get(redos.size() - 1);
		} else return -1;
	}
	
	public int getCurrentUndos() {
		if(!undos.isEmpty()) {
			return undos.get(undos.size() - 1);
		} else return -1;
	}

}
