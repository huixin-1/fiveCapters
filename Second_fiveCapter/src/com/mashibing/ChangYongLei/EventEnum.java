package com.mashibing.ChangYongLei;

public enum  EventEnum {
    LAUNCH("lanch"),PAGEVIEW("pageview"),EVENT("event");

    EventEnum(String name){
        this.name=name;
    }



    private String name;


    public void show(){
        System.out.println(this.name);
        EventEnum[] ee=values();
        for (int i=0;i<ee.length;i++){
            System.out.println(ee[i]);
        }
    }

}
