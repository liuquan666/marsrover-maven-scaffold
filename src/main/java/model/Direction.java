package model;

public enum Direction {
    EAST("E", 1),
    SOUTH("S", 2),
    WEST("W", 3),
    NORTH("N", 4);

    Direction(String desc, Integer code) {
        this.code = code;
        this.desc = desc;
    }

    private Integer code;
    private String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


}
