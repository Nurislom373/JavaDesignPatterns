package org.khasanof.channel;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 11/6/2023 11:30 PM
 */
public class NewsChannel implements Channel {

    private String news;

    public NewsChannel() {
    }

    public NewsChannel(String news) {
        this.news = news;
    }

    @Override
    public void update(Object o) {
        this.news = (String) o;
    }

    @Override
    public String getNews() {
        return this.news;
    }

}
