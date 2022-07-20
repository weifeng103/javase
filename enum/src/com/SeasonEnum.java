package com;

public enum SeasonEnum {
    SPRING("����","���ｻ��ļ���"),
    SUMMER("����","Ů���Ӵ�ȹ�ӵļ���"),
    AUTUMN("����","�ջ�ļ���"),
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
                System.out.println("����");
                break;
            case AUTUMN :
                System.out.println("����");
                break;
            case SUMMER :
                System.out.println("����");
                break;
            case WINTER:
                System.out.println("����");
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
