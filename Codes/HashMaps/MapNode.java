package HashMaps;

public class MapNode< k , v> {

	k key;
	v value;
	MapNode<k,v> next;

	public MapNode(k key , v value) {
		this.key = key;
		this.value = value;
	}
}
