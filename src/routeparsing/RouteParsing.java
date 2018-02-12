package routeparsing;

import realHTML.tomcat.routing.*;

public class RouteParsing {

	public static void main(String[] args) {
		String url = "/packstueck/1234/new";
		
		String[] templates = {
				"/rolle/:rollen-nr",
				"/test/no1/:parm1",
				"/packstueck/:packstueck-nr/:cmd=new|update|delete",
				"/packstueck/:packstueck-nr/update"
				};
		Routing router = new Routing();
		
		for(int i = 0; i < templates.length; i++) {
			router.addRoute(templates[i], null);
		}

		System.out.println(router.getRoute(url));
	}
}
