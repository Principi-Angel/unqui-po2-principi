package ar.edu.unq.po2.tp9.template.wikipedia;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public abstract class FiltroWiki {

	public final List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		if(wikipedia.isEmpty() && page.getTitle()!="") {
			return Collections.emptyList();
		} else {
			return wikipedia.stream()
	                 .filter(wp -> this.cumpleCondicion(page, wp))
	                 .collect(Collectors.toList());
		}
	}
	
	protected abstract Boolean cumpleCondicion(WikipediaPage page, WikipediaPage wp); 

}
