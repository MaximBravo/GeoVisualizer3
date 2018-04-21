import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class MyManSurface extends PApplet {
	
	UnfoldingMap map;
	
	
	
	public void settings() {
		size(800, 800);
	}
	public void setup() {
		map = new UnfoldingMap(this);
	}
	
	public void draw() {
		map.draw();
	}
}
