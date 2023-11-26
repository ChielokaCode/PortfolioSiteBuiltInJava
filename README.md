# PortfolioSiteBuiltInJava
I designed a portfolio site in java using HttpServer class to create a server on a port, then using BufferedReader class to read the contents of the html file, I displayed the contents of the html site using OutPutStream.write() to the Web Browser 

Summary:
The HttpServer sets up and starts an HTTP server, defining different contexts with PageHandler instances for various paths.
The PageHandler implements HttpHandler and is responsible for handling incoming requests, determining the requested path, and delegating HTML content generation to the HtmlPageGenerator.
The HtmlPageGenerator generates HTML content for different pages based on the provided path, reading the content from corresponding HTML files.
Together, these components form a simple HTTP server that serves HTML pages based on the requested paths, providing a foundation for a basic web application. The server, page handler, and HTML generator work in tandem to handle incoming HTTP requests and generate appropriate responses.

