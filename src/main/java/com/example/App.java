package com.example;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {

    public static void main(String[] args) throws IOException {

        HttpServer server =
                HttpServer.create(new InetSocketAddress(8081), 0);

        server.createContext("/", (HttpExchange exchange) -> {

            String response =
                    "<html>" +
                    "<head>" +
                    "<title>DevOps Demo</title>" +
                    "</head>" +
                    "<body>" +
                    "<h1>Welcome to DevOps Pipeline</h1>" +
                    "<p>Application deployed successfully.</p>" +
                    "</body>" +
                    "</html>";

            exchange.sendResponseHeaders(200, response.length());

            OutputStream output =
                    exchange.getResponseBody();

            output.write(response.getBytes());
            output.close();
        });

        server.start();

        System.out.println(
                "Server started at http://localhost:8081");
    }
}