package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

class PageHandler implements HttpHandler {
    private String path;

    public PageHandler(String path) {
        this.path = path;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = HtmlPageGenerator.generatePage(path);
        exchange.getResponseHeaders().set("Content-type", "text/html");
        exchange.sendResponseHeaders(200, response.length());
        try (OutputStream outputStream = exchange.getResponseBody()) {
            outputStream.write(response.getBytes());
        }
    }
}
