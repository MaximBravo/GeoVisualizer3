import java.awt.Color;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.MarkerManager;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class MyManSurface extends PApplet {
	
	UnfoldingMap map;
	MarkerManager<Marker> mapMarkers;
	Marker val;
	
	public void settings() {
		size(1200, 800);
	}
	
	
	public void setup() {
		map = new UnfoldingMap(this, new Google.GoogleMapProvider());
		
		map.zoomAndPanTo(12, new Location(37.404094f, -121.790247f));		
		MapUtils.createDefaultEventDispatcher(this, map);
		
		mapMarkers = new MarkerManager<Marker>();
		Location loc = new Location(37.404094f, -121.790247f);
		val = new SimplePointMarker(loc);
		mapMarkers.addMarker(val);

	}
	
	public void draw() {
		background(10);
		map.draw();
		val.setStrokeWeight(100);
		val.setSelected(true);
		System.out.println("Inside: " + val.isInside(map, 37.404094f, -121.790247f)+ "   " 
		+ "Distance: " + val.getDistanceTo(new Location(37.404094f, -121.790247f)));
		val.draw(map);
	}
}
