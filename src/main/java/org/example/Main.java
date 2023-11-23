package org.example;


import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

import java.net.InetSocketAddress;

class Main {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(9090), 0);
        server.createContext("/", new PageHandler("/"));
        server.createContext("/contact", new PageHandler("/contact"));
        server.createContext("/about-me", new PageHandler("/about-me"));
        server.createContext("/portfolio", new PageHandler("/portfolio"));

        server.setExecutor(null);
        server.start();
    }
}




