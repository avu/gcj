class HelloWorld {
    public native void print();

    static {
        System.loadLibrary("borracha3");
    }
}
