package uk.co.baisysoft.reldash.ui;

import spark.Request;
import spark.Response;
import spark.Service;
import uk.co.baisysoft.reldash.core.Core;

import java.util.logging.Logger;

public class Main {

    private static Logger LOG = Logger.getLogger(Main.class.getName());
    private final Service service;

    public Main(Service service) {
        this.service = service;
    }

    public static void main(String[] args) {

        LOG.info("Starting...");

        new Core();

        Service service = Service.ignite();
        final Main main = new Main(service);

        service.get("/hello", main::hello);

    }

    private String hello(Request req, Response res) {
        return "Hello World";
    }
}