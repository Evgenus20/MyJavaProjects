import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionApi {
    public static void main(String[] args) {
        ChildOfReflectionApi childOfReflectionApi = new ChildOfReflectionApi();

/*--------------------------------------------------------------------------------------------------------------*/
        /*1. Если есть экземпляр объекта, но не известно какого класса этот экземпляр:*/
        Class clazz1 = childOfReflectionApi.getClass();
        System.out.println("1.   Class: " + clazz1);
/*--------------------------------------------------------------------------------------------------------------*/
        /*2. Если есть класс, для которого в момент компиляции известен тип, то получить экземпляр класса можно:*/
        Class classClass = ChildOfReflectionApi.class;
        System.out.println("2.1. Сlass instance ReflectionApi: " + classClass);

        Class integerClass = Integer.class;
        System.out.println("2.2. Class instance Integer: " + integerClass);
/*--------------------------------------------------------------------------------------------------------------*/
        /* Если имя класса не известно в момент компиляции, но становится известным во время выполнения программы,
        можно использовать метод forName, чтобы получить объект Class*/
        //Class c = Class.forName("com.mysql.jdbc.Driver");
/*--------------------------------------------------------------------------------------------------------------*/
        /*3. Получение имени класса*/
        Class nameClass = childOfReflectionApi.getClass();
        String nameClass1 = nameClass.getName();
        System.out.println("3.   Name of the class: " + nameClass1);
/*--------------------------------------------------------------------------------------------------------------*/
        /*4. Исследование модификаторов класса*/
        Class clazz4 = childOfReflectionApi.getClass();
        int modificator = clazz4.getModifiers();
        System.out.print("4.   Modificator of the class: ");
        if(Modifier.isPublic(modificator)){
            System.out.println("public");
        }
        if(Modifier.isAbstract(modificator)){
            System.out.println("abstract");
        }
        if (Modifier.isFinal(modificator)) {
            System.out.println("final");
        }
/*--------------------------------------------------------------------------------------------------------------*/
        /*5. Нахождение суперклассов*/
        //Class clazZ = r.getClass();
        //Class superClass = clazZ.getSuperclass();

        Class clazz5 = childOfReflectionApi.getClass();
        Class superclass = clazz5.getSuperclass();


        System.out.println("5.   Super Class: " + superclass);
/*--------------------------------------------------------------------------------------------------------------*/
        /*6. Определение интерфейсов, реализумых классом*/
        //Class claSs = r.getClass();
        //Class[] interfaces = claSs.getInterfaces();
        //for (Class cInterface  :  interfaces){
         //   System.out.println(cInterface.getName());
        //}
        Class clazz6 = childOfReflectionApi.getClass();
        Class[] interfaces = clazz6.getInterfaces();
        System.out.print("6.   Interfaces: ");
        for (Class cInterface : interfaces){
            System.out.print(cInterface.getName() + "  ");
        }
/*--------------------------------------------------------------------------------------------------------------*/
        /*7. Исследование, получение и установка значений полей класса*/
        Class clazz7 = childOfReflectionApi.getClass();
        Field[] publicFields = clazz7.getFields();
        for (Field field : publicFields){
            Class fieldType = field.getType();
            System.out.println("7.1 Name: " + field.getName());
            System.out.println("7.2 Type: " + fieldType.getName());
        }
/*--------------------------------------------------------------------------------------------------------------*/
        /*8. */
    }
}
