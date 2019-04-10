import java.util.Arrays;

public class Collection {

    public Object[] object;

    public Collection(Object[] object) {
        this.object = object;
    }

    public class EvenNumbersTurnToZero implements Iterator {
        private int currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition  < object.length;
        }

        @Override
        public Object next() {
            Object obj = currentPosition % 2 == 0 ? object[currentPosition] : 0;
            currentPosition++;
            return obj;
        }
    }

    public class ObjectsIterator implements Iterator {

        private int currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition < object.length;
        }

        @Override
        public Object next() {
            return object[currentPosition++];
        }
    }

    public Iterator iterator() {
        return new ObjectsIterator();
    }

    public Iterator EvenNumbersTurnToZero() {
        return new EvenNumbersTurnToZero();
    }

    public Iterator reverseIterator() {
        return new Iterator() {

            private int currentPosition = object.length - 1;

            @Override
            public boolean hasNext() {
                return currentPosition >= 0;
            }

            @Override
            public Object next() {
                return object[currentPosition--];
            }
        };
    }

}
