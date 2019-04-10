import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        Object[] object = {1, 4, 5, 6, 4, 3, 6};
        System.out.println(Arrays.toString(object));

        Collection coll = new Collection(object);
        Collection.EvenNumbersTurnToZero collection = new Collection(object).new EvenNumbersTurnToZero();
        Collection.ObjectsIterator objectsIterator = new Collection(object).new ObjectsIterator();


        //Collection collection = new Collection(object);

        while (objectsIterator.hasNext()){
            System.out.println(objectsIterator.next());
        }
        System.out.println("sdfsdf");
        while (collection.hasNext()){
            System.out.println(collection.next());
        }
        System.out.println("sdfsdf");

        while (collection.hasNext()){
            System.out.println(coll.reverseIterator());
        }


    }
}
