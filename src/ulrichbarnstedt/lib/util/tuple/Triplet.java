package ulrichbarnstedt.lib.util.tuple;

public class Triplet<A, B, C> {
    private final A a;
    private final B b;
    private final C c;

    public Triplet(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    @Override
    public String toString () {
        return "<" +
            "a=" + a +
            ", b=" + b +
            ", c=" + c +
            '>';
    }
}
