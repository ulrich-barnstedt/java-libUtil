package ulrichbarnstedt.lib.util.tuple;

public class Quintet<A, B, C, D, E> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;
    private final E e;

    public Quintet(A a, B b, C c, D d, E e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
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

    public E getE () {
        return e;
    }

    @Override
    public String toString () {
        return "<" +
            "a=" + a +
            ", b=" + b +
            ", c=" + c +
            ", d=" + d +
            ", e=" + e +
            '>';
    }
}
