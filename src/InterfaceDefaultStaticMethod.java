public interface InterfaceDefaultStaticMethod {

    // regular abstract method
        void method(String str);

        default void log(String str) {
            System.out.println("I1 logging::" + str);
        }

        static boolean isNull(String str) {
            System.out.println("Interface Null Check");

            return str == null || ("".equals(str));
        }

    }



