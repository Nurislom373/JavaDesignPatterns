package org.khasanof;

import org.junit.jupiter.api.Assertions;

public class Main {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel channel = new NewsChannel();

        newsAgency.addChannel(channel);
        newsAgency.setNews("Breaking News!");

        Assertions.assertEquals(newsAgency.getNews(), "Breaking News!");
        Assertions.assertEquals(channel.getNews(), "Breaking News!");
    }

}
