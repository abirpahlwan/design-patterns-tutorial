import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {

        Class reflectClass = UFOEnemyShip.class;

        String className = reflectClass.getName();
        System.out.println(className);

        int classModifier = reflectClass.getModifiers();
        System.out.println(Modifier.isPublic(classModifier));

        Class[] interfaces = reflectClass.getInterfaces();

        Class classSuper = reflectClass.getSuperclass();
        System.out.println("Superclass: " + classSuper.getName());

        System.out.println();

        System.out.println("Methods");
        Method[] classMethods = reflectClass.getMethods();
        for(Method method : classMethods){
            System.out.println("Method name: " + method.getName());

            if(method.getName().startsWith("get")){
                System.out.println("Getter Method");
            } else if (method.getName().startsWith("set")){
                System.out.println("Setter Method");
            }

            System.out.println("Return type: " + method.getReturnType());

            Class[] parameterType = method.getParameterTypes();
            System.out.println("Parameters");
            for(Class parameter : parameterType){
                System.out.println(parameter.getName());
            }

            System.out.println();
        }

        Constructor constructor = null;

        Object constructor2 = null;

        try {
            constructor = UFOEnemyShip.class.getConstructor(new Class[]{EnemyPartsFactory.class});

            constructor2 = UFOEnemyShip.class.getConstructor(int.class, String.class).newInstance(12, "Random string");

        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        Class[] constructParameters = constructor.getParameterTypes();
        for(Class parameter : constructParameters){
            System.out.println(parameter.getName());
        }

        UFOEnemyShip newEnemyShip = null;

        EnemyPartsFactory shipFactory = null;

        try {
            newEnemyShip = (UFOEnemyShip) constructor.newInstance(shipFactory);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        newEnemyShip.setName("XP-9000");
        System.out.println("EnemyShip Name: " + newEnemyShip.getName());

        UFOEnemyShip enemyShipPrivate = new UFOEnemyShip(shipFactory);

        try {
            String idCodeString = "idcode";
            Field privateStringName = reflectClass.getDeclaredField(idCodeString);
            privateStringName.setAccessible(true);
            String valueOfName = (String) privateStringName.get(enemyShipPrivate);
            System.out.println("Private field value: " + valueOfName);

            String methodName = "getPrivate";
            Method privateMethod = UFOEnemyShip.class.getDeclaredMethod(methodName, null);
            privateMethod.setAccessible(true);
            String privateMethodReturnValue = (String) privateMethod.invoke(enemyShipPrivate, null );
            System.out.println("EnemyShip Private method: " + privateMethodReturnValue);

            Class[] methodParameters = new Class[]{Integer.TYPE, String.class};
//            Object[] params = new Object[]{new Integer(10), new String("Random")};
            Object[] params = new Object[]{10, "Random"};
            privateMethod = UFOEnemyShip.class.getDeclaredMethod("getOtherPrivate", methodParameters);
            privateMethod.setAccessible(true);
            privateMethodReturnValue = (String) privateMethod.invoke(enemyShipPrivate, params);
            System.out.println("EnemyShip Other Private method: " + privateMethodReturnValue);

        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
