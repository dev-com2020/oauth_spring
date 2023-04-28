package com.example.oauth;

record SearchListResponse(
        String kind,
        String etag,
        String nextPageToken,
        String prevPageToken,
        PageInfo pageInfo,
        SearchResult[] items) {
}
