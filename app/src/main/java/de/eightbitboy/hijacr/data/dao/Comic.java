package de.eightbitboy.hijacr.data.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "COMIC".
 */
public class Comic {

    private Long id;
    private String key;
    private String title;
    private String url;
    private String firstUrl;
    private String lastViewedUrl;
    private String imageQuery;
    private String previousQuery;
    private String nextQuery;
    private Boolean hidden;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Comic() {
    }

    public Comic(Long id) {
        this.id = id;
    }

    public Comic(Long id, String key, String title, String url, String firstUrl, String lastViewedUrl, String imageQuery, String previousQuery, String nextQuery, Boolean hidden) {
        this.id = id;
        this.key = key;
        this.title = title;
        this.url = url;
        this.firstUrl = firstUrl;
        this.lastViewedUrl = lastViewedUrl;
        this.imageQuery = imageQuery;
        this.previousQuery = previousQuery;
        this.nextQuery = nextQuery;
        this.hidden = hidden;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFirstUrl() {
        return firstUrl;
    }

    public void setFirstUrl(String firstUrl) {
        this.firstUrl = firstUrl;
    }

    public String getLastViewedUrl() {
        return lastViewedUrl;
    }

    public void setLastViewedUrl(String lastViewedUrl) {
        this.lastViewedUrl = lastViewedUrl;
    }

    public String getImageQuery() {
        return imageQuery;
    }

    public void setImageQuery(String imageQuery) {
        this.imageQuery = imageQuery;
    }

    public String getPreviousQuery() {
        return previousQuery;
    }

    public void setPreviousQuery(String previousQuery) {
        this.previousQuery = previousQuery;
    }

    public String getNextQuery() {
        return nextQuery;
    }

    public void setNextQuery(String nextQuery) {
        this.nextQuery = nextQuery;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    // KEEP METHODS - put your custom methods here

	public String getSimpleUrl() {
		String simpleUrl;
		simpleUrl = url.replaceAll("/", "");
		simpleUrl = simpleUrl.replaceAll("http", "");
		simpleUrl = simpleUrl.replaceAll(":", "");
		simpleUrl = simpleUrl.replaceAll("www.", "");
		return simpleUrl;
	}
    // KEEP METHODS END

}
