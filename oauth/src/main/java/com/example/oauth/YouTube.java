package com.example.oauth;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;


public interface YouTube {
    @GetExchange("/search?part=snippet&type=video")
    SearchListResponse channelVideos(
            @RequestParam String channelId,
            @RequestParam int maxResults,
            @RequestParam Sort order);

    enum Sort {
        DATE("date"),
        RATING("rating"),
        TITLE("title"),
        VIEV_COUNT("viewCount");

        private final String type;

        Sort(String type) {
            this.type = type;
        }

    }
}
