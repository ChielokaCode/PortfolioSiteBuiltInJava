package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

class HtmlPageGenerator {
    public static String generatePage(String path) {
        return switch (path) {
            case "/" -> generateHomePage();
            case "/contact" -> generateContactPage();
            case "/about-me" -> generateAboutPage();
            case "/portfolio" -> generatePortfolioPage();
            default -> generateErrorPage();
        };
    }
    public static String generateHomePage() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/wikiwoo/Desktop/JavaTuts/HttpServer/HttpServer/src/main/resources/home.html")))
        {
            line = reader.lines().collect(Collectors.joining("\n"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }

    public static String generateAboutPage() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/wikiwoo/Desktop/JavaTuts/HttpServer/HttpServer/src/main/resources/aboutme.html")))
        {
            line = reader.lines().collect(Collectors.joining("\n"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }

    public static String generateContactPage() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/wikiwoo/Desktop/JavaTuts/HttpServer/HttpServer/src/main/resources/contact.html")))
        {
            line = reader.lines().collect(Collectors.joining("\n"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }

    public static String generatePortfolioPage(){
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/wikiwoo/Desktop/JavaTuts/HttpServer/HttpServer/src/main/resources/portfolio.html")))
        {
            line = reader.lines().collect(Collectors.joining("\n"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }
    public static String generateErrorPage(){
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/wikiwoo/Desktop/JavaTuts/HttpServer/HttpServer/src/main/resources/error.html")))
        {
            line = reader.lines().collect(Collectors.joining("\n"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }
}