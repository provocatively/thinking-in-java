package cn.devlife.c05.source;


public class MethodInit3 {
    //! int j = g(i); // Illegal forward reference
    int i = f();

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
