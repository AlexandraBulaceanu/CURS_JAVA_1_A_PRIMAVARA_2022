public class A1 {
    class A2 {}
    static class A3 {}
    class A4 extends A3 {}
    class A5 extends A2 {}
    static class A6 extends A3 {}
    static class A7 extends A1 {} // A1 este si clasa outer si este si clasa superioara pt A7
    class A8 extends A1 {} // A1 este si clasa outer si este si clasa superioara pt A8
    //static class A9 extends A2 {} // NU pot sa mostenesc inner non-static din inner static!!!
}