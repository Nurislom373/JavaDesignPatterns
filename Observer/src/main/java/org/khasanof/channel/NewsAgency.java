package org.khasanof.channel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 11/6/2023 11:27 PM
 */
public class NewsAgency {

    private String news;
    private List<Channel> channels = new ArrayList<>();

    public NewsAgency() {
    }

    public NewsAgency(String news, List<Channel> channels) {
        this.news = news;
        this.channels = channels;
    }

    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    public void removeChannel(Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        channels.forEach(channel -> channel.update(news));
    }

    public String getNews() {
        return news;
    }
}
