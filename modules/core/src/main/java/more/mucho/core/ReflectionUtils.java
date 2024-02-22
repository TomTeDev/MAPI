package more.mucho.core;


import java.lang.reflect.InvocationTargetException;

public class ReflectionUtils {


    public static Object getFromField(Class clazz, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        return getFromField(clazz,fieldName,null);
    }
    public static Object getFromField(Class clazz,String fieldName,Object param) throws NoSuchFieldException, IllegalAccessException {
        return clazz.getDeclaredField(fieldName).get(param);
    }

    public static Object invokeMethod(Class clazz, String methodName, Class<?> type, String params) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return clazz.getMethod(methodName, type).invoke(params);
    }
}
