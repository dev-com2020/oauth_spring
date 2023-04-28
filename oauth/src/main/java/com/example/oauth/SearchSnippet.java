package com.example.oauth;

import java.util.Map;

record SearchSnippet(
        String publishedAt,
        String channelId,
        String title,
        String description,
        Map<String,SearchThumbnail> thumbnails,
        String channelTitle) {

    String shortDescription() {
        return description.substring(0, Math.min(description.length(), 100));
    }

    SearchThumbnail thumbnail() {
    return this.thumbnails.entrySet().stream()
        .filter(entry -> entry.getKey().equals("default"))
            .findFirst()
            .map(Map.Entry::getValue)
        .orElse(null);
    }
}
