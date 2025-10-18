package ar.edu.unq.po2.tp9.template.wikipedia;

import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;

public class LinkEnComun extends FiltroWiki {

	@Override
	protected Boolean cumpleCondicion(WikipediaPage page, WikipediaPage wp) {
		List<WikipediaPage> linksDePage = page.getLinks();
		return wp.getLinks().stream()
	                .anyMatch(linksDePage::contains);
	}

}
