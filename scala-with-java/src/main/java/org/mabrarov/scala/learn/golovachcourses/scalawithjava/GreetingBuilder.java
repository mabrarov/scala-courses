package org.mabrarov.scala.learn.golovachcourses.scalawithjava;

import org.apache.commons.lang3.StringUtils;

public class GreetingBuilder {

    public String buildGreeting(final String name) {
        return String.format("Hello, %s!", StringUtils.capitalize(name));
    }

}
