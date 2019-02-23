package com.marketmotion.parsercomponent.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class VolatParser {

    public Map<String,String> parse() throws IOException {
        Document doc;
        doc = Jsoup.connect("https://www.mataf.net/ru/forex/tools/volatility").get();
        Elements e = doc.body().getElementsByClass("data_volat");
        return e.stream()
              .map(el -> el.getAllElements())
              .collect(Collectors.toMap(
                     k-> k.get(1).getAllElements().text(),
                     k->k.get(3).getAllElements().text())
              );
    }
}
