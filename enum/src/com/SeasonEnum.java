package com;

public enum SeasonEnum {
    SPRING("春天","万物交配的季节"),
    SUMMER("夏天","女孩子穿裙子的季节"),
    AUTUMN("秋天","收获的季节"),
    WINTER();

    private String name;
    private String detail;

    SeasonEnum() {
    }

    SeasonEnum(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public static void test(SeasonEnum seasonEnum){
        switch (seasonEnum){
            case SPRING :
                System.out.println("春天");
                break;
            case AUTUMN :
                System.out.println("秋天");
                break;
            case SUMMER :
                System.out.println("夏天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }

    }

    public static void main(String[] args) {
        System.out.println(SeasonEnum.SUMMER.name());
        System.out.println(SeasonEnum.SUMMER.ordinal());
        SeasonEnum[] values = SeasonEnum.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].getDetail());
        }
        test(SeasonEnum.SPRING);
    }
}
