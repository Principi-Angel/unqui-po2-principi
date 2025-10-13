package ar.edu.unq.po2.tp9.template.wikipedia;

public class MismaLetraInicial extends FiltroWiki {
	   
	    @Override
		protected Boolean cumpleCondicion(WikipediaPage page, WikipediaPage wp) {
	    		try {
	    			wp.getTitle().charAt(0);
	    	    } catch (Exception e) {
	    	    		return false;
	    	    }
	    		return page.getTitle().charAt(0) == wp.getTitle().charAt(0);
	    }
}
