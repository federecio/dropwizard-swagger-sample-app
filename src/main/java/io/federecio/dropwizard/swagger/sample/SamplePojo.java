package io.federecio.dropwizard.swagger.sample;

/**
 * @author Federico Recio
 */
public class SamplePojo {

    private final String name;
    private final int value;

    public SamplePojo(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
