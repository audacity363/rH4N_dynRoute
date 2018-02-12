package realHTML.tomcat.routing;

import java.util.ArrayList;

public class Routing {
	ArrayList<PathTemplate> templates;
	
	public Routing() {
		this.templates = new ArrayList<PathTemplate>();
	}
	
	public void addRoute(String template, Route route) {
		PathTemplate newroute = new PathTemplate(template, route);
		newroute.parseTemplate();
		this.templates.add(newroute);
	}
	
	public PathTemplate getRoute(String url) {
		for(PathTemplate entry: this.templates) {
			if(entry.matchPath(url)) {
				return(entry);
			}
		}
		
		return(null);
	}
}
