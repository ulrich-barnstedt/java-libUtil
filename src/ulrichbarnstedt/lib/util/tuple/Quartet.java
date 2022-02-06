package ulrichbarnstedt.lib.util.tuple;

public class Quartet<A, B, C, D> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;

    public Quartet(A a, B b, C c, D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public A getA () {
        return a;
    }

    public B getB () {
        return b;
    }

    public C getC () {
        return c;
    }

    public D getD () {
        return d;
    }

    @Override
    public String toString () {
        return "<" +
            "a=" + a +
            ", b=" + b +
            ", c=" + c +
            ", d=" + d +
            '>';
    }
}
