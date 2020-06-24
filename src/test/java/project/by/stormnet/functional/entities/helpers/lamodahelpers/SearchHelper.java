package project.by.stormnet.functional.entities.helpers.lamodahelpers;

import project.by.stormnet.functional.entities.helpers.AbstractHelper;
import project.by.stormnet.functional.entities.pages.lamoda.SearchPage;

public class SearchHelper extends AbstractHelper {
    private SearchPage searchPage = new SearchPage();

    public int getSearchResultCountPerPage(){
        return searchPage.getResultsSizePerPage();
    }

    public int getAllResultsCount(){
        return Integer.parseInt(searchPage.getResultsCount().split(" ")[0]);
    }
}
