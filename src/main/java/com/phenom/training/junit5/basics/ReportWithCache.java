package com.phenom.training.junit5.basics;

import java.util.Map;

public class ReportWithCache {

    private Map<String, String> cache;

    public ReportWithCache(Map<String, String> map) {
        cache = Map.copyOf(map);
    }

    String createRow(String title) {
        String speaker = cache.getOrDefault(title, "Unknown");
        return speaker + ',' + title;
    }
}
