package dev.gray;

import io.javalin.Javalin;

public class Main {


    public static void main(String[] args) {


      Javalin app = Javalin.create().start(7000);

//        LAMBDA TO DISPLAY HELLO
//        app.get("/", ctx -> ctx.result("Hello World"));
    }
}
