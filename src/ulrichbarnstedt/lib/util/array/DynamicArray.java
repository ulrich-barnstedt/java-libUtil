package ulrichbarnstedt.lib.util.array;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Wrapper implementation around arrayList with extra functionality
 * @param <T> Type of the array
 */
public class DynamicArray<T> extends ArrayList<T> {
    public DynamicArray () {
        super();
    }

    /**
     * Get an element of the array if it exists, else returns null
     * @param idx Index of the element
     * @return Element if found, else null
     */
    public T get (int idx) {
        if (idx >= super.size() || idx < 0) return null;

        return super.get(idx);
    }

    /**
     * Get an element by idx, throws an error if outside of array
     * @param idx Index of the element
     * @return Element at this index
     */
    public T getUnchecked (int idx) {
        return super.get(idx);
    }

    /**
     * Set the element at an index. Increases array size (with null) if too small.
     * @param idx Index to set
     * @param value Value to set at this index
     */
    public T set (int idx, T value) {
        return this.set(idx, value, null);
    }

    /**
     * Set the element at an index. Increases array size (with the filler) if too small
     * @param idx Index to set at
     * @param value Value to set at this index
     * @param filler Filler to fill the array if too small
     */
    public T set (int idx, T value, T filler) {
        while (super.size() < idx) {
            super.add(filler);
        }

        if (super.size() == idx)
            super.add(value);
        else
            super.set(idx, value);

        return value;
    }

    /**
     * Set the value at the specified index, throws an error if outside the array
     * @param idx Index to set at
     * @param value Value to set to
     */
    public void setUnchecked (int idx, T value) {
        super.set(idx, value);
    }

    /**
     * Map the values to another type/value
     * @param fn Map function
     * @param <R> Parameter to convert to
     * @return Array which was mapped to
     */
    public <R> DynamicArray<R> map (Function<T, R> fn) {
        DynamicArray<R> values = new DynamicArray<>();
        super.forEach((T value) -> values.add(fn.apply(value)));

        return values;
    }

    /**
     * Reduce the array values to an accumulator value
     * @param initial Initial value for the accumulator
     * @param fn Reduce function
     * @param <R> Type to reduce to
     * @return Reduced value
     */
    public <R> R reduce (R initial, BiFunction<R, T, R> fn) {
        R value = initial;
        for (T current : this) {
            value = fn.apply(value, current);
        }

        return value;
    }

    /**
     * Fill the array to the specified size
     * @param size Size to fill to
     * @param filler Value to use for filling
     */
    public void fillTo (int size, T filler) {
        while (super.size() < size) {
            super.add(filler);
        }
    }

    /**
     * Fill the array to the specified size (with nulls)
     * @param size Size to fill to
     */
    public void fillTo (int size) {
        this.fillTo(size, null);
    }
}
