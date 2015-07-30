package configgen.type;

import java.util.HashSet;

import org.w3c.dom.Element;

import configgen.Utils;

public final class Group {
	// group ����
	public final static HashSet<String> groups = new HashSet<String>();
	
	static {
		groups.add("all");
	}
	
	public static void load(Element data) {
		for(String name : Utils.split(data, "names")) {
			groups.add(name);
		}
	}
	
	public static boolean isGroup(String name) {
		return groups.contains(name);
	}
}
