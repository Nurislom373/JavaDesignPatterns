package org.khasanof.vrtx;

public class VrtxObject implements Vrtx {

    public VrtxObject() {
        loading();
    }

    @Override
    public void create() {
        System.out.println("Created Object.");
    }

    public void loading() {
        System.out.println("creating object.....");
    }
}
