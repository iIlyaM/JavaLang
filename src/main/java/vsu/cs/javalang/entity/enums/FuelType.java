package vsu.cs.javalang.entity.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.stream.Stream;

public enum FuelType {
    NINETY_TWO("92"),
    NINETY_FIVE("95"),
    NINETY_EIGHTH("98"),
    DIESEL("Дт");

    private String code;

    private FuelType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @JsonCreator
    public static FuelType decode(final String code) {
        return Stream.of(FuelType.values()).filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "code='" + code + '\'' +
                '}';
    }
}
