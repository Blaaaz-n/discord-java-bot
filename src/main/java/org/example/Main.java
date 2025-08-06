package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


public class Main  {

    public static void main(String[] args) throws Exception {

        String token = Files.readString(Path.of("token/token.txt"));
        JDABuilder.createDefault(token).build();
    }
}